package test;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Persona;
import estructuraH.HashCerradoLineal;

public class TestHash {

	HashCerradoLineal hash = new HashCerradoLineal(7);
	Persona[] personas = new Persona[7];

	/*
	 * @Test public void test() { System.out.println("test generico");
	 * cargarGente();
	 * 
	 * for (int i = 0; i < 7; i++) { hash.insertar(personas[i]); } for (int i =
	 * 0; i < 7; i++) { boolean r = hash.existe(personas[i].getCedula());
	 * assertTrue(r); } }
	 */

	@Test
	public void testInsertarEnHashCerradoP1() {
		System.out.println("testInsertarEnHashCerradoP1");

		Persona p1 = new Persona();
		p1.setCedula("12345678");

		System.out.println("inserto p1");
		hash.insertar(p1);

		boolean r = hash.existePersona(p1);
		assertTrue(r);
	}

	@Test
	public void testInsertarEnHashCerradoP2() {

		System.out.println("testInsertarEnHashCerradoP2");

		Persona p2 = new Persona();
		p2.setCedula("12335678");

		System.out.println("inserto p2");
		hash.insertar(p2);

		boolean r = hash.existePersona(p2);
		System.out.println("clave" + p2.getClave());
		assertTrue(r);
	}

	@Test
	public void testInsertarEnHashCerradoP3() {

		System.out.println("testInsertarEnHashCerradoP3");

		Persona p3 = new Persona();
		p3.setCedula("11335678");

		System.out.println("inserto p3");
		hash.insertar(p3);

		boolean r = hash.existe(p3.getCedula());
		System.out.println("clave" + p3.getClave());
		assertTrue(r);
	}

	@Test
	public void testInsertarEnHashCerradoP4() {

		System.out.println("testInsertarEnHashCerradoP4");

		Persona p4 = new Persona();
		p4.setCedula("12335679");

		System.out.println("inserto p4");
		hash.insertar(p4);

		boolean r = hash.existe(p4.getCedula());
		System.out.println("clave" + p4.getClave());
		assertTrue(r);
	}

	@Test
	public void testInsertarEnHashCerradoP5() {

		System.out.println("testInsertarEnHashCerradoP5");

		Persona p5 = new Persona();
		p5.setCedula("12335668");

		System.out.println("inserto p5");
		hash.insertar(p5);

		boolean r = hash.existe(p5.getCedula());
		System.out.println("clave" + p5.getClave());
		assertTrue(r);
	}

	@Test
	public void testInsertarEnHashCerradoP6() {

		System.out.println("testInsertarEnHashCerradoP6");

		Persona p6 = new Persona();
		p6.setCedula("22335678");

		System.out.println("inserto p6");
		hash.insertar(p6);

		boolean r = hash.existePersona(p6);
		System.out.println("clave" + p6.getClave());
		assertTrue(r);
	}

	@Test
	public void testInsertarEnHashCerradoP7() {

		System.out.println("testInsertarEnHashCerradoP6");

		Persona p7 = new Persona();
		p7.setCedula("12335688");

		System.out.println("inserto p7");
		hash.insertar(p7);

		boolean r = hash.existePersona(p7);
		System.out.println("clave" + p7.getClave());
		assertTrue(r);
	}
	
	@Test
	public void testInsertarEnHashCerradoP8() {

		System.out.println("testInsertarEnHashCerradoP6");

		Persona p8 = new Persona();
		p8.setCedula("12335888");
		
		System.out.println("inserto p8");
		hash.insertar(p8);

		boolean r = hash.existePersona(p8);
		System.out.println("clave" + p8.getClave());
		assertTrue(r);

		destruirHash();
	}

	void destruirHash() {
		hash = null;
	}

	/*
	 * public void testInsertarEnHashCerrado() {
	 * 
	 * Persona p1 = new Persona(); p.setCedula("12345678");
	 * 
	 * Persona p2 = new Persona(); p2.setCedula("12335678");
	 * 
	 * Persona p3 = new Persona(); p3.setCedula("11335678");
	 * 
	 * hash.insertar(p1); hash.insertar(p2); hash.insertar(p3);
	 * 
	 * boolean r = hash.existe(personas[i].getCedula()); assertTrue(r); }
	 */
	public void cargarGente() {

		Persona p = new Persona();
		p.setCedula("12345678");
		personas[1] = p;

		Persona p2 = new Persona();
		p2.setCedula("12335678");
		personas[2] = p2;

		Persona p3 = new Persona();
		p3.setCedula("11335678");
		personas[3] = p3;

		Persona p4 = new Persona();
		p4.setCedula("12335679");
		personas[4] = p4;

		Persona p5 = new Persona();
		p5.setCedula("12335668");
		personas[5] = p5;

		Persona p6 = new Persona();
		p6.setCedula("22335678");
		personas[6] = p6;

		Persona p7 = new Persona();
		p7.setCedula("12335688");
		personas[0] = p7;
	}
}
