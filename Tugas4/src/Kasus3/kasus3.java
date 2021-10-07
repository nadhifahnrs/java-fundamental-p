package Kasus3;

class KelasSatu{
	{
		System.out.println(11);		// initializer block
	}
	static	
	{
		System.out.println(2);		// static block
	}
	public KelasSatu(int i)
	{
		System.out.println(3);		// constructor overloading
	}
	public KelasSatu()
	{
		System.out.println(4);		// constructor overloading
	}
}

class KelasDua{
	{
		System.out.println(5);
	}
	
}

public class kasus3 {
	public static void main(String[] args){
		System.out.println(6);
		KelasSatu satu = new KelasSatu();
		KelasSatu dua = new KelasSatu(10);
	}
}
