package atelier;

import java.util.Date;

public class Tableau extends Oeuvre {
    private int hauteur;
    private int largeur;

    public Tableau(String auteur, String nom, Date date){
        super(auteur, nom, date);
    }

    public Tableau(String auteur, String nom){
        super(auteur, nom);
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public String toString(){

        return "La hauteur du tableau est : " + this.hauteur + "\n"
                + "La largeur du tableau est : " + this.largeur;



    }
}
