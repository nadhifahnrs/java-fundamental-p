import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A, B;
		char operator;
		
		// Memasukan inputan angka
		A = input.nextInt();
		operator = input.next().charAt(0);
		B = input.nextInt();
		System.out.println("Hasil : ");
		
		// Pengecekkan operator
		if(A >= 1 && B <= 1000) {
			if(operator == '+') {
				int hasiljumlah = A + B;
				System.out.printf("%d %c %d = %d",A,operator,B,hasiljumlah);
			}
			else if(operator == '-') {
				int hasilkurang = A - B;
				System.out.printf("%d %c %d = %d",A,operator,B,hasilkurang);
			}
			else if(operator == '*') {
				int hasilkali = A * B;
				System.out.printf("%d %c %d = %d",A,operator,B,hasilkali);
			}
			else if(operator == '/') {
				int hasilbagi = A / B;
				System.out.printf("%d %c %d = %d",A,operator,B,hasilbagi);
			}
			else if(operator == '%') {
				int sisahasilbagi = A % B;
				System.out.printf("%d %c %d = %d",A,operator,B,sisahasilbagi);
			}
			else {
				System.out.println("Maaf, inputan tidak tersedia");
			}
		}
		input.close();
		
	}

}
