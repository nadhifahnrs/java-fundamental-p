package Soal2;

public class Constants {
	public static void main(String[] args) {
		
	final double CM_PER_INCH = 2.54;	// variabel dengan tipe data double yang nilainya bersifat tetap
	double paperWidth = 8.5;
	double paperHeight = 11;
	
	System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}
