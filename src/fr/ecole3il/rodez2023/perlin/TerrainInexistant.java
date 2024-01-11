package fr.ecole3il.rodez2023.perlin;

public class TerrainInexistant extends ArrayIndexOutOfBoundsException {

	private String msg;

    public TerrainInexistant(String msg) {
        super();
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
	
}
