package fr.ecole3il.rodez2023.perlin.terrain.elements;

public class TerrainInexistantException extends ArrayIndexOutOfBoundsException{

	public TerrainInexistantException(String message) {
		super(message);
	}
}
