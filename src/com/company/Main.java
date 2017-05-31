package com.company;

public class Main {

    public static void main(String[] args) {

        Piano p1 = new Piano();
        p1.add(Instrumento.Nota.DO);
        p1.add(Instrumento.Nota.RE);
        p1.add(Instrumento.Nota.MI);
        p1.add(Instrumento.Nota.FA);
        p1.add(Instrumento.Nota.SOL);
        p1.add(Instrumento.Nota.LA);
        p1.add(Instrumento.Nota.SI);
        p1.interpretar();


        Guitarra g1 = new Guitarra();
        g1.add(Instrumento.Nota.DO);
        g1.add(Instrumento.Nota.RE);
        g1.add(Instrumento.Nota.MI);
        g1.add(Instrumento.Nota.FA);
        g1.add(Instrumento.Nota.SOL);
        g1.add(Instrumento.Nota.LA);
        g1.add(Instrumento.Nota.SI);
        g1.interpretar();

        System.out.println(g1);
        System.out.println(p1);

    }

}
