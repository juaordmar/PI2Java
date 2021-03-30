package ejercicios;

public class TuplaBB1 {
	Integer i = null;
	Integer j = null;
	Integer k = null;
	
	public static TuplaBB1 create(Integer i, Integer j, Integer k) {
		return new TuplaBB1(i, j, k);
	}
	
	private TuplaBB1(Integer i, Integer j, Integer k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k; 
	}
	
	public static TuplaBB1 nx(String a, String b, TuplaBB1 t) {
		if(a.charAt(t.k)==b.charAt(t.k)) { 
			t.i = t.k;
			t.k = (t.i+t.j)/2;
		}else { 
			t.j = t.k;
			t.k = (t.i+t.j)/2;
		}return t;
	}
	
	
	
	
}
