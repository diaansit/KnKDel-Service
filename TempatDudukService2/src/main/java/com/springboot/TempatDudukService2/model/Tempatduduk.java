package com.springboot.TempatDudukService2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tempat_duduk")
public class Tempatduduk {

	private int id, status;
	private String lokasi;
	
	public Tempatduduk() {}

	public Tempatduduk(int id, int status, String lokasi) {
		super();
		this.id = id;
		this.status = status;
		this.lokasi = lokasi;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getLokasi() {
		return lokasi;
	}

	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}
	
	
}
