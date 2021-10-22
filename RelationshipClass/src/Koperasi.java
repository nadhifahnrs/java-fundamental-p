//------ Relasi Class terkait Association dan Aggregation ------//

// main method
public class Koperasi {
	public static void main (String[] args) {
		
		/* Association */
		BadanKop koperasi = new BadanKop("Koperasi Bungarajar");
		Pegawai pegawai = new Pegawai("Cecep Munawar");
		
		System.out.println("\t\t\t" + koperasi.getKoperasi() + 
		"\n\t\t       Milik : " + pegawai.getPegawai());
		
		/* Aggregation */
		Instansi instansi = new Instansi("Pt. Molto");
		
		Anggota a_1 = new Anggota();
		a_1.setAnggota("Aprilia Suci");
		a_1.setId(201);
		
		Anggota a_2 = new Anggota();
		a_2.setAnggota("Boy Megantara");
		a_2.setId(202);
		
		Anggota a_3 = new Anggota();
		a_3.setAnggota("Dinda Kania");
		a_3.setId(205);
		
		Anggota a_4 = new Anggota();
		a_4.setAnggota("Ferdian Haris");
		a_4.setId(206);
		
		Anggota a_5 = new Anggota();
		a_5.setAnggota("Putra Surya");
		a_5.setId(208);
		
		instansi.addAnggota(a_1);
		instansi.addAnggota(a_2);
		instansi.addAnggota(a_3);
		instansi.addAnggota(a_4);
		instansi.addAnggota(a_5);
		
		instansi.Tampil();
		
	}
}
