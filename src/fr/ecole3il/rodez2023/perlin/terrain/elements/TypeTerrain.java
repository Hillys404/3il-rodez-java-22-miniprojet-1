package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.Utils;

import java.awt.image.BufferedImage;

public enum TypeTerrain {
    COLLINES,
    DESERT,
    FORET_CONIFÈRES,
    FORET_FEUILLUS,
    MARAIS,
    MONTAGNE,
    OCEAN,
    PLAINE,
    TOUNDRA;

    public BufferedImage getImage(String nomFichier) {
        return Utils.chargerTuile(nomFichier);
    }

    @Override
    public String toString() {

        return "";
    }
}
