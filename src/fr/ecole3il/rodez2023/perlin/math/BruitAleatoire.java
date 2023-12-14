package fr.ecole3il.rodez2023.perlin.math;

import java.util.Random;

/**
 * La classe RandomNoise étend la classe Noise2D et génère du bruit aléatoire en deux dimensions.
 * Elle utilise la classe Random de Java pour générer des valeurs aléatoires.
 */
public class BruitAleatoire extends Bruit2D {

    private final double rdm;

    public BruitAleatoire(long graine, double resolution) {
        super(graine, resolution);
        rdm = new Random().nextDouble(graine);
    }

    /**
     * Génère aléatoirement la valeur de bruit en 2D obtenir le bruit.
     * @param x Coordonnée x pour laquelle
     * @param y Coordonnée y pour laquelle obtenir le bruit.
     * @return : la valeur du bruit
     */
    @Override
    public double bruit2D(double x, double y) {
        return rdm;
    }

}
