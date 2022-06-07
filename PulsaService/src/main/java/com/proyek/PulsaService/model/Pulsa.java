package com.proyek.PulsaService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pulsa")
public class Pulsa {
	private int id;
	private int harga_pulsa;
	
	public Pulsa() {}

	public Pulsa(int id, int harga_pulsa) {
		super();
		this.id = id;
		this.harga_pulsa = harga_pulsa;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHarga_pulsa() {
		return harga_pulsa;
	}

	public void setHarga_pulsa(int harga_pulsa) {
		this.harga_pulsa = harga_pulsa;
	}
	
	
}
