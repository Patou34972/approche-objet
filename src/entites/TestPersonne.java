package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr3 = new AdressePostale( 1, "Allée Michel piquemal", 34830, "Jacou");

        Personne pe1 = new Personne("ELIE DIT COSAQUE", "Patrice", adr3);

        Personne pe2 = new Personne("MICHEL", "Patrick");
        pe2.adresse = adr3;
    }
}
