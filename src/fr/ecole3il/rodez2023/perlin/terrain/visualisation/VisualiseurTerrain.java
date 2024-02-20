package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.concrets.DetermineurTerrainEnonce;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

public class VisualiseurTerrain {

	private DetermineurTerrain determineurTerrain;
	private Carte carte;
	private TypeTerrain type;
	
	public VisualiseurTerrain(DetermineurTerrainEnonce determineurTerrainEnonce, Carte c) {
		this.carte = c;
		
		//this.determineurTerrain = (altitude, hydrometrie, temperature) ->
        //determineurTerrainEnonce.determinerTerrain(altitude, hydrometrie, temperature);
		
		if (determineurTerrain == null) {
            throw new IllegalArgumentException("determineurTerrainEnonce ne doit pas être null");
        }
		
		// A partir de la carte, on détermine les propriétés du terrain
		type = carte.getTerrain(0, 0).getTypeTerrain(determineurTerrainEnonce);
	}

	
	public TypeTerrain getTypeTerrain(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        TypeTerrain typeTerrain = determineurTerrain.determinerTerrain(terrain.getAltitude(), terrain.getHydrometrie(), terrain.getTemperature());
        return typeTerrain;
    }
	
	
	public AltitudeAffichee getAltitudeAffichee(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        double altitude = terrain.getAltitude();

        if (altitude < 0) {
            return AltitudeAffichee.FOND_MARIN;
        } else if (altitude < 0.33) {
            return AltitudeAffichee.BASSE;
        } else if (altitude < 0.66) {
            return AltitudeAffichee.MOYENNE;
        } else {
            return AltitudeAffichee.ELEVEE;
        }
    }
	
	public HydrometrieAffichee getHydrometrieAffichee(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        double hydrometrie = terrain.getHydrometrie();

        if (hydrometrie < HydrometrieAffichee.SEC.getHydrometrie()) {
            return HydrometrieAffichee.SEC;
        } else if (hydrometrie < HydrometrieAffichee.MOYEN.getHydrometrie()) {
            return HydrometrieAffichee.MOYEN;
        } else {
            return HydrometrieAffichee.HUMIDE;
        }
    }
    /**@methode --> permet de retourner le type de température d'un terrain */
    public TemperatureAffichee getTemperatureAffichee(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        double temperature = terrain.getTemperature();

        if (temperature < TemperatureAffichee.FROID.getTemperature()) {
            return TemperatureAffichee.FROID;
        } else if (temperature < TemperatureAffichee.TEMPERE.getTemperature()) {
            return TemperatureAffichee.TEMPERE;
        } else {
            return TemperatureAffichee.CHAUD;
        }
    }
}
