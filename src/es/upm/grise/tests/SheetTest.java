package es.upm.grise.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import es.upm.grise.Sheet;

public class SheetTest {
	
	Sheet s = new Sheet();
	
	
	@Test
	public void testReturnTheContent() {
		s.set("A1","1");
		assertEquals(s.evaluate("A1"),"1");
	}
	
	
	@Test
	public void testIsNotInteger(){
		s.set("A1", "1.5");
		assertEquals(s.evaluate("A1"),"#Errr");
	}

}
