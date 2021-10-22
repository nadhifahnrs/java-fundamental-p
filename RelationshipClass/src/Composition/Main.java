package Composition;

import java.util.*;

// main method

public class Main {
	public static void main(String[] args) {
	
	Nama_warung warung = new Nama_warung("Ceria");
	
	Produk _1 = new Produk("Kopi Sachet",50,2000);
	Produk _2 = new Produk("Indomie Kuah",100,2500);
	Produk _3 = new Produk("Indomie Goreng",200,2000);
	Produk _4 = new Produk("Coki-coki",150,1000);
	Produk _5 = new Produk("Keripik Pedas",200,3000);

	// Membuat list produk yang terdiri dari nama_produk, stok_produk, dan harga_produk
	List<Produk> produk = new ArrayList<Produk>();
	produk.add(_1);
	produk.add(_2);
	produk.add(_3);
	produk.add(_4);
	produk.add(_5);
	
	System.out.println("Warung : " + warung.getNama());
	System.out.println("\nNama Produk\t\tStok\t\tHarga");
	System.out.println("---------------------------------------------");
	
	Warung toko_warung = new Warung(produk);
	
	List<Produk> produkk = toko_warung.getProduk();
		for(Produk barang : produkk) {
			System.out.println(""+barang.nama_produk + "\t\t" + barang.stok_produk + "\t\t" + barang.harga_produk);
		
		}
	}

}
