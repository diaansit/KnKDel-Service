package com.springboot.PemesananRuanganService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.PemesananRuanganService.model.PemesananRuangan;
import com.springboot.PemesananRuanganService.repository.PemesananRuanganRepository;

@Service
@Transactional
public class PemesananRuanganService {

	@Autowired
	private PemesananRuanganRepository pemesananruanganRepository;
	
	public List<PemesananRuangan> listAllPemesananRuangan(){
		return pemesananruanganRepository.findAll();
	}
	
	public void savePemesananRuangan (PemesananRuangan pemesananruangan) {
		pemesananruanganRepository.save(pemesananruangan);
	}
	public PemesananRuangan getPemesananruangan(Integer id) {
		return pemesananruanganRepository.findById(id).get();
	}
	public void deletePemesananruangan(Integer id) {
		pemesananruanganRepository.deleteById(id);
	}
	
}
