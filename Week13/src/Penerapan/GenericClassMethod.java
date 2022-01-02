package Penerapan;

class Coba<T1, T2>{
	T1 t1;
	T2 t2;
	
	public T1 getSatu() {
		return t1;
	}
	
	public void setSatu(T1 t1) {
		this.t1 = t1;
	}
	
	public T2 getDua() {
		return t2;
	}
	
	public void setDua(T2 t2) {
		this.t2 = t2;
	}
}

public class GenericClassMethod {
	public static void main(String[] args) {
		Coba<Integer, String> test = new Coba<Integer, String>();
		
		test.setSatu(17);
		test.setDua("Hello World!");

		System.out.println(test.getSatu());
		System.out.println(test.getDua());
	}

}
