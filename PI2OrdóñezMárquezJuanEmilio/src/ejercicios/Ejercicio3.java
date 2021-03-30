package ejercicios;

import java.util.stream.Stream;

public class Ejercicio3 {
	
	public static Long ej3Iterativo(Long a, Integer n) { 
		Long res = 1l; 
		while(n > 0) { 
			if(n%2==1) {
				res = res * a;
			}a = a * a;
			n = n/2;
		}return res;
	}
	
	public static Long ej3RecursivoNoFinal(Long a, Integer n) {
		Long res;
		if(n>0) {
			res = ej3RecursivoNoFinal(a, n/2);
			if(n%2==1) {
				res = res*res*a;
			}else {
				res = res*res;
			}
		}else {
			res = (long)1;
		}return res;
	}
	
	public static Long ej3RecursivoFinal(Long a, Integer n) {
		return ej3RecursivoFinalAux(a, n, 1l);
	}
	
	private static Long ej3RecursivoFinalAux(Long a, Integer n, Long res) {
		Long x = null;
		if(n > 0) {	
			if(n%2==1) {
				res = res * a;
			}x = ej3RecursivoFinalAux(a*a, n/2, res);
		}else{
			x = res;
		}return x;
	}
	
	public static Long ej3Funcional(Long a, Integer n) {
		TuplaBB3 t = Stream.iterate(TuplaBB3.create(a, n, 1l),
				e->TuplaBB3.nx(a, n, e)).dropWhile(e-> e.n > 0)
				.findFirst().get();
		return t.res;
	}
	
}
