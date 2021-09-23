package Soal1;

import java.util.Scanner;

public class Soal1_DataTypes {
	public static void main (String args[]) {
	Scanner input = new Scanner(System.in);		// mencetak data yang diinputkan
	int s;
	
	for (s = 1; s <= 6; s++) {
		try {
			long nilai = input.nextLong();		// fungsi untuk mengambil data bertipe long integer dan meneruskannya
			System.out.println(nilai+ " can be fitted in : ");
		 
			/* Jika nilai termasuk dalam tipe data byte*/
			if(nilai >= Byte.MIN_VALUE && nilai <= Byte.MAX_VALUE){
				System.out.println("* byte");
			}
			/* Jika nilai termasuk dalam tipe data short*/
			if(nilai >= Short.MIN_VALUE && nilai <= Short.MAX_VALUE){
				System.out.println("* short");
			}
			/* Jika nilai termasuk dalam tipe data integer*/
			if(nilai >= Integer.MIN_VALUE && nilai <= Integer.MAX_VALUE){
				System.out.println("* int");
			}
			/* Jika nilai termasuk dalam tipe data long*/
			if(nilai >= Long.MIN_VALUE && nilai <= Long.MAX_VALUE){
				System.out.println("* long");
			}
			}
			catch(Exception e){
				System.out.println(input.next()+" can't be fitted anywhere.");
			}
		}
	input.close();
	}
}

