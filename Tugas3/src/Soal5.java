import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
//		long mobil1, mobil2, mobil3, mobil4;
		long total;
		Scanner input = new Scanner(System.in);
		
//		mobil1 = input.nextLong();
//		mobil2 = input.nextLong();
//		mobil3 = input.nextLong();
//		mobil4 = input.nextLong();
		
		total = input.nextLong();
		long status = total-999999;
		long hasil = status%5;
		
		if(hasil == 0) {
			System.out.println("Berhenti");
		}
		else {
			System.out.println("Jalan");
		}
		input.close();
	}

}
