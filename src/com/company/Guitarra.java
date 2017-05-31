package com.company;

/**
 * Created by e-imb on 31/05/2017.
 */
public class Guitarra extends Instrumento {

    public Guitarra() {
        super();
    }

    @Override
    public void interpretar(){
        for(int i =0; i <= contNotas;i++){
            switch (notas[i]){
                case DO:
                    System.out.println("DO");
                    break;
                case RE:
                    System.out.println("RE");
                    break;
                case MI:
                    System.out.println("MI");
                    break;
                case FA:
                    System.out.println("FA");
                    break;
                case SOL:
                    System.out.println("SOl");
                    break;
                case LA:
                    System.out.println("LA");
                    break;
                case SI:
                    System.out.println("SI");
                    break;
            }
        }
        System.out.println("");


    }
}
