package fr.diginamic.chaines;


import java.text.Format;

public class TestStringBuilder {


    public static void main(String[] args) {
        long debut = System.currentTimeMillis();
        String ch ="";
        for (int i=0; i<100000; i++) {
            ch= ch+i;
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        long debut1 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<100000; i++) {
            builder.append(i);
        }
        long fin1 = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes :" + (fin1 - debut1));
    }


}
