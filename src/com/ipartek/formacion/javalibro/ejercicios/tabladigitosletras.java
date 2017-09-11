package com.ipartek.formacion.javalibro.ejercicios;

public class tabladigitosletras {
		
	//obtener simbolo especial ASCII de check o cross
	//parametro valor boolean
	//devuelve si valor true,check, si valor false, cross
	public static char dameSimbolo( boolean valor ) {
		char resultado= '\u2716';//cross
		if(valor) {
			resultado= '\u2714';
		}
		
		return resultado;
		}
	
	public static void main(String[] args) {
	
	
	char [] chars= {'a','F','3','j'};
	
	System.out.println("--------------------------------------------");
	System.out.println("   digito    letra    Mayus.    Minus.");
	for(int i=0; i< chars.length; i++) {
		System.out.println(chars[i]+"    "+ 
						   dameSimbolo(Character.isDigit(chars[i]))+"    "+
						   dameSimbolo(Character.isLetter(chars[i]))+"    "+
						   dameSimbolo(Character.isUpperCase(chars[i]))+"     "+
						   dameSimbolo(Character.isLowerCase(chars[i]))+"     ");
	}
	
	
	}

}
