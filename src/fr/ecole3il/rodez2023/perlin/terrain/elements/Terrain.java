package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class Terrain {

    private double hydrometrie, temperature, altitude;

    /**
     * Construit un terrain à l'aide de trois paramètres
     * @param hydrometrie
     * @param temperature
     * @param altitude
     * @throws MauvaiseValeurException
     */
    public Terrain(double altitude, double hydrometrie, double temperature) throws MauvaiseValeurException {
        try {
            if (hydrometrie < 0 || hydrometrie > 1
                || temperature < 0 || temperature > 1
                || altitude < -1 || altitude > 1) {
                throw new MauvaiseValeurException("La valeur doit être comprise entre 0 et 1.");
            }

            this.hydrometrie = hydrometrie;
            this.temperature = temperature;
            this.altitude = altitude;
        } catch (MauvaiseValeurException e) {
            System.err.println(e.getMsg());
        }
    }

    /**
     * Retourne l'hydrométrie du terrain
     * @return
     */
    public double getHydrometrie() { return hydrometrie; }

    /**
     * Retourne la température du terrain
     * @return
     */
    public double getTemperature() { return temperature; }

    /**
     * Retourne l'altitude du terrain
     * @return
     */
    public double getAltitude() { return altitude; }

    /**
     * Retourne le type de terrain généré
     * @param dt
     * @return
     */
    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {
        return dt.determinerTerrain(altitude, hydrometrie, temperature);
    }

}
