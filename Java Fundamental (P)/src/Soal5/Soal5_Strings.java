package Soal5;

import java.util.Scanner;

public class Soal5_Strings {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	String nilai1 = "hello";
	String nilai2 = "java";
	
	// Menghitung panjangnya string
	int length = nilai1.length()+nilai2.length();
	System.out.println(length);
	
	// Membandingkan 2 string secara lexicographically
	int var1 = nilai1.compareTo(nilai2);	
	int var2 = nilai2.compareTo(nilai1);
	
	if(var1 > var2) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	
	// Melakukan kapitalisasi untuk huruf pertama dari masing-masing string
	String up1 = nilai1.substring(0,1).toUpperCase() + nilai1.substring(1);
	String up2 = nilai2.substring(0,1).toUpperCase() + nilai2.substring(1);
	
	System.out.print(up1 + " " + up2);
	
	input.close();
	}

}
