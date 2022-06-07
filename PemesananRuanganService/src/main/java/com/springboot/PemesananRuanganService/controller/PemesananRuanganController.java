package com.springboot.PemesananRuanganService.controller;

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

import com.springboot.PemesananRuanganService.model.PemesananRuangan;
import com.springboot.PemesananRuanganService.service.PemesananRuanganService;


@RestController
@RequestMapping("/pemesananruangan")
public class PemesananRuanganController {

	@Autowired
	PemesananRuanganService pemesananruanganService;
	
	@GetMapping("")
	public List<PemesananRuangan> list(){
		return pemesananruanganService.listAllPemesananRuangan();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PemesananRuangan> get(@PathVariable Integer id){
		try {
			PemesananRuangan pemesananruangan = pemesananruanganService.getPemesananruangan(id);
			return new ResponseEntity<PemesananRuangan>(pemesananruangan, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<PemesananRuangan>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add (@RequestBody PemesananRuangan pemesananruangan) {
		pemesananruanganService.savePemesananRuangan(pemesananruangan);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?>update (@RequestBody PemesananRuangan pemesananruangan, @PathVariable Integer id){
		try {
			PemesananRuangan existPemesananruangan = pemesananruanganService.getPemesananruangan(id);
			pemesananruangan.setId(id);
			pemesananruanganService.savePemesananRuangan(pemesananruangan);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesananruanganService.deletePemesananruangan(id);
	}
	
}
