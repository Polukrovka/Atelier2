package atelier;

import java.util.Date;

public class Oeuvre {
    private String auteur;
    private String nom;
    private Date date;


    public Oeuvre(String auteur, String nom, Date date){
        this.auteur = auteur;
        this.nom = nom;
        this.date = date;
    }

    public Oeuvre(String auteur, String nom){
        this.auteur = auteur;
        this.nom = nom;
        this.date = new Date();
    }

    public String getAuteur() {
        return auteur;
    }

    public String getNom() {
        return nom;
    }

    public Date getDate() {
        return date;
    }

    public String toString(){
        return "L'auteur de l'oeuvre est : " + this.auteur + "\n"
                + "Le nom de l'oeuvre est : " + this.nom + "\n"
                + "La date de l'oeuvre est : " + this.date;

    }


    public boolean equals(Oeuvre obj){
        if (this.auteur == null) if (obj.auteur != null) return false;
        if (obj.auteur == null) if (this.auteur != null) return false;
        if (!this.auteur.equals(obj.auteur)) return false;

        if (this.nom == null) if (obj.nom != null) return false;
        if (obj.nom == null) if (this.nom != null) return false;
        if (!this.nom.equals(obj.nom)) return false;

        if (this.date == null) if (obj.date != null) return false;
        if (obj.date == null) if (this.date != null) return false;
        if (!this.date.equals(obj.date)) return false;

        return true;



    }


}
