package com.springboot.TempatDudukService2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.NoSuchElementException;

import com.springboot.TempatDudukService2.model.Tempatduduk;
import com.springboot.TempatDudukService2.service.TempatdudukService;

@RestController
@RequestMapping("/tempatduduk")
public class TempatdudukController {

	@Autowired
	TempatdudukService tempatdudukService;
	@GetMapping("")
	public List <Tempatduduk> list(){
		return tempatdudukService.listAllTempatduduk();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tempatduduk> get(@PathVariable Integer id){
		try {
			Tempatduduk tempatduduk = tempatdudukService.getTempatduduk(id);
			return new ResponseEntity<Tempatduduk>(tempatduduk, HttpStatus.OK);
		}catch (NoSuchElementException e){
			return new ResponseEntity<Tempatduduk>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	@PostMapping("/")
	public void add(@RequestBody Tempatduduk tempatduduk) {
		tempatdudukService.saveTempatduduk(tempatduduk);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody Tempatduduk tempatduduk, @PathVariable Integer id){
		try {
			Tempatduduk existTempatduduk = tempatdudukService.getTempatduduk(id);
			tempatduduk.setId(id);
			tempatdudukService.saveTempatduduk(tempatduduk);
			return new ResponseEntity<>(HttpStatus.OK);		
		}catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		tempatdudukService.deleteTempatduduk(id);
	}
	
}
