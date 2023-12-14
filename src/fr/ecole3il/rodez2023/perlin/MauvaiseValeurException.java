package fr.ecole3il.rodez2023.perlin;

public class MauvaiseValeurException extends IllegalArgumentException {

    private String msg;

    public MauvaiseValeurException(String msg) {
        super();
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
