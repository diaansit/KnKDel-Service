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

import com.proyek.PulsaService.model.PemesananPulsa;
import com.proyek.PulsaService.service.PemesananPulsaService;



@RestController
@RequestMapping("/pemesananPulsa")
public class PemesananPulsaController {
	@Autowired
	PemesananPulsaService pemesananPulsaService;
	
	@GetMapping("")
	public List<PemesananPulsa> list(){
		return pemesananPulsaService.listAllPemesananPulsa();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PemesananPulsa> get(@PathVariable Integer id){
		try {
			PemesananPulsa pempul= pemesananPulsaService.getPemesananPulsa(id);
			return new ResponseEntity<PemesananPulsa>(pempul, HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<PemesananPulsa>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PemesananPulsa pempul) {
		pemesananPulsaService.savePemesananPulsa(pempul);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody PemesananPulsa pempul, @PathVariable Integer id){
		try {
			PemesananPulsa existPemesananPulsa = pemesananPulsaService.getPemesananPulsa(id);
			pempul.setId(id);
			pemesananPulsaService.savePemesananPulsa(pempul);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesananPulsaService.deletePemesananPulsa(id);
	}
}
