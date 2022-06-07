package com.proyek.ProdukKoperasiService.controller;

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

import com.proyek.ProdukKoperasiService.model.PemesananProdukKoperasi;
import com.proyek.ProdukKoperasiService.service.PemesananProdukKoperasiService;



@RestController
@RequestMapping("/pemesananProdukKoperasi")
public class PemesananProdukKoperasiController {
	@Autowired
	PemesananProdukKoperasiService pemesananProdukKoperasiService;
	
	@GetMapping("")
	public List<PemesananProdukKoperasi> list(){
		return pemesananProdukKoperasiService.listAllPemesananProdukKoperasi();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PemesananProdukKoperasi> get(@PathVariable Integer id){
		try {
			PemesananProdukKoperasi pem= pemesananProdukKoperasiService.getPemesananProdukKoperasi(id);
			return new ResponseEntity<PemesananProdukKoperasi>(pem, HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<PemesananProdukKoperasi>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PemesananProdukKoperasi pem) {
		pemesananProdukKoperasiService.savePemesananProdukKoperasi(pem);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody PemesananProdukKoperasi pem, @PathVariable Integer id){
		try {
			PemesananProdukKoperasi existPemesananProdukKoperasi = pemesananProdukKoperasiService.getPemesananProdukKoperasi(id);
			pem.setId(id);
			pemesananProdukKoperasiService.savePemesananProdukKoperasi(pem);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesananProdukKoperasiService.deletePemesananProdukKoperasi(id);
	}
}
