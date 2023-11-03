package fr.diginamic.banque.entites;

public class Compte {
    private int numCompte;
    private int soldeCompte;

    public Compte(int numCompte, int soldeCompte)
    {
        this.numCompte = numCompte;
        this.soldeCompte = numCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", soldeCompte=" + soldeCompte +
                '}';
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}
