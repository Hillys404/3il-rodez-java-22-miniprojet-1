package fr.ecole3il.rodez2023.perlin.terrain.carte;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import fr.ecole3il.rodez2023.perlin.Utils;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TerrainInexistantException;

/**
 * La classe ManipulateurCarte fournit des méthodes pour charger et enregistrer des cartes.
 * Elle permet de manipuler des objets Carte en utilisant des fichiers sur le disque.
 * 
 * @author proussille
 */
public class ManipulateurCarte {

    /**
     * Charge une carte à partir d'un fichier spécifié.
     * @param cheminFichier Le chemin vers le fichier contenant les données de la carte.
     * @return Une instance de Carte chargée à partir du fichier.
     */
    public static Carte chargerCarte(String cheminFichier) {
        return new Carte(Utils.lireContenuFichier(cheminFichier));
    }
    
    /**
     * Enregistre une carte dans un fichier spécifié.
     * @param carte La carte à enregistrer.
     * @param cheminFichier Le chemin vers le fichier où la carte sera enregistrée.
     * @throws TerrainInexistantException 
     */
    public static void enregistrerCarte(Carte carte, String cheminFichier) throws TerrainInexistantException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cheminFichier))) {
            // Écriture des métadonnées de la carte
            writer.write(carte.getNom() + "\n");
            writer.write(carte.getLargeur() + "\n");
            writer.write(carte.getHauteur() + "\n");

            // Écriture des éléments de terrain
            for (int y = 0; y < carte.getHauteur(); y++) {
                for (int x = 0; x < carte.getLargeur(); x++) {
                    Terrain terrain = carte.getTerrain(x, y);
                    writer.write(terrain.getAltitude() + " ");
                    writer.write(terrain.getHydrometrie() + " ");
                    writer.write(terrain.getTemperature() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
