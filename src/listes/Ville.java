package listes;

public class Ville implements Comparable<Ville> {

    String nom;
    int nbHabitants;

    public Ville(int nbHabitants, String nom) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }



    @Override
    public String toString() {
        return "Ville{" +
                ", nom='" + nom + '\'' +
                "nbHabitants=" + nbHabitants +
                '}';
    }

    @Override
    public int compareTo(Ville o) {
        return 0;
    }
}
