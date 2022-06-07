package com.proyek.ProdukKoperasiService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyek.ProdukKoperasiService.model.ProdukKoperasi;
import com.proyek.ProdukKoperasiService.repository.ProdukKoperasiRepository;



@Service
@Transactional
public class ProdukKoperasiService {
	@Autowired
	private ProdukKoperasiRepository produkKoperasiRepository;
	
	public List<ProdukKoperasi> listAllProdukKoperasi(){
		return produkKoperasiRepository.findAll();
	}
	
	public void saveProdukKoperasi(ProdukKoperasi produkKoperasi) {
		produkKoperasiRepository.save(produkKoperasi);
	}
	
	public ProdukKoperasi getProdukKoperasi(Integer id) {
		return produkKoperasiRepository.findById(id).get();
	}
	
	public void deleteProdukKoperasi(Integer id) {
		produkKoperasiRepository.deleteById(id);
	}
}
