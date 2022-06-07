package com.springboot.RuanganService.controller;
import java.util.List;
import java.util.NoSuchElementException;

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

import com.springboot.RuanganService.model.Ruangan;
import com.springboot.RuanganService.service.RuanganService;

@RestController
@RequestMapping("/ruangan")
public class RuanganController {

	@Autowired
	RuanganService ruanganService;
	@GetMapping("")
	public List<Ruangan> list(){
		return ruanganService.listAllRuangan();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Ruangan>get(@PathVariable Integer id){
		try {
			Ruangan ruangan = ruanganService.getRuangan(id);
			return new ResponseEntity<Ruangan>(ruangan, HttpStatus.OK);	
		}catch (NoSuchElementException e) {
			return new ResponseEntity<Ruangan>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/")
	public void add(@RequestBody Ruangan ruangan) {
		ruanganService.saveRuangan(ruangan);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?>update(@RequestBody Ruangan ruangan, @PathVariable Integer id){
		try {
			Ruangan existRuangan = ruanganService.getRuangan(id);
			ruangan.setId(id);
			ruanganService.saveRuangan(ruangan);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		ruanganService.deleteRuangan(id);
	}
}