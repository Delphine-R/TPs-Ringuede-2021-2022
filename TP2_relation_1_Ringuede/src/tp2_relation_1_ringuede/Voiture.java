package tp2_relation_1_ringuede;

/**
 *
 * @author delph
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture (String unModele, String uneMarque, int unePuissanceCV){
        Modele = unModele;
        Marque = uneMarque; 
        PuissanceCV = unePuissanceCV;
        Proprietaire = null;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Modèle : " + Modele + "\nMarque : " + Marque + "\nPuissanceCV : " + PuissanceCV;
        return chaine_a_retourner ;
    }
}
