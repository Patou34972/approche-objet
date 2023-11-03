package fr.diginamic.banque.entites;

public class Compte {
    private String num;
    private int solde;

    public Compte(String num, int solde)
    {
        this.num = num;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "num=" + num +
                ", solde=" + solde +
                '}';
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
}
