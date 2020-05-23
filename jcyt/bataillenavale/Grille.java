package jcyt.bataillenavale;

import java.util.List;

public class Grille {
    public String nomJoueur;
    public List<Bateau> bateaux;

    public Grille(String a_nomJoueur){
        nomJoueur = a_nomJoueur;
        Bateau torpilleur = new Bateau(2);
        bateaux.add(torpilleur);
        Bateau contreTorpilleur1 = new Bateau(3);
        bateaux.add(contreTorpilleur1);
        Bateau contreTorpilleur2 = new Bateau(3);
        bateaux.add(contreTorpilleur2);
        Bateau croiseur = new Bateau(4);
        bateaux.add(croiseur);     
        Bateau porteAvion = new Bateau(5);
        bateaux.add(porteAvion);
    }
}