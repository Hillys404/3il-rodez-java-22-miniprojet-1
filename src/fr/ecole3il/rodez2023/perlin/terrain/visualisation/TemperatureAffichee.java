package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum TemperatureAffichee {
	FROID(0.0),
	TEMPERE(10.0),
	CHAUD(20.0);
	
	private final double valeur;
	
	TemperatureAffichee(double temperature) {
		this.valeur = temperature;
	}
	
	public double getTemperature() {
		return this.valeur;
	}
}
