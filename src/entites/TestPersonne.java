package entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr3 = new AdressePostale();
        adr3.numeroRue = 1;
        adr3.libelleRue = "Allée Michel Piquemal";
        adr3.codePostal = 34830;
        adr3.ville = "Jacou";

        Personne pe1 = new Personne();
        pe1.nom = "ELIE DIT COSAQUE";
        pe1.prenom = "Patrice";
        pe1.adresse = adr3;

    }
}
