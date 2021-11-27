package Soal3;

import java.util.Scanner;

public class Textfield {
	public static void main(String args[]) {
		try {
			Scanner input = new Scanner(System.in);
			int a;
			a = input.nextInt();
			System.out.println("Nilai : " + a);
			input.close();
		}
		catch(Exception ex) {
			System.out.println(ex + " Error");
		}
	}
}
