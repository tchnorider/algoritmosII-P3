package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utils.Persona;
import estructuraH.HashCerradoLineal;

public class TestHash {

	@Test
	public void testInsertarEnHashCerradoP1() {

		HashCerradoLineal hash = new HashCerradoLineal(7);

		System.out.println("testInsertarEnHashCerradoP1");

		Persona p1 = new Persona();
		p1.setCedula("12345678");

		System.out.println("inserto p1");
		hash.insertar(p1);

		boolean r = hash.existePersona(p1);
		assertTrue(r);

		System.out.println("testInsertarEnHashCerradoP2");

		Persona p2 = new Persona();
		p2.setCedula("12335678");

		System.out.println("inserto p2");
		hash.insertar(p2);

		r = hash.existePersona(p2);
		System.out.println("clave" + p2.getClave());
		assertTrue(r);

		System.out.println("testInsertarEnHashCerradoP3");

		Persona p3 = new Persona();
		p3.setCedula("11335678");

		System.out.println("inserto p3");
		hash.insertar(p3);

		r = hash.existePersona(p3);
		System.out.println("clave" + p3.getClave());
		assertTrue(r);

		System.out.println("testInsertarEnHashCerradoP4");

		Persona p4 = new Persona();
		p4.setCedula("12335679");

		System.out.println("inserto p4");
		hash.insertar(p4);

		r = hash.existePersona(p4);
		System.out.println("clave" + p4.getClave());
		assertTrue(r);

		System.out.println("testInsertarEnHashCerradoP5");

		Persona p5 = new Persona();
		p5.setCedula("12335668");

		System.out.println("inserto p5");
		hash.insertar(p5);

		r = hash.existePersona(p5);
		System.out.println("clave" + p5.getClave());
		assertTrue(r);

		System.out.println("testInsertarEnHashCerradoP6");

		Persona p6 = new Persona();
		p6.setCedula("22335678");

		System.out.println("inserto p6");
		hash.insertar(p6);

		r = hash.existePersona(p6);
		System.out.println("clave" + p6.getClave());
		assertTrue(r);

		System.out.println("testInsertarEnHashCerradoP7");

		Persona p7 = new Persona();
		p7.setCedula("12335688");

		System.out.println("inserto p7");
		hash.insertar(p7);

		r = hash.existePersona(p7);
		System.out.println("clave" + p7.getClave());

		assertTrue(r);

		Persona p8 = new Persona();
		p8.setCedula("12335888");

		System.out.println("inserto p8");
		hash.insertar(p8);

		r = hash.existePersona(p8);
		System.out.println("clave" + p8.getClave());
		System.out.println("destruyo hash");
		hash = null;
		assertFalse(r);
	}
}
