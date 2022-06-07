package com.springboot.ProdukKantinService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produk_kantin")
public class Produkkantin {
	private int id,harga;
	private String nama_produk,jenis_produk;
	
	public Produkkantin() {}
	
	public Produkkantin(int id, int harga, String nama_produk, String jenis_produk) {
		super();
		this.id = id;
		this.harga = harga;
		this.nama_produk = nama_produk;
		this.jenis_produk = jenis_produk;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}

	public String getJenis_produk() {
		return jenis_produk;
	}

	public void setJenis_produk(String jenis_produk) {
		this.jenis_produk = jenis_produk;
	}
	
	
	
}
