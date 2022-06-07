package com.proyek.PulsaService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyek.PulsaService.model.PemesananPulsa;
import com.proyek.PulsaService.repository.PemesananPulsaRepository;


@Service
@Transactional
public class PemesananPulsaService {
	@Autowired
	private PemesananPulsaRepository pemesananPulsaRepository;
	
	public List<PemesananPulsa> listAllPemesananPulsa(){
		return pemesananPulsaRepository.findAll();
	}
	
	public void savePemesananPulsa(PemesananPulsa pemesananPulsa) {
		pemesananPulsaRepository.save(pemesananPulsa);
	}
	
	public PemesananPulsa getPemesananPulsa(Integer id) {
		return pemesananPulsaRepository.findById(id).get();
	}
	
	public void deletePemesananPulsa(Integer id) {
		pemesananPulsaRepository.deleteById(id);
	}
}
