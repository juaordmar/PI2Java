package ejercicios;

public class TuplaBB2 {
	
	Integer a = null;
	Integer b = null;
	Boolean c = null;
	
	public static TuplaBB2 create(Integer a, Integer b, Boolean c) {
		return new TuplaBB2(a, b, c);
	}
	
	private TuplaBB2(Integer a, Integer b, Boolean c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c; 
	}
	
	public static TuplaBB2 nx(Integer a, Integer b, Boolean c, TuplaBB2 t) {
		t.a = t.a - t.b;
		if(t.a == 0) {
			t.c = true;
		}return t;
	}
	
}
