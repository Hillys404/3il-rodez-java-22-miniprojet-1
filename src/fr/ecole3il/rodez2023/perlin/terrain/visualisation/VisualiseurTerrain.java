package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.concrets.DetermineurTerrainEnonce;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TerrainInexistantException;

public class VisualiseurTerrain {

	private DetermineurTerrain determineurTerrain;
	private Carte carte;
	private TypeTerrain type;
	
	public VisualiseurTerrain(DetermineurTerrainEnonce determineurTerrainEnonce, Carte c) throws TerrainInexistantException {
		this.carte = c;
		this.determineurTerrain = determineurTerrainEnonce;
		
		if (determineurTerrain == null) {
            throw new IllegalArgumentException("determineurTerrainEnonce ne doit pas être null");
        }
	}
	
	public TypeTerrain getTypeTerrain(int x, int y) throws TerrainInexistantException {
        Terrain terrain = carte.getTerrain(x, y);
        TypeTerrain typeTerrain = determineurTerrain.determinerTerrain(terrain.getAltitude(), terrain.getHydrometrie(), terrain.getTemperature());
        return typeTerrain;
    }
	
	public AltitudeAffichee getAltitudeAffichee(int x, int y) {
        double altitude;
        try {
        	altitude = carte.getTerrain(x, y).getAltitude();
        } catch (TerrainInexistantException e) {
            e.printStackTrace();
            return null;
        }
        if (altitude < 0 ) return AltitudeAffichee.FOND_MARIN;
        else if (altitude < 0.33) return AltitudeAffichee.BASSE;
        else if (altitude < 0.66) return AltitudeAffichee.MOYENNE;
        else return AltitudeAffichee.ELEVEE;
    }
	
	public HydrometrieAffichee getHydrometrieAffichee(int x, int y) {
		double hydro;
        try {
            hydro = carte.getTerrain(x, y).getHydrometrie();
        } catch (TerrainInexistantException e) {
            e.printStackTrace();
            return null;
        }
        if (hydro < 0.33 ) return HydrometrieAffichee.SEC;
        else if (hydro < 0.66) return HydrometrieAffichee.MOYEN;
        else return HydrometrieAffichee.HUMIDE;
    }
	
    public TemperatureAffichee getTemperatureAffichee(int x, int y) throws TerrainInexistantException {
        double temperature;
        try {
        	temperature = carte.getTerrain(x, y).getTemperature();
        } catch (TerrainInexistantException e) {
            e.printStackTrace();
            return null;
        }
        if (temperature < 0 ) return TemperatureAffichee.FROID;
        else if (temperature < 10) return TemperatureAffichee.TEMPERE;
        else return TemperatureAffichee.CHAUD;
    }
}
