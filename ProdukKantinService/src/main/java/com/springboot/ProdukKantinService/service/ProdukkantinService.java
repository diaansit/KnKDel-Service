package com.springboot.ProdukKantinService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ProdukKantinService.model.Produkkantin;
import com.springboot.ProdukKantinService.repository.ProdukkantinRepository;


@Service
@Transactional
public class ProdukkantinService {
	@Autowired
	private ProdukkantinRepository produkkantinRepository;
	
	public List<Produkkantin> listAllProdukkantin(){
		return produkkantinRepository.findAll();
	}
	public void saveProdukkantin(Produkkantin produkkantin) {
		produkkantinRepository.save(produkkantin);
	}
	public Produkkantin getProdukkantin(Integer id) {
		return produkkantinRepository.findById(id).get();
	}
	public void deleteProdukkantin(Integer id) {
		produkkantinRepository.deleteById(id);
	}
}
