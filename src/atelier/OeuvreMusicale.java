package atelier;


import java.util.Date;

public class OeuvreMusicale extends Oeuvre{
    private int type;
    private int duree;

    public OeuvreMusicale(String auteur, String nom, Date date, int type, int duree) {
        super(auteur, nom, date);
        this.type = type;
        this.duree = duree;
    }

    public OeuvreMusicale(String auteur, String nom, int type, int duree) {
        super(auteur, nom);
        this.type = type;
        this.duree = duree;
    }

    public int getDuree() {
        return duree;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "OeuvreMusicale{" +
                "type=" + type +
                ", duree=" + duree +
                '}';
    }
}
