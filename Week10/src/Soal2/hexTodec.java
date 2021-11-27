package Soal2;

import java.util.Scanner;

public class hexTodec {
	public static void main(String args[]) {
		try {
			String hex;
			int dec;
			Scanner input = new Scanner(System.in);
			System.out.print("Bilangan hexadesimal : ");	// memasukan inputan berupa bil.hex
			hex = input.nextLine();
			dec = Integer.parseInt(hex,16);
			System.out.println("Bilangan desimal : " + dec);	// hasil konversi dari bil.hexa ke bil.dec
			input.close();
		}
		catch(Exception ex) {
			System.out.println("Input salah, silahkan masukkan kembali bilangan hexadesimal.");
		}
	}
}
