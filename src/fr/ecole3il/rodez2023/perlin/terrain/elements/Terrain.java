package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class Terrain {

    private double hydrometrie, temperature, altitude;

    public Terrain(double hydrometrie, double temperature, double altitude) throws MauvaiseValeurException {
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

    public double getHydrometrie() { return hydrometrie; }

    public double getTemperature() { return temperature; }

    public double getAltitude() { return altitude; }

    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {

        return null;
    }

}
