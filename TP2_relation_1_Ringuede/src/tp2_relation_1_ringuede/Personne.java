package tp2_relation_1_ringuede;

/**
 *
 * @author delph
 */
public class Personne {
    
    String nom;
    String prenom;
    Voiture [] liste_voitures;
    int nbVoitures;
    
    public Personne( String unNom, String unPrenom){
        nom = unNom;
        prenom = unPrenom;
        liste_voitures = new Voiture [3] ;
        for (int i = 0; i<3; i++){
            liste_voitures[i] = null;
        }
    }
    
    //public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
            
    //}

    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "nom : " + nom + "\nprénom : " + prenom ;
        return chaine_a_retourner ;
    }
}
