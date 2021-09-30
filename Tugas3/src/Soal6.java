import java.math.BigInteger;	// class untuk java Big Integer
import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a, b;
		
		a = input.nextLine();
		b = input.nextLine();
		
		input.close();
	
		// untuk penjumlahan dalam class Big Integer menggunakan fungsi add
		System.out.println(new BigInteger(a).add(new BigInteger(b)));
		
		// untuk perkalian dalam class Big Integer menggunakan fungsi multiply
		System.out.println(new BigInteger(a).multiply(new BigInteger(b)));

	}

}
