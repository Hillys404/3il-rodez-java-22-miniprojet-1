package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.Utils;

import java.awt.image.BufferedImage;

public enum TypeTerrain {
    COLLINES("hills.png"),
    DESERT("desert.png"),
    FORET_CONIFÈRES("coniferous_forest.png"),
    FORET_FEUILLUS("deciduous_forest.png"),
    MARAIS("marsh.png"),
    MONTAGNE("mountain.png"),
    OCEAN("ocean.png"),
    PLAINE("plain.png"),
    TOUNDRA("tundra.png");

	private String nomFichier;
	
    private TypeTerrain(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public BufferedImage getImage() {
        return Utils.chargerTuile(nomFichier);
    }

    @Override
    public String toString() {
    	String[] nomTerrain = nomFichier.split("(");
        return nomTerrain[0];
    }
}
