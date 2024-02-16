package edu.ejemploString;

public class Inicio {

	public static void main(String[] args) {
		// String es una clase
		
		// Comparación
		String texto1 = "Viva   el Betis";
		String texto2 = "viva el betis";
		
		boolean resultadoEquals = texto1.equals(texto2);
		System.out.println(resultadoEquals);
		int resultadoCompare = texto1.compareTo(texto2); //si es 0 coincide si no, distinto
		System.out.println(resultadoCompare);
		int resultadoIgnore = texto1.compareToIgnoreCase(texto2); //Ignora mayúsculas y minúsculas
		System.out.println(resultadoIgnore);
		boolean resultadoEqualsIgnore = texto1.equalsIgnoreCase(texto2);
		System.out.println(resultadoEqualsIgnore);
		
		//Concatenación
		String concatenadoMas = texto1 + texto2;
		System.out.println(concatenadoMas);
		int entero = 22;
		String concatenadoMasEntero = texto1 + entero;
		System.out.println(concatenadoMasEntero);
		
		String concatenacionConcat = texto1.concat(texto2);
		
		//Split
		String[] splitSimple = texto1.split(" ");
		for(String celda : splitSimple) {
			System.out.println(celda);
		}
		System.out.println("-----------");
		String[] splitCero = texto1.split(" ",0);
		for(String celda : splitSimple) {
			System.out.println(celda);
		}
		String[] splitPositivo = texto1.split(" ",2);
		for(String celda : splitPositivo) {
			System.out.println(celda);
		}
		String[] splitNegativo = texto1.split(" ",-1);
		for(String celda : splitNegativo) {
			System.out.println(celda);
		}
		
		//Quitar espacios
		String texto3 = " Buenos dias ";
		String sinEspaciosExtremos = texto3.trim(); //Quita espacios de los extremos
		System.out.println(sinEspaciosExtremos);
		
		String sinEspaciosDentroReplace = texto3.replace("dias","");
		System.out.println(sinEspaciosDentroReplace);
		String sinEspaciosDentroReplace1 = texto3.replace(' ','a');
		System.out.println(sinEspaciosDentroReplace1);

		
	    //Substring
		String texto4 = "Los viernes son duros";
		System.out.println(texto4.substring(4));
		System.out.println(texto4.substring(4,10));
	

		

 
		
		
		
		
	}

}
