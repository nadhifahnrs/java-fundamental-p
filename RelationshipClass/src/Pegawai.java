//--------- Association ----------//

// Class nama koperasi
class BadanKop {
	private String nama;
	
	// setter dan getter
	public BadanKop(String name){
		this.nama = name;
	}
	
	public String getKoperasi(){
		return this.nama;
	}
}

// Class pegawai
public class Pegawai {
	private String nama;
	
	public String getPegawai() {
		return this.nama;
	}
	
	public Pegawai(String name){
		this.nama = name;
	}
}
