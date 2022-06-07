package com.springboot.ProdukKantinService.controller;

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

import com.springboot.ProdukKantinService.model.Produkkantin;
import com.springboot.ProdukKantinService.service.ProdukkantinService;


@RestController
@RequestMapping("/produkkantin")
public class ProdukkantinController {
	@Autowired
	ProdukkantinService produkkantinService;
	@GetMapping("")
	public List <Produkkantin> list(){
		return produkkantinService.listAllProdukkantin();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produkkantin> get(@PathVariable Integer id){
		try {
			Produkkantin produkkantin = produkkantinService.getProdukkantin(id);
			return new ResponseEntity<Produkkantin>(produkkantin, HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<Produkkantin>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody Produkkantin produkkantin) {
		produkkantinService.saveProdukkantin(produkkantin);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody Produkkantin produkkantin, @PathVariable Integer id) {
		try {
			Produkkantin existProdukkantin = produkkantinService.getProdukkantin(id);
			produkkantin.setId(id);
			produkkantinService.saveProdukkantin(produkkantin);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		produkkantinService.deleteProdukkantin(id);
	}
}
