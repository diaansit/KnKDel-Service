package com.springboot.TempatDudukService2.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.TempatDudukService2.model.Tempatduduk;
import com.springboot.TempatDudukService2.repository.TempatdudukRepository;


@Service
@Transactional
public class TempatdudukService {

	@Autowired
	private TempatdudukRepository tempatdudukRepository;
	
	public List<Tempatduduk> listAllTempatduduk(){
		return tempatdudukRepository.findAll();
	}
	public void saveTempatduduk(Tempatduduk tempatduduk) {
		tempatdudukRepository.save(tempatduduk);
	}
	public Tempatduduk getTempatduduk(Integer id) {
		return tempatdudukRepository.findById(id).get();
	}
	public void deleteTempatduduk(Integer id) {
		tempatdudukRepository.deleteById(id);
	}
	
}
