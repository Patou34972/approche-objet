package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
      //  Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du 19 mai 2016 à 23h59 et 30 secondes et affichez-la au format suivant :jour/mois/année
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4 ,19, 23, 59, 30);
        Date date = cal.getTime();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formateur.format(date));

        // Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du jour.

        Calendar calJour = Calendar.getInstance();
        Date dateJour = calJour.getTime();
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formateur2.format(dateJour));

        // Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde


       /* Affichez la même instance avec le nom des jours et des mois en français, russe, chinois et allemand.
        Si vous ne réussissez pas à affichez les caractères russes et chinois, c’est que votre projet Java n’est pas en UTF-8.
        ▪ Dans ce cas :
        • Dans le menu, sélectionnez Window, puis Preferences
        • Dans « type filter text » tapez encoding
        • Sélectionnez alors General >> Workspace
        • Puis, en bas à gauche, dans Text file encoding, sélectionnez Other puis « UTF-8 ».*/

    }
}
