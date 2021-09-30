import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	String karakter[] = new String[3];	//deklarasi var karakter bertipe data array of char dengan indeks 3
	int angka[] = new int[3];			//deklarasi var angka bertipe data array of int dengan indeks 3
	
	for(int i = 0; i < 3; i++) {
		karakter[i] = input.next();
		angka[i] = input.nextInt();
	}
	
	int i = 0;
	System.out.println("==============================================");
	while(i<3){
		System.out.printf("%-15s\t", karakter[i]);	
		System.out.printf("%03d\n",angka[i]);
		i++;
	}
	System.out.println("==============================================");
	input.close();

	}
}

//int angka;
//int i;
//Scanner input = new Scanner(System.in);
//
//System.out.println("==============================================");
//
//for(i = 1; i <= 3; i++) {
//	karakter = input.next();
//	angka = input.nextInt();
//	System.out.printf("%-15s\t", karakter);		// panjang maksimal karakter 15
//	System.out.printf("%03d\n",angka);			// panjang angka 3 digit
//}
//System.out.println("==============================================");
