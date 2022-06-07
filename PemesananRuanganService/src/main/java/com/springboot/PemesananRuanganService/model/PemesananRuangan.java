package com.springboot.PemesananRuanganService.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pemesanan_ruangan")
public class PemesananRuangan {
	private int id, ruangan_id;
	private String nama_lengkap, email, no_ktp, no_hp;
	private Date tanggal_pemesanan;
	
	public PemesananRuangan() {}
	public PemesananRuangan(int id, int ruangan_id, String nama_lengkap, String email, String no_ktp, String no_hp,
			Date tanggal_pemesanan) {
		super();
		this.id = id;
		this.ruangan_id = ruangan_id;
		this.nama_lengkap = nama_lengkap;
		this.email = email;
		this.no_ktp = no_ktp;
		this.no_hp = no_hp;
		this.tanggal_pemesanan = tanggal_pemesanan;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRuangan_id() {
		return ruangan_id;
	}
	public void setRuangan_id(int ruangan_id) {
		this.ruangan_id = ruangan_id;
	}
	public String getNama_lengkap() {
		return nama_lengkap;
	}
	public void setNama_lengkap(String nama_lengkap) {
		this.nama_lengkap = nama_lengkap;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNo_ktp() {
		return no_ktp;
	}
	public void setNo_ktp(String no_ktp) {
		this.no_ktp = no_ktp;
	}
	public String getNo_hp() {
		return no_hp;
	}
	public void setNo_hp(String no_hp) {
		this.no_hp = no_hp;
	}
	public Date getTanggal_pemesanan() {
		return tanggal_pemesanan;
	}
	public void setTanggal_pemesanan(Date tanggal_pemesanan) {
		this.tanggal_pemesanan = tanggal_pemesanan;
	}
	
	

}
