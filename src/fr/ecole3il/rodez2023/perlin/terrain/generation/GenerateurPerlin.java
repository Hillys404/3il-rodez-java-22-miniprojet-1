package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurPerlin extends GenerateurCarte {

	BruitPerlin2D bruitAltitude;
	BruitPerlin2D bruitHydrometrie;
	BruitPerlin2D bruitTemperature;
	
	/**
	 * Construction du générateur à l'aide du bruit de Perlin 
	 * @param graine
	 */
	public GenerateurPerlin(long graine) {
		super(graine);
		bruitAltitude = new BruitPerlin2D(graine * 4, 1);
		bruitHydrometrie = new BruitPerlin2D(graine, 1);
		bruitTemperature = new BruitPerlin2D(graine * 2, 1);
	}

	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		// On génère les valeurs des 3 paramètres de terrain à l'aide du bruit de Perlin
		double altitude = bruitAltitude.bruit2D(i/largeur, j/hauteur);
		double hydrometrie = bruitAltitude.bruit2D(i/largeur, j/hauteur);
		double temperature = bruitAltitude.bruit2D(i/largeur, j/hauteur);
		
		return new Terrain(altitude, hydrometrie, temperature);
	}
	
}
