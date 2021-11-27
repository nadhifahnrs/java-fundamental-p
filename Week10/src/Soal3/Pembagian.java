package Soal3;

import java.util.Scanner;

public class Pembagian {
	public static int Hitungbagi(int angka1, int angka2){
		if(angka2 == 0){
				
			throw new ArithmeticException("Nilai pembagi tidak boleh 0");
		}
		return (angka1/angka2);
	}
	
	public static void main(String args[]) {
		int angka1, angka2, hasil;
		Scanner input = new Scanner(System.in);
		System.out.print("Angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Angka 2 : ");
		angka2 = input.nextInt();
		
		try {
			hasil = Hitungbagi(angka1, angka2);
			System.out.printf("Hasil bagi %d dengan %d = " + hasil ,angka1, angka2);
			input.close();
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
	}
}

