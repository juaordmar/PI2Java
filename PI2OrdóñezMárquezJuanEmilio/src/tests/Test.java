package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ejercicios.Ejercicio1;
import ejercicios.Ejercicio2;
import ejercicios.Ejercicio3;
import us.lsi.common.Files2;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("TEST 1\n=======================================\n");
		test1("../PI2OrdóñezMárquezJuanEmilio/ficheros/PI2Ej1DatosEntrada.txt");
		System.out.println("\nTEST 2\n=======================================\n");
		test2("../PI2OrdóñezMárquezJuanEmilio/ficheros/PI2Ej2DatosEntrada.txt");
		System.out.println("\nTEST 3\n=======================================\n");
		test3("../PI2OrdóñezMárquezJuanEmilio/ficheros/PI2Ej3DatosEntrada.txt");
	}
	
	public static void test1(String dirFichero) {
		List<String> listaCadenas = Files2.streamFromFile(dirFichero).collect(Collectors.toList());
		int i = 0;
		while(i<listaCadenas.size()) {
			List<String> cadenas = Test.pL1(listaCadenas.get(i));
			System.out.println(cadenas.get(0) + ", " + cadenas.get(1));
			String a = cadenas.get(0); String b = cadenas.get(1); 
			System.out.println("1. iterativa (while): " + Ejercicio1.ej1Iterativo(a,b));
			System.out.println("2. Recursiva final: " + Ejercicio1.ej1RecursivoFinal(a,b));
			System.out.println("3. Funcional: " + Ejercicio1.ej1Funcional(a,b) + "\n\n");
			i++;
		}
	}
	
	public static void test2(String dirFichero) {
		List<String> ls = Files2.streamFromFile(dirFichero).collect(Collectors.toList());
		int i = 0;
		while(i<ls.size()) {
			List<Integer> enteros = Test.pL2y3(ls.get(i));
			System.out.println(enteros.get(0) + "," + enteros.get(1));
			Integer a = enteros.get(0); Integer b = enteros.get(1); 
			System.out.println("1. Iterativa (while): " + Ejercicio2.ej2Iterativo(a,b));
			System.out.println("2. Recursiva final: " + Ejercicio2.ej2RecursivoFinal(a,b));
			System.out.println("3. Funcional: " + Ejercicio2.ej2Funcional(a,b) + "\n\n");
			i++;
		}
	}
	
	public static void test3(String dirFichero) {
		List<String> ls = Files2.streamFromFile(dirFichero).collect(Collectors.toList());
		int i = 0;
		while(i<ls.size()) {
			List<Integer> enteros = Test.pL2y3(ls.get(i));
			System.out.println(enteros.get(0) + "," + enteros.get(1));
			Integer a = enteros.get(0); Integer b = enteros.get(1); 
			System.out.println("1. Iterativa (while): " + Ejercicio3.ej3Iterativo((long)a,b));
			System.out.println("2. Recursiva no final: " + Ejercicio3.ej3RecursivoNoFinal((long)a,b));
			System.out.println("3. Recursiva final: " + Ejercicio3.ej3RecursivoFinal((long)a,b));
			System.out.println("4. Funcional: " + Ejercicio3.ej3Funcional((long)a,b) + "\n\n");
			i++;
		}
	}
	
	public static List<String> pL1(String l){
		List<String> res = new ArrayList<String>();
		if(l.equals("")) {
			return new ArrayList<String>();
		}String[] trozos = l.split("#");
		String a = trozos[0]; String b = trozos[1];
		res.add(a); res.add(b);
		return res;
	}
	
	public static List<Integer> pL2y3(String l){
		List<Integer> res = new ArrayList<Integer>();
		if(l.equals("")) {
			return new ArrayList<Integer>();
		}String[] trozos = l.split(",");
		Integer a = Integer.parseInt(trozos[0]);
		Integer b = Integer.parseInt(trozos[1]);
		res.add(a); res.add(b);
		return res;
	}
	
}
