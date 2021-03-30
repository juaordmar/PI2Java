package ejercicios;

import java.util.stream.Stream;

public class Ejercicio2 {
	
	public static Boolean ej2Iterativo(Integer a, Integer b) { 
		Boolean res = null;
		while(b <= a) { 
			a = a - b;
		}if(a == 0) {
			res = true;
		}else{
			res = false;
		}return res;
	}
	
	public static Boolean ej2RecursivoFinal(Integer a, Integer b) {
		return ej2RecursivoFinalAux(a, b, null);
	}
	
	private static Boolean ej2RecursivoFinalAux(Integer a, Integer b, Boolean c) {
		if(a==0) {
			c = true;
		}else if(a > 0 && b > a) {
			c = false;
		}else {
			c = ej2RecursivoFinalAux(a-b, b, c);
		}return c;
	}

	public static Boolean ej2Funcional(Integer a, Integer b) { 
		TuplaBB2 t = Stream.iterate(TuplaBB2.create(a, b, false), 
				e-> TuplaBB2.nx(a, b, false, e)).dropWhile(e->e.b <= e.a).findFirst().get();
		return t.c;
	}
}
