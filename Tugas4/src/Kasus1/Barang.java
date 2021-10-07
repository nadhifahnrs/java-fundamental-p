package Kasus1;

public class Barang {
	String kode_barang;
	String nama_barang;
	int stok;
			
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}

	// SOLUSI // 
	// melakukan read only dengan menggunakan getter
	public int getstok(){
		return stok + 20;
	}

}
