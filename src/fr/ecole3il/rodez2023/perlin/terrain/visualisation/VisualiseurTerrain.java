package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.concrets.DetermineurTerrainEnonce;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

public class VisualiseurTerrain {

	TypeTerrain type;
	
	public VisualiseurTerrain(DetermineurTerrainEnonce determineurTerrainEnonce, Carte c) {
		// A partir de la carte, on détermine les propriétés du terrain
		type = c.getTerrain(0, 0).getTypeTerrain(determineurTerrainEnonce);
	}

}
