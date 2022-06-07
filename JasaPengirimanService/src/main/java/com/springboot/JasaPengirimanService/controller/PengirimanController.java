package com.springboot.JasaPengirimanService.controller;

import com.springboot.JasaPengirimanService.model.*;
import com.springboot.JasaPengirimanService.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;
@RestController
@RequestMapping("/pengiriman")
public class PengirimanController {
	@Autowired
	PengirimanService kirimService;
	
	@GetMapping("/ambilSemua")
	public List<JasaPengiriman> list(){
		return kirimService.listAllPengiriman();
	}
	
	@GetMapping("/ambilById/{id}")
	public ResponseEntity<JasaPengiriman> get(@PathVariable Integer id){
		try {
			JasaPengiriman kirim = kirimService.getPengiriman(id);
			return new ResponseEntity<JasaPengiriman>(kirim, HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<JasaPengiriman>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/tambah")
	public void add(@RequestBody JasaPengiriman kirim) {
		kirimService.savePengiriman(kirim);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@RequestBody JasaPengiriman kirim, @PathVariable Integer id){
		try {
			kirim.setId(id);
			kirimService.savePengiriman(kirim);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/hapus/{id}")
	public void delete(@PathVariable Integer id) {
		kirimService.deletePengiriman(id);
	}
}
