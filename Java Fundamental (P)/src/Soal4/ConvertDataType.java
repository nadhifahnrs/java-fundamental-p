package Soal4;

public class ConvertDataType{
	static short methodOne(long l){
		int i = (int) l;	// melakukan konversi dari long ke int
		return (short)i;	// mengembalikan nilai i dengan tipe data short
	}
	public static void main(String[] args){
		double d = 10.25;
		float f = (float) d;	// melakukan konversi dari double ke float
		byte b = (byte) methodOne((long) f);	// variabel f melakukan konversi dengan memangil modul methodOne
		System.out.println(b);
	}
}
