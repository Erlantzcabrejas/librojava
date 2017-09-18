package com.ipartek.formacion.javalibro.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.javalibro.pojo.interfaces.Vendible;

import junit.framework.TestCase;

public class LibrosTest extends TestCase {

	
	
	@Test
	public void test() {
		Libro li =new Libro("100 años de soledad");
		li.setAutor("Gabriel Garcia");
		li.setPaginas(307);
		assertEquals(61.4F, li.getPrecio());
		
		
		
		LibroElectronico le=new LibroElectronico("Años salvajes");
		le.setAutor("William Finnegan");
		le.setPaginas(523);
		le.setTamanyo(27);
		assertEquals(99.6F, le.getPrecio());
		
		/*le.setPaginas(0);
		if(le.getPrecio()<0) {
			le.setPrecio(Vendible.PRECIO_MINIMO);
		}
		assertEquals(0, le.getPrecio());*/
		
		LibroPapel lp=new LibroPapel("Papillon");
		lp.setAutor("Charriere Henri");
		lp.setPaginas(789);
		lp.setTapaBlanda(false);
		
		assertEquals(159.3F, lp.getPrecio());
		
		
	}

}
