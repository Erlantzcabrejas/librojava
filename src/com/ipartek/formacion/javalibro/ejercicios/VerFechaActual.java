package com.ipartek.formacion.javalibro.ejercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Ver fecha actual del sistema
 */


public class VerFechaActual {
	public final static String [] DAYS_OF_WEEK= {"Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};

	public final static String [] MESES= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", 
			"Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	
	public static void main(String[] args) {
		Date date=new Date();
		
		GregorianCalendar gc= new GregorianCalendar();
		
		gc.setTime(date);
		
		int anyo =gc.get(Calendar.YEAR);
		int mes= gc.get(Calendar.MONTH);
		int day= gc.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek=gc.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("La fecha es "+anyo+", "+mes+", "+day);
		System.out.println("Exactamente :"+anyo+" "+MESES[mes]+" "+day+" "+DAYS_OF_WEEK[dayOfWeek]);
	}

}
