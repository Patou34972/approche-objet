package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adresse;
    public Personne(String nom, String prenom, AdressePostale adresse)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public void affichage(){
        System.out.println("Nom et prénom en majuscules : " + nom.toUpperCase() + " " + prenom);
    }
    public void setNom( String nouvNom) {
        nom = nouvNom;

    }
    public void setPrenom( String nouPrenom ) {
        prenom = nouPrenom;
    }
    public void setAdresse( AdressePostale nouvAdresse) {
        adresse = nouvAdresse;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public AdressePostale getAdresse() {
        return adresse;
    }


}
