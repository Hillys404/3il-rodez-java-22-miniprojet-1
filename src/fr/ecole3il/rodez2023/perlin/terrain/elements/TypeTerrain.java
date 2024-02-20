package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.Utils;

import java.awt.image.BufferedImage;

public enum TypeTerrain {
    COLLINES("../../data/hills.png"),
    DESERT("../../data/desert.png"),
    FORET_CONIFÈRES("../../data/coniferous_forest.png"),
    FORET_FEUILLUS("../../data/deciduous_forest.png"),
    MARAIS("../../data/marsh.png"),
    MONTAGNE("../../data/moutain.png"),
    OCEAN("../../data/ocean.png"),
    PLAINE("../../data/plain.png"),
    TOUNDRA("../../data/tundra.png");

	private String nomFichier;
	
    private TypeTerrain(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public BufferedImage getImage() {
        return Utils.chargerTuile(nomFichier);
    }

    @Override
    public String toString() {

        return "";
    }
}
