package com.proyek.PulsaService.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyek.PulsaService.model.Pulsa;
import com.proyek.PulsaService.service.PulsaService;



@RestController
@RequestMapping("/pulsa")
public class PulsaController {
	@Autowired
	PulsaService pulsaService;
	
	@GetMapping("")
	public List<Pulsa> list(){
		return pulsaService.listAllPulsa();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pulsa> get(@PathVariable Integer id){
		try {
			Pulsa pul= pulsaService.getPulsa(id);
			return new ResponseEntity<Pulsa>(pul, HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Pulsa>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody Pulsa pul) {
		pulsaService.savePulsa(pul);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Pulsa pul, @PathVariable Integer id){
		try {
			Pulsa existPulsa = pulsaService.getPulsa(id);
			pul.setId(id);
			pulsaService.savePulsa(pul);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pulsaService.deletePulsa(id);
	}
}
