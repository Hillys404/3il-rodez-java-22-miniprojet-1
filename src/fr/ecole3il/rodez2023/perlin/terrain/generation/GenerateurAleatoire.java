package fr.ecole3il.rodez2023.perlin.terrain.generation;

import java.util.Random;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurAleatoire extends GenerateurCarte {

	Random r1;
	Random r2;
	Random r3;
	
	/**
	 * Construit le générateur de carte avec des valeurs aléatoires
	 * @param graine : utilisée pour générer la carte
	 */
	public GenerateurAleatoire(long graine) {
		super(graine);
		// On change la valeur donnée dans le random pour ne pas avoir le même nombre 
		r1 = new Random(graine);
		r2 = new Random(graine + 1);
		r3 = new Random(graine + 2);
	}

	/**
	 * Les paramètres ne sont pas utilisés car dans le constructeur de Terrain
	 * on utilise les valeurs d'altitude, hydrométrie et température, que l'on
	 * génère ici aléatoirement.
	 */
	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		return new Terrain(r1.nextDouble(), r2.nextDouble(), r3.nextDouble());
	}

}
