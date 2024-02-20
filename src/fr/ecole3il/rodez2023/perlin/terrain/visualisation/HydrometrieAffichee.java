package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum HydrometrieAffichee {
	SEC(0.33),
	MOYEN(0.66),
	HUMIDE(1.0);
	
	final double valeur;
	
	HydrometrieAffichee(double hydrometrie) {
		this.valeur = hydrometrie;
	}
	
	public double getHydrometrie() {
		return this.valeur;
	}
}
