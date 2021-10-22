//--------- Association ----------//

// Class Instansi 
// Mengandung list object dari class Anggota 
// Diasosiasikan dengan class Anggota melalui objectnya

public class Instansi {
	private String nama;
	private int jmlAnggota;
	private Anggota anggota[] = new Anggota[10];
	
	public Instansi(String name) {
		nama = name;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public int getJmlAnggota() {
		return this.jmlAnggota;
	}
	
	public Anggota[] get_Anggota() {
		return this.anggota;
	}
	
	public void addAnggota(Anggota member) {
		if(jmlAnggota < this.anggota.length) {
			anggota[jmlAnggota] = member;
			jmlAnggota++;
		}
	}
	
	// method untuk menampilkan output
	public void Tampil() {
		System.out.println("\nDaftar Anggota Koperasi :");
		System.out.println("\nAsal Instansi : "+getNama());
		System.out.println("Nama Anggota\t ID Anggota");
		
		for(Anggota m : anggota) {
			if(m!= null) {
				System.out.println(""+m.getAnggota() + "\t " +m.getId());
			}
		}
	}
}
