package com.springboot.PemesananKantinService.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pemesanan_kantin")
public class Pemesanankantin {
	private int id,user_id,produkkantin_id,harga,jumlah_barang;
	private String jenis_pembayaran,status_pembayaran;
	private Date tanggal_pemesanan;
	
	public Pemesanankantin() {}

	public Pemesanankantin(int id, int user_id, int produkkantin_id, int harga, int jumlah_barang,
			String jenis_pembayaran, String status_pembayaran, Date tanggal_pemesanan) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.produkkantin_id = produkkantin_id;
		this.harga = harga;
		this.jumlah_barang = jumlah_barang;
		this.jenis_pembayaran = jenis_pembayaran;
		this.status_pembayaran = status_pembayaran;
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProdukkantin_id() {
		return produkkantin_id;
	}

	public void setProdukkantin_id(int produkkantin_id) {
		this.produkkantin_id = produkkantin_id;
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

	public Date getTanggal_pemesanan() {
		return tanggal_pemesanan;
	}

	public void setTanggal_pemesanan(Date tanggal_pemesanan) {
		this.tanggal_pemesanan = tanggal_pemesanan;
	}



	public int getJumlah_barang() {
		return jumlah_barang;
	}



	public void setJumlah_barang(int jumlah_barang) {
		this.jumlah_barang = jumlah_barang;
	};
	
	
	
	
}
