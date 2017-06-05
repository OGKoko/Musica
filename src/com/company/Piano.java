package com.company;

/**
 * Created by e-imb on 31/05/2017.
 */
public class Piano extends Instrumento {

    public Piano(){

        super();
    }

    @Override
    public void interpretar() {
        for(int i =0; i <= contNotas;i++){
            switch (notas[i]){
                case DO:
                    System.out.println("DOrito");
                    break;
                case RE:
                    System.out.println("REpollo");
                    break;
                case MI:
                    System.out.println("MIcasa");
                    break;
                case FA:
                    System.out.println("FAjita");
                    break;
                case SOL:
                    System.out.println("SOlitario");
                    break;
                case LA:
                    System.out.println("LAlaland");
                    break;
                case SI:
                    System.out.println("SIrulo");
                    break;
            }
        }
        System.out.println("");

    }
}
