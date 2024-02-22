package test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.ecole3il.rodez2023.perlin.Utils;

public class UtilsTest {

	@Test
	public void minTest() {
		
		assertEquals(1, Utils.min(1,2));
		assertEquals(1, Utils.min(1,1));
	}
	
}
