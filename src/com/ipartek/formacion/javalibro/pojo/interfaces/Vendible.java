package com.ipartek.formacion.javalibro.pojo.interfaces;

import java.io.Serializable;

/*
 * Retorna el precio del objeto, el cual debe ser superior al PRECIO_MINIMO(constante)
 */

public interface Vendible extends Serializable, Cloneable {
	/*
	 * Los atributos de una interfaz son siempre static y final
	 * static porque solo puede haber 1 en memoria
	 * final porque no se puede modificar
	 */
	
	float getPrecio(); /*prototipo*/
	
	static final float PRECIO_MINIMO=0;
}
