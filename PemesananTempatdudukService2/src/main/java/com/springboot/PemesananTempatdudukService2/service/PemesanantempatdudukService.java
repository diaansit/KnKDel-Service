package com.springboot.PemesananTempatdudukService2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.PemesananTempatdudukService2.model.Pemesanantempatduduk;
import com.springboot.PemesananTempatdudukService2.repository.PemesanantempatdudukRepository;

@Service
@Transactional
public class PemesanantempatdudukService {

	@Autowired
	private PemesanantempatdudukRepository pemesanantempatdudukRepository;
	
	public List<Pemesanantempatduduk> listAllPemesanantempatduduk(){
		return pemesanantempatdudukRepository.findAll();
	}
	
	public void savePemesanantempatduduk (Pemesanantempatduduk pemesanantempatduduk) {
		pemesanantempatdudukRepository.save(pemesanantempatduduk);
	}
	public Pemesanantempatduduk getPemesanantempatduduk(Integer id) {
		return pemesanantempatdudukRepository.findById(id).get();
	}
	public void deletePemesanantempatduduk(Integer id) {
		pemesanantempatdudukRepository.deleteById(id);
	}
	
	
}
