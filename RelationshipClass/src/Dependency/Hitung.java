package Dependency;

class Persegi{
	public int panjang;
	public int lebar;
	
	public Persegi(){
		this.panjang = 5;
		this.lebar = 8;
	}
	
	public int getPanjang(){
		return this.panjang;
	}
	
	public int getLebar() {
		return this.lebar;
	}
	
}

public class Hitung {
	public static void main(String[] args) {
		Persegi persegi = new Persegi();
		
		persegi.getPanjang();
		persegi.getLebar();

		System.out.println("luas = "+persegi.getPanjang()*persegi.getLebar());
	}
}
