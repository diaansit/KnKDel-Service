package com.proyek.ProdukKoperasiService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produk_koperasi")
public class ProdukKoperasi {
	private int id;
	private String nama_produk;
	private String jenis_produk;
	private int harga;
	
	public ProdukKoperasi() {}

	public ProdukKoperasi(int id, String nama_produk, String jenis_produk, int harga) {
		super();
		this.id = id;
		this.nama_produk = nama_produk;
		this.jenis_produk = jenis_produk;
		this.harga = harga;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaProduk() {
		return nama_produk;
	}

	public void setNamaProduk(String nama_produk) {
		this.nama_produk = nama_produk;
	}

	public String getJenisProduk() {
		return jenis_produk;
	}

	public void setJenisProduk(String jenis_produk) {
		this.jenis_produk = jenis_produk;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	
}
