package Kasus2;

public class Restaurant {

//	public static byte id=0;
	private Makanan[] menuMakanan;
	
	private static byte id=0;
	
	Restaurant(){
		menuMakanan = new Makanan[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.menuMakanan[id] = new Makanan(nama,harga,stok);
//		this.harga_makanan[id] = harga;
//		this.stok[id] = stok;
	}
	
	public void tampilMenuMakanan(){
		for(int i =0; i<=id;i++){
			if(!isOutOfStock(i)){
				System.out.println(menuMakanan[i].getNama() +"["+menuMakanan[i].getStock()+"]"+"\tRp. "+menuMakanan[i].getHarga());
			}
		}
	}
	
	public boolean isOutOfStock(int id){
		if(menuMakanan[id].getStock() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static void nextId(){
		id++;
	}
}