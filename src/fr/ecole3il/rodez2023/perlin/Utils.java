package fr.ecole3il.rodez2023.perlin;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * 
 * @author proussille
 * La classe Utils fournit des méthodes utilitaires pour diverses opérations génériques.
 * Elle offre des fonctionnalités telles que le chargement d'images, le mélange de tableaux, etc.
 */
public class Utils {

    /** Le répertoire de stockage des tuiles */
    public static final String REPERTOIRE_TUILES = "data/tiles/";

    /**
     * Charge une image à partir d'un fichier spécifié.
     * @param nomFichier Le nom du fichier image à charger.
     * @return Une instance de BufferedImage représentant l'image chargée.
     */
    public static BufferedImage chargerTuile(String nomFichier) {
        try {
            String imagePath = REPERTOIRE_TUILES + nomFichier;
            BufferedImage image = ImageIO.read(new File(imagePath));
            return image;
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        // Ce code ne sera en pratique jamais exécuté.
        return null;
    }

    /**
     * Mélange les éléments d'un tableau d'entiers en utilisant une graine spécifiée,
     * avec l'algorithme Fisher-Yates (ou Knuth Shuffle).
     * @param tab Le tableau à mélanger.
     * @param seed La graine utilisée pour le mélange.
     * @return Un nouveau tableau contenant les éléments mélangés.
     * 
     * @author philibert roquart, fainéant
     */
    public static int[] melanger(int[] tab, long seed) {
        // Création d'un objet Random qui va servir à générer des valeurs des index du tableau
        Random rdm = new Random(seed);

        for (int i = tab.length -1; i > 0; i--) {
            int valAMelanger = rdm.nextInt(i + 1);

            // Echange des valeurs entre deux index à l'aide de variables temporaires
            int tmp1 = tab[i];
            int tmp2 = tab[valAMelanger];
            tab[i] = tmp2;
            tab[valAMelanger] = tmp1;
        }

        return tab;
    }

    /**
     * Retourne le plus petit des deux nombres fournis.
     * @param width Le premier nombre.
     * @param height Le deuxième nombre.
     * @return Le plus petit des deux nombres.
     * 
     * @author Jade Causse
     */
    public static double min(int width, int height) {
        // Compare les deux valeurs numériquement
        int min = Integer.compare(width, height);
        if (min > 0 || min == 0) return width;
        return height;
    }

    /**
     * Lit le contenu d'un fichier texte et le retourne sous forme de chaîne de caractères.
     * @param cheminFichier Le chemin vers le fichier à lire.
     * @return Le contenu du fichier lu sous forme de chaîne de caractères.
     * 
     * Cette fonction n'est pas commentée, on la verra en Java Avancé.
     */
    public static String lireContenuFichier(String cheminFichier) {
        StringBuilder contenu = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                contenu.append(ligne).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contenu.toString();
    }    
}

