package com.springboot.PemesananTempatdudukService2.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.PemesananTempatdudukService2.model.Pemesanantempatduduk;
import com.springboot.PemesananTempatdudukService2.service.PemesanantempatdudukService;

@RestController
@RequestMapping("/pemesanantempatduduk")
public class PemesanantempatdudukController {

	@Autowired
	PemesanantempatdudukService pemesanantempatdudukService;
	
	@GetMapping("")
	public List<Pemesanantempatduduk>list(){
		return pemesanantempatdudukService.listAllPemesanantempatduduk();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Pemesanantempatduduk> get(@PathVariable Integer id){
		try {
			Pemesanantempatduduk pemesanantempatduduk = pemesanantempatdudukService.getPemesanantempatduduk(id);
			return new ResponseEntity<Pemesanantempatduduk>(pemesanantempatduduk, HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<Pemesanantempatduduk>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add (@RequestBody Pemesanantempatduduk pemesanantempatduduk) {
		pemesanantempatdudukService.savePemesanantempatduduk(pemesanantempatduduk);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?>update(@RequestBody Pemesanantempatduduk pemesanantempatduduk, @PathVariable Integer id){
		try {
			Pemesanantempatduduk existPemesanantempatduduk = pemesanantempatdudukService.getPemesanantempatduduk(id);
			pemesanantempatduduk.setId(id);
			pemesanantempatdudukService.savePemesanantempatduduk(pemesanantempatduduk);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesanantempatdudukService.deletePemesanantempatduduk(id);
	}
	
}
