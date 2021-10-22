package Composition;

import java.util.*;

// Class produk
class Produk{
	public String nama_produk;
	public int stok_produk;
	public int harga_produk;
	
	Produk(String nama_produk, int stok_produk, int harga_produk){
		this.nama_produk = nama_produk;
		this.stok_produk = stok_produk;
		this.harga_produk = harga_produk;
	}
}

// Class nama warung
class Nama_warung{
	private String nama_warung;
	
	public String getNama() {
		return this.nama_warung;
	}
	Nama_warung(String nama){
		this.nama_warung = nama;
	}
}

// Class list produk warung
public class Warung {
	private final List<Produk> produk;
	
	Warung(List<Produk> produk){
		this.produk = produk;
	}
	
	public List<Produk> getProduk(){
		return produk;
	}
}
