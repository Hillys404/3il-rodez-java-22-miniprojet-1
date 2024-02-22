package test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.ecole3il.rodez2023.perlin.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class TerrainTest {

	@Test
	public void invalidAltitude() {
		assertThrows(MauvaiseValeurException.class, () -> {
			Terrain terrain = new Terrain (-6, 0.5, 0.2);
		});
		assertThrows(MauvaiseValeurException.class, () -> {
			Terrain terrain = new Terrain (-1, 0.5, 0.2);
		});
	}
	
	@Test
	public void invalidHydrometrie() {
		assertThrows(MauvaiseValeurException.class, () -> {
			Terrain terrain = new Terrain (0.4, -1, 0.2);
		});
		assertThrows(MauvaiseValeurException.class, () -> {
			Terrain terrain = new Terrain (0.4, 0, 0.2);
		});
	}
	
	@Test
	public void invalidTemperature() {
		assertThrows(MauvaiseValeurException.class, () -> {
			Terrain terrain = new Terrain (0.4, 0.5, -1);
		});
		assertThrows(MauvaiseValeurException.class, () -> {
			Terrain terrain = new Terrain (0.4, 0.5, 0);
		});
	}
}
