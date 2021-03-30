package ejercicios;

import java.util.stream.Stream;

public class Ejercicio1 {

	public static Integer ej1Iterativo(String a, String b) { 
		int i = 0; int j = a.length(); int k = (i+j)/2;
		while((j-i)>1) { //hasta que 'j' sea el primer carácter diferente e 'i' el último igual
			if(a.charAt(k)==b.charAt(k)) { 
				i = k;
				k = (i+j)/2;
			}else { 
				j = k;
				k = (i+j)/2;
			}
		}return j; //también podría devolver i+1
	}
	
	public static Integer ej1RecursivoFinal(String a, String b) { 
		return ej1RecursivoFinalAux(a, b, 0, a.length(), (0+a.length())/2);
	}
	
	private static Integer ej1RecursivoFinalAux(String a, String b, int i, int j, int k) { 
		Integer res = null;
		if((j-i)>1) {
			if(a.charAt(k)==b.charAt(k)) { 
				i = k;
				k = (i+j)/2;
			}else {
				j = k;
				k = (i+j)/2;	
			}res = ej1RecursivoFinalAux(a, b, i, j, k);		
		}else {
			res = j;
		}return res; 
	}
	
	public static Integer ej1Funcional(String a, String b) {
		Integer n = a.length();
		TuplaBB1 t = Stream.iterate(TuplaBB1.create(0, n, (n/2)),
				e->TuplaBB1.nx(a, b, e)).dropWhile(e->(e.j-e.i)>1).findFirst().get();
		return t.j; 
	}

}


