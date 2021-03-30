package ejercicios;

public class TuplaBB3 {
	
	Long a = null;
	Integer n = null;
	Long res = null;
	
	public static TuplaBB3 create(Long a, Integer n, Long res) {
		return new TuplaBB3(a, n, res);
	}
	
	private TuplaBB3(Long a, Integer n, Long res) {
		super();
		this.a = a;
		this.n = n;
		this.res = res; 
	}
	
	public static TuplaBB3 nx(Long a, Integer n, TuplaBB3 t) {
		if(t.n%2==1) {
			t.res = t.res * t.a;
		}t.a = t.a * t.a;
		t.n = t.n/2;
		return t;
	}
}
