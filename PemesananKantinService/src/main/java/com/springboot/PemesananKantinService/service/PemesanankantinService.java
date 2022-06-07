package com.springboot.PemesananKantinService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.PemesananKantinService.repository.PemesanankantinRepository;
import com.springboot.PemesananKantinService.model.Pemesanankantin;

@Service
@Transactional
public class PemesanankantinService {
	@Autowired
	private PemesanankantinRepository pemesanankantinRepository;
	
	public List<Pemesanankantin> listAllPemesanankantin(){
		return pemesanankantinRepository.findAll();
	}
	
	public void savePemesanankantin (Pemesanankantin pemesanankantin) {
		pemesanankantinRepository.save(pemesanankantin);
	}
	
	public Pemesanankantin getPemesanankantin(Integer id) {
		return pemesanankantinRepository.findById(id).get();
	}
	
	public void deletePemesanankantin(Integer id) {
		pemesanankantinRepository.deleteById(id);
	}
}
