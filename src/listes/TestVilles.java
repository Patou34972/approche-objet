package listes;

import java.util.ArrayList;
import java.util.List;
public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville>villes= new ArrayList<>();
        villes.add(new Ville(34300, "Nice"));
        villes.add(new Ville(47800, "Carcassonne"));
        villes.add(new Ville(53400, "Narbonne" ));
        villes.add(new Ville(484000, "Lyon" ));
        villes.add(new Ville(9700, "Foix" ));
        villes.add(new Ville(77200, "Pau" ));
        villes.add(new Ville(850700, "Marseille" ));
        villes.add(new Ville(40600, "Tarbes" ));
        Ville vMin = villes.get(0);
        Ville vMax = villes.get(0);


        for (Ville v: villes){
            if (v.getNbHabitants() > vMax.getNbHabitants()) {
                vMax = v;
            }
            if (v.getNbHabitants() < vMin.getNbHabitants()){
                vMin = v;
            }
            if (v.getNbHabitants() >= 100000){
                String nom = v.getNom();
                v.setNom(nom.toUpperCase());
            }
        }
        System.out.println("Ville min:"+vMin);
        System.out.println("Ville max:"+vMax);

        // Suppression ville avec le moins d'habitants
        villes.remove(vMin);

        System.out.println("---------------------------");
        // Affichage final
        for (Ville v: villes){
            System.out.println(v);
        }
    }
}