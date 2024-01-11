package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

public class Carte {

	private String nom;
	private int largeur, hauteur;
	private Terrain[][] terrains;
	
	/**
	 * Construction de la carte
	 * @param nom
	 * @param largeur
	 * @param hauteur
	 * @param generateurCarte
	 */
	public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) {
		this.nom = nom;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.terrains = generateurCarte.genererCarte(largeur, hauteur);
	}
	
	/**
	 * Retourne le nom de la carte
	 * @return
	 */
	public String getNom() { return this.nom; }
	
	/**
	 * Retourne la largeur de la carte
	 * @return
	 */
	public int getLargeur() { return this.largeur; }
	
	/**
	 * Retourne la hauteur de la carte
	 * @return
	 */
	public int getHauteur() { return this.hauteur; }

	/**
	 * Retourne le terrain présent sur la carte aux coordonnées 
	 * passées en paramètres
	 * @param x
	 * @param y
	 * @return
	 */
	public Terrain getTerrain(int x, int y) {
		if (x < 0  || y < 0) {
			throw new TerrainInexistant("Les coordonnées ne peuvent pas être négative" 
		+ " ou hors de la taille de la carte");
		}
		return this.terrains[x][y];
	}
}
