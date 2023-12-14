package fr.ecole3il.rodez2023.perlin;

public class MauvaiseValeurException extends IllegalArgumentException {

    private double mauvaiseValeur;

    public MauvaiseValeurException(double mauvaiseValeur) {
        super();
        this.mauvaiseValeur = mauvaiseValeur;
    }

    public double getMauvaiseValeur() {
        return mauvaiseValeur;
    }
}
