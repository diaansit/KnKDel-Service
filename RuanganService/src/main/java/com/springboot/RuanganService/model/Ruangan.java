package com.springboot.RuanganService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ruangan")
public class Ruangan {

	private int id, status;
	private String nama_ruangan, lokasi;
	
	public Ruangan() {}
	public Ruangan(int id, int status, String nama_ruangan, String lokasi) {
		super();
		this.id = id;
		this.status = status;
		this.nama_ruangan = nama_ruangan;
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
	public String getNama_ruangan() {
		return nama_ruangan;
	}
	public void setNama_ruangan(String nama_ruangan) {
		this.nama_ruangan = nama_ruangan;
	}
	public String getLokasi() {
		return lokasi;
	}
	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}
	
}
