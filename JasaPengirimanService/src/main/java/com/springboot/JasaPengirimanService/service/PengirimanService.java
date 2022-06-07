package com.springboot.JasaPengirimanService.service;

import java.util.List;

import javax.transaction.Transactional;
import com.springboot.JasaPengirimanService.repository.*;
import com.springboot.JasaPengirimanService.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PengirimanService {
	@Autowired
	private PengirimanRepository kirimRepository;
	
	public List<JasaPengiriman> listAllPengiriman(){
		return kirimRepository.findAll();
	}
	
	public void savePengiriman(JasaPengiriman kirim) {
		kirimRepository.save(kirim);
	}
	
	public JasaPengiriman getPengiriman(Integer id) {
		return kirimRepository.findById(id).get();
	}
	
	public void deletePengiriman(Integer id) {
		kirimRepository.deleteById(id);
	}
}

