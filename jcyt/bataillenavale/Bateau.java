package jcyt.bataillenavale;

import java.util.List;

public class Bateau {
    public int longueur;
    public String nom;
    public List<Position> positions;
    public Boolean coule;
    public Bateau(int a_longueur){
        longueur = a_longueur;
        switch (longueur) {
            case 2:
                nom = "torpilleur";
                break;
            case 3:
                nom = "contre torpilleur";
                break;
            case 4:
                nom = "croiseur";
                break;
            case 5:
                nom = "porte-avions";
                break;
        }
        coule = false;
    }
    public char attaque(Position a_position){
        char retour = 'd';
        return retour;
    }
}