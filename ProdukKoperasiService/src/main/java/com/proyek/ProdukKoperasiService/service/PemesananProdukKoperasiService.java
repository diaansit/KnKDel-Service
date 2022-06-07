package com.proyek.ProdukKoperasiService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyek.ProdukKoperasiService.model.PemesananProdukKoperasi;
import com.proyek.ProdukKoperasiService.repository.PemesananProdukKoperasiRepository;



@Service
@Transactional
public class PemesananProdukKoperasiService {
	@Autowired
	private PemesananProdukKoperasiRepository pemesananProdukKoperasiRepository;
	
	public List<PemesananProdukKoperasi> listAllPemesananProdukKoperasi(){
		return pemesananProdukKoperasiRepository.findAll();
	}
	
	public void savePemesananProdukKoperasi(PemesananProdukKoperasi pemesananProdukKoperasi) {
		pemesananProdukKoperasiRepository.save(pemesananProdukKoperasi);
	}
	
	public PemesananProdukKoperasi getPemesananProdukKoperasi(Integer id) {
		return pemesananProdukKoperasiRepository.findById(id).get();
	}
	
	public void deletePemesananProdukKoperasi(Integer id) {
		pemesananProdukKoperasiRepository.deleteById(id);
	}
}
