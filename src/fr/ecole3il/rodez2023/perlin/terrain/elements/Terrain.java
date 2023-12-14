package fr.ecole3il.rodez2023.perlin.terrain.elements;

public class Terrain {

    private double hydrometrie, temperature, altitude;

    public Terrain(double hydrometrie, double temperature, double altitude) {
        this.altitude = altitude;
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
    }

    public double getHydrometrie() {
        return hydrometrie;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getAltitude() {
        return altitude;
    }
}
