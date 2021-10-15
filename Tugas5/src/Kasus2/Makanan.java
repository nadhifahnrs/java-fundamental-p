package Kasus2;

public class Makanan {
	/* Menset semua atribut data menjadi "private" */
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	//private static byte id=0;
	
	public Makanan(String nama, double harga, int stok) {
		this.nama_makanan = nama;
		this.harga_makanan = harga;
		this.stok = stok;
	}
	
	public String getNama() {
		return this.nama_makanan;
	}
	
	public void setNama(String namaMakanan) {
		this.nama_makanan= namaMakanan;
	}
	
	public double getHarga() {
		return this.harga_makanan;
	}
	
	public void setNama(double hargaMakanan) {
		this.harga_makanan= hargaMakanan;
	}
	
	public int getStock() {
		return stok;
	}
	
	public void sisaStok(int stokk) {
		this.stok = stok - stokk;
	}
}
