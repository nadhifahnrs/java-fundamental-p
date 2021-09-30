import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		/*Agent akan menerima gaji pokok sebesar Rp.500.000,00 perbulan. 
		 * Agent akan menerima bonus penjualan sebesar 25% dari total penjualan item 
		   jika berhasil menjual minimal 40 item. 
		 * Agent akan menerima bonus penjualan 35% dari total penjualan jika berhasil menjual diatas 80 item. 
		 * Namun, Jika Agent menjual dibawah 15 item akan menerima denda pemotongan gajih pokok sebesar 15% 
		   dari total minus penjualan ke 15 item. 
		 * Selain itu agen hanya menerima bonus 10% setiap itemnya. Harga setiap item adalah Rp. 50.000,00
		 * */
		int bonuspenjualan1, bonuspenjualan2, bonuspenjualan3, potongangaji;
		int totgaji, totgaji2, totgaji3, totgaji4;
		
		Scanner input = new Scanner(System.in);
		int gaji = 500000;	// gaji perbulan
		
		System.out.print("Jumlah penjualan bulan ini : ");
		int totItem = input.nextInt();
		
		int totharga = totItem*50000;
		
		// Agent menjual minimal 40 item
		if(totItem >= 40) {
			bonuspenjualan1 = totharga/100*25;
			totgaji = gaji+bonuspenjualan1;
			System.out.println(totgaji);
		}
		// Agent menjual lebih dari 80 item
		else if(totItem > 80) {
			bonuspenjualan2 = totharga/100*35;
			totgaji2 = gaji+bonuspenjualan2;
			System.out.println(totgaji2);
		}
		// Agent menjual lebih dari sama dengan 15 item sampai 39 item
		else if(totItem >= 15 && totItem < 40) {
			bonuspenjualan3 = totharga/100*10;
			totgaji3 = gaji+bonuspenjualan3;
			System.out.println(totgaji3);
		}
		// Agent menjual kurang dari 15 item
		else if(totItem < 15) {
			potongangaji = ((15*50000)-(totItem*50000))/100*15; //(minus penjualan 15 item - total harga penjualan bulan ini) dibagi 100 kali 15%
			totgaji4 = gaji-potongangaji;
			System.out.println(totgaji4); 
		}
		input.close();
		
	}
}
