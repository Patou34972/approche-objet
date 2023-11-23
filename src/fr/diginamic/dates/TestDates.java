package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

    public static void main(String[] args) {
        //Créez une instance de la classe java.util.Date à la date du jour
        Date d1 = new Date();
        System.out.println(d1);

        //Affichez l’instance ainsi créée au format suivant : jour/mois/année (sans la partie heure)
        Date d2 = new Date(116, 4,19);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormatee = format.format(d2);
        System.out.println(dateFormatee);

        //Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30 secondes
        Date d3 = new Date(116, 4,19, 23, 59, 30);
        SimpleDateFormat formateur= new SimpleDateFormat("dd/MM/yyyy 'à' HH:mm:ss");
        String dateFormate = formateur.format(d3);
        System.out.println(dateFormate);

        //Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde
        Date d4 = new Date(116, 4,19, 23, 59, 30);
        SimpleDateFormat fort= new SimpleDateFormat("yyyy/MM/dd 'à' HH:mm:ss");
        String dateFormat = fort.format(d4);
        System.out.println(dateFormat);

        //Créez une instance de Date contenant la date/heure système et affichez-la au même format que ci-dessus.
        SimpleDateFormat date1= new SimpleDateFormat("yyyy/MM/dd 'à' HH:mm:ss");
        String dateF = date1.format(d1);
        System.out.println(dateF);

    }
}
