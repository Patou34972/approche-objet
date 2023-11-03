package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte("Compte Normal", 1000);
        comptes[1] = new CompteTaux("Compte avec Taux", 2000, 0.05);
        for (Compte compte : comptes) {
            System.out.println(compte);
        }

        Compte cpt = new Compte("AR125145", 269);
        System.out.println(cpt);



    }
}
