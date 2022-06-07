package com.springboot.JasaPengirimanService.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jasa_pengiriman")
public class JasaPengiriman {

	private int id;
	private String nama_lengkap;
	private String alamat_tujuan;
	private String alamat_pengirim;
	private String nomor_hp_penerima;
	private String deskripsi_paket;
	private int harga_pengiriman;
	private int status_pengiriman;
	private Date tanggal_transaksi;
	private int user_id;
	public JasaPengiriman() {
		
	}
	public JasaPengiriman(String nama_lengkap, String alamat_tujuan, String alamat_pengirim,
			String nomor_hp_penerima, String deskripsi_paket, int harga_pengiriman, int status_pengiriman,
			Date tanggal_transaksi, int user_id) {
		this.nama_lengkap = nama_lengkap;
		this.alamat_tujuan = alamat_tujuan;
		this.alamat_pengirim = alamat_pengirim;
		this.nomor_hp_penerima = nomor_hp_penerima;
		this.deskripsi_paket = deskripsi_paket;
		this.harga_pengiriman = harga_pengiriman;
		this.status_pengiriman = status_pengiriman;
		this.tanggal_transaksi = tanggal_transaksi;
		this.user_id = user_id;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama_Lengkap() {
		return nama_lengkap;
	}
	public void setNama_Lengkap(String nama_lengkap) {
		this.nama_lengkap = nama_lengkap;
	}
	public String getAlamat_tujuan() {
		return alamat_tujuan;
	}
	public void setAlamat_tujuan(String alamat_tujuan) {
		this.alamat_tujuan = alamat_tujuan;
	}
	public String getAlamat_pengirim() {
		return alamat_pengirim;
	}
	public void setAlamat_pengirim(String alamat_pengirim) {
		this.alamat_pengirim = alamat_pengirim;
	}
	public String getNomor_hp_penerima() {
		return nomor_hp_penerima;
	}
	public void setNomor_hp_penerima(String nomor_hp_penerima) {
		this.nomor_hp_penerima = nomor_hp_penerima;
	}
	public String getDeskripsi_paket() {
		return deskripsi_paket;
	}
	public void setDeskripsi_paket(String deskripsi_paket) {
		this.deskripsi_paket = deskripsi_paket;
	}
	public int getHarga_pengiriman() {
		return harga_pengiriman;
	}
	public void setHarga_pengiriman(int harga_pengiriman) {
		this.harga_pengiriman = harga_pengiriman;
	}
	public int getStatus_pengiriman() {
		return status_pengiriman;
	}
	public void setStatus_pengiriman(int status_pengiriman) {
		this.status_pengiriman = status_pengiriman;
	}
	public Date getTanggal_transaksi() {
		return tanggal_transaksi;
	}
	public void setTanggal_transaksi(Date tanggal_transaksi) {
		this.tanggal_transaksi = tanggal_transaksi;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
}
