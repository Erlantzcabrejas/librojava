package com.ipartek.formacion.javalibro.excepciones;

/* ES UNA EXCEPTION PERSONALIZADA PARA EL POJO DE PARTICIPANTE */
//@see https://es.wikipedia.org/wiki/Plain_Old_Java_Object

public class ParticipanteException extends Exception{
	
	public ParticipanteException(String mensajeException) {
		super(mensajeException);
	}
	
	private static final long serialVersionUID = 1608331766248931635L;
	
	
	public final static String EXCEPTION_MENOR_CERO = "La edad no puede ser menor que 0";
	public final static String EXCEPTION_MAYOR_CIEN ="Eres demasiado viejo, no puedes tener mas de 100 años";
	
	
}
