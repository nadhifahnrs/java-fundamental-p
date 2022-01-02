package Penerapan;

public class GenericBoundedType<T>{
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T : " + t.getClass().getName());
		System.out.println("U : " + u.getClass().getName());
	}
	
	public static void main(String[] args) {
		GenericBoundedType<Integer> int1 = new GenericBoundedType<Integer>();
		int1.add(new Integer(10));
		int1.inspect(20);

	}

}
