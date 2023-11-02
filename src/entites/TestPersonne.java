package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr3 = new AdressePostale( 1, "Allée Michel piquemal", 34830, "Jacou");

        Personne pe1 = new Personne("ELIE DIT COSAQUE", "Patrice", adr3);

        Personne pe2 = new Personne("Michel", "Patrick");
        pe2.adresse = adr3;
        pe2.affichage();
        pe2.setNom("Henry");
        pe2.affichage();
        pe2.setPrenom("Xavier");
        pe2.affichage();
        System.out.println(pe2.getNom());

    }
}
