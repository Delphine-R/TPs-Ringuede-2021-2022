package sp4_console_ringuede;

/**
 *
 * @author delph
 */
public class Cellule {

    Jeton jetonCourant;

    boolean desintegrateur;

    boolean trouNoir;

    public Cellule() { // Constructeur qui sera applé dès que l'on cré une cellule.

        jetonCourant = null;

        desintegrateur = false;

    }

    public boolean affecterJeton(Jeton v) {

        if (jetonCourant == null) {

            jetonCourant = v;

            return true;

        } else {

            return false;

        }

    }

    public String lireCouleurDuJeton() {

        if (jetonCourant != null) {

            String couleur = jetonCourant.lireCouleur();

            return couleur;

        } else {

            return "vide";

        }

    }

    public Jeton recupererJeton() {

        return jetonCourant;

    }

    public boolean supprimerJeton() {

        if (jetonCourant == null) {

            System.out.println("Pas de jeton présent");

            return false;

        } else {

            jetonCourant = null;

            return true;

        }

    }

    public boolean placerDesintegrateur() {

        if (desintegrateur == false) {
            desintegrateur = true;
            return true;

        } else {
            //System.out.println("désintegrateur déjà présent");
            return false;

        }

    }

    public boolean presenceDesintegrateur() {

        if (desintegrateur == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean recupererDesintegrateur() {

        if (desintegrateur == true) {
            desintegrateur = false;
            return true;

        } else {
            System.out.println("Aucun désintegrateur présent");
            return false;
        }
    }

    public boolean placerTrouNoir() {
        
        if (trouNoir == false) {
            trouNoir = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean presenceTrouNoir() {
        
        if (trouNoir == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean activerTrouNoir() {
        
        if (presenceTrouNoir() == true) {
            trouNoir = false;
            jetonCourant = null;
            return true;
        } else {
            return false;
        }
    }

}
/*
public class Cellule { //FINI

    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;

    public Cellule() {
        jetonCourant = null;
        trouNoir = false;
        desintegrateur = false;
    }

    public boolean affecterJeton(Jeton unJeton) {
        if (jetonCourant == null) {
            jetonCourant = unJeton;
            return true;
        } else {
            return false;
        }
    }

    public String lireCouleurDuJeton() {
        if (jetonCourant == null) {
            return "vide";
        } else {
            return jetonCourant.Couleur;
        }
    }

    public Jeton recupererJeton() {
        return jetonCourant;
    }

    public boolean supprimerJeton() {

        if (jetonCourant == null) {
            System.out.println("Pas de jeton présent");
            return false;

        } else {
            jetonCourant = null;
            return true;
        }
    }

    public boolean placerDesintegrateur() {

        if (desintegrateur == false) {
            desintegrateur = true;
            return true;

        } else {
            System.out.println("désintegrateur déjà présent");
            return false;
        }

    }

    public boolean presenceDesintegrateur() {

        if (desintegrateur == true) {
            return true;
        }
        else {
            return false;
        }

    }

    public boolean recupererDesintegrateur() {

        if (desintegrateur == true) {
            desintegrateur = false;
            return true;
        }
        else {
            System.out.println("Aucun désintegrateur présent");
            return false;
        }
    }

    public boolean placerTrouNoir() { // sans paramètres normalement
        if (trouNoir == false) {
            trouNoir = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean presenceTrouNoir() {
        if (trouNoir == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean activerTrouNoir() {
        if (presenceTrouNoir() == true) {
            trouNoir = false;
            jetonCourant = null;
            return true;
        } else {
            return false;
        }
    }

}
 */
