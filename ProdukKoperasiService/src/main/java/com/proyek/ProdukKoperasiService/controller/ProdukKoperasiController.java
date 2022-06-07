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

import com.proyek.ProdukKoperasiService.model.ProdukKoperasi;
import com.proyek.ProdukKoperasiService.service.ProdukKoperasiService;

@RestController
@RequestMapping("/produkKoperasi")
public class ProdukKoperasiController {
	
	@Autowired
	ProdukKoperasiService produkKoperasiService;
	
	@GetMapping("")
	public List<ProdukKoperasi> list(){
		return produkKoperasiService.listAllProdukKoperasi();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdukKoperasi> get(@PathVariable Integer id){
		try {
			ProdukKoperasi pro= produkKoperasiService.getProdukKoperasi(id);
			return new ResponseEntity<ProdukKoperasi>(pro, HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<ProdukKoperasi>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody ProdukKoperasi pro) {
		produkKoperasiService.saveProdukKoperasi(pro);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody ProdukKoperasi pro, @PathVariable Integer id){
		try {
			ProdukKoperasi existProdukKoperasi = produkKoperasiService.getProdukKoperasi(id);
			pro.setId(id);
			produkKoperasiService.saveProdukKoperasi(pro);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		produkKoperasiService.deleteProdukKoperasi(id);
	}
}
