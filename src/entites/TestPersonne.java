package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr3 = new AdressePostale( 1, "Allée Michel piquemal", 34830, "Jacou");
       // adr3.numeroRue = 1;
       // adr3.libelleRue = "Allée Michel Piquemal";
       // adr3.codePostal = 34830;
        //adr3.ville = "Jacou";

        Personne pe1 = new Personne("ELIE DIT COSAQUE", "Patrice", adr3);
        //pe1.nom = "ELIE DIT COSAQUE";
       // pe1.prenom = "Patrice";
        //pe1.adresse = adr3;

        Personne pe2 = new Personne("MICHEL", "Patrick", adr3);
    }
}
