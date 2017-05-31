package com.company;

/**
 * Created by e-imb on 31/05/2017.
 */
public abstract class Instrumento {
    public enum Nota {DO, RE, MI, FA, SOL, LA, SI}

    protected Nota notas[];
    protected int contNotas;
    protected int maxNotas = 100;

    public Instrumento() {
        notas = new Nota[maxNotas];
        contNotas = 0;

    }
    void add(Nota n){
        if(contNotas < notas.length){
            notas[contNotas]= n;
            contNotas++;
        }

    }
    abstract void interpretar();

}

