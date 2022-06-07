package com.springboot.RuanganService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.RuanganService.model.Ruangan;
import com.springboot.RuanganService.repository.RuanganRepository;

@Service
@Transactional
public class RuanganService {

	@Autowired
	private RuanganRepository ruanganRepository;
	
	public List<Ruangan> listAllRuangan(){
		return ruanganRepository.findAll();
	}
	public void saveRuangan(Ruangan ruangan) {
		ruanganRepository.save(ruangan);
	}
	public Ruangan getRuangan(Integer id) {
		return ruanganRepository.findById(id).get();
	}
	public void deleteRuangan(Integer id) {
		ruanganRepository.deleteById(id);
	}
}
