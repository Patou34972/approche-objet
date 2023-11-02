package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale();
        adr1.numeroRue = 1;
        adr1.libelleRue = "Allée Michel Piquemal";
        adr1.codePostal = 34830;
        adr1.ville = "Jacou";

        AdressePostale adr2 = new AdressePostale();
        adr2.numeroRue = 2;
        adr2.libelleRue = "RUE MICHEL";
        adr2.codePostal = 34000;
        adr2.ville = "Montpellier";
    }
}
