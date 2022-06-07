package com.springboot.PemesananKantinService.controller;

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

import com.springboot.PemesananKantinService.model.Pemesanankantin;
import com.springboot.PemesananKantinService.service.PemesanankantinService;


@RestController
@RequestMapping("/pemesanankantin")
public class PemesanankantinController {
	@Autowired
	PemesanankantinService pemesanankantinService;
	
	@GetMapping("")
	public List <Pemesanankantin> list(){
		return pemesanankantinService.listAllPemesanankantin();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pemesanankantin> get(@PathVariable Integer id){
		try {
			Pemesanankantin pemesanankantin = pemesanankantinService.getPemesanankantin(id);
			return new ResponseEntity<Pemesanankantin>(pemesanankantin, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<Pemesanankantin>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add (@RequestBody Pemesanankantin pemesanankantin) {
		pemesanankantinService.savePemesanankantin(pemesanankantin);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody Pemesanankantin pemesanankantin, @PathVariable Integer id){
		try {
			Pemesanankantin existPemesanankantin = pemesanankantinService.getPemesanankantin(id);
			pemesanankantin.setId(id);
			pemesanankantinService.savePemesanankantin(pemesanankantin);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesanankantinService.deletePemesanankantin(id);
	}
}
