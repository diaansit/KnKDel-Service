package com.proyek.PulsaService.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pemesanan_pulsa")
public class PemesananPulsa {
	private int id;
	private int user_id;
	private int produkpulsa_id;
	private Date tanggal_pemesanan;
	private int harga;
	private String jenis_pembayaran;
	private String status_pembayaran;
	
	public PemesananPulsa() {}

	public PemesananPulsa(int id, int user_id, int produkpulsa_id, Date tanggal_pemesanan, int harga,
			String jenis_pembayaran, String status_pembayaran) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.produkpulsa_id = produkpulsa_id;
		this.tanggal_pemesanan = tanggal_pemesanan;
		this.harga = harga;
		this.jenis_pembayaran = jenis_pembayaran;
		this.status_pembayaran = status_pembayaran;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProdukpulsa_id() {
		return produkpulsa_id;
	}

	public void setProdukpulsa_id(int produkpulsa_id) {
		this.produkpulsa_id = produkpulsa_id;
	}

	public Date getTanggal_pemesanan() {
		return tanggal_pemesanan;
	}

	public void setTanggal_pemesanan(Date tanggal_pemesanan) {
		this.tanggal_pemesanan = tanggal_pemesanan;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public String getJenis_pembayaran() {
		return jenis_pembayaran;
	}

	public void setJenis_pembayaran(String jenis_pembayaran) {
		this.jenis_pembayaran = jenis_pembayaran;
	}

	public String getStatus_pembayaran() {
		return status_pembayaran;
	}

	public void setStatus_pembayaran(String status_pembayaran) {
		this.status_pembayaran = status_pembayaran;
	}

	
	
	
}
