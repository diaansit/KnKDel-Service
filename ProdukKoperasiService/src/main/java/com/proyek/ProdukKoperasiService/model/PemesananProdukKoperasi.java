package com.proyek.ProdukKoperasiService.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pemesanan_koperasi")
public class PemesananProdukKoperasi {
	private int id;
	private int user_id;
	private int produkkoperasi_id;
	private Date tanggal_pemesanan;
	private int harga;
	private int jumlah_barang;
	private String jenis_pembayaran;
	private String status_pembayaran;
	
	public PemesananProdukKoperasi() {}

	public PemesananProdukKoperasi(int id, int user_id, int produkkoperasi_id, Date tanggal_pemesanan, int harga,
			int jumlah_barang, String jenis_pembayaran, String status_pembayaran) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.produkkoperasi_id = produkkoperasi_id;
		this.tanggal_pemesanan = tanggal_pemesanan;
		this.harga = harga;
		this.jumlah_barang = jumlah_barang;
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

	public int getProdukkoperasi_id() {
		return produkkoperasi_id;
	}

	public void setProdukkoperasi_id(int produkkoperasi_id) {
		this.produkkoperasi_id = produkkoperasi_id;
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

	public int getJumlah_barang() {
		return jumlah_barang;
	}

	public void setJumlah_barang(int jumlah_barang) {
		this.jumlah_barang = jumlah_barang;
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
