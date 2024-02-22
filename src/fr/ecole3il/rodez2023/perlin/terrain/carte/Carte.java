package fr.ecole3il.rodez2023.perlin.terrain.carte;

import java.util.Scanner;

import fr.ecole3il.rodez2023.perlin.terrain.elements.TerrainInexistantException;
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
	 * Construction de la carte à l'aide des données fournies
	 * @param donneesCarte
	 */
	public Carte(String donneesCarte) {
		Scanner sc = new Scanner(donneesCarte);
		
		// On attribue à chaque paramètre d'une carte les données ligne par ligne
		this.nom = sc.nextLine();
		this.largeur = sc.nextInt();
		this.hauteur = sc.nextInt();
		
		this.terrains = new Terrain[largeur][hauteur];
		
		// On attribue à chaque terrain ses propriétés
		for (int x = 0; x < largeur; x++) {
			for (int y = 0; y < hauteur; y++) {
				// Récupération des données de terrain
				String[] datas = sc.nextLine().split(",");
				// Création du terrain avec ses paramètres
				terrains[x][y] = new Terrain(
						Double.parseDouble(datas[0]), 
						Double.parseDouble(datas[1]), 
						Double.parseDouble(datas[2]));
			}
		}
		
		sc.close();
	}
	
	/**
	 * Retourne le nom de la carte
	 * @return
	 */
	public String getNom() { return nom; }
	
	/**
	 * Retourne la largeur de la carte
	 * @return
	 */
	public int getLargeur() { return largeur; }
	
	/**
	 * Retourne la hauteur de la carte
	 * @return
	 */
	public int getHauteur() { return hauteur; }

	/**
	 * Retourne le terrain présent sur la carte aux coordonnées 
	 * passées en paramètres
	 * @param x
	 * @param y
	 * @return
	 * @throws TerrainInexistantException 
	 */
	public Terrain getTerrain(int x, int y) throws TerrainInexistantException {
		if (x < 0  || y < 0 || x >= largeur || y >= hauteur) {
			throw new TerrainInexistantException("Les coordonnées ne peuvent pas être négative" 
		+ " ou hors de la taille de la carte");
		}
		return this.terrains[x][y];
	}
}
