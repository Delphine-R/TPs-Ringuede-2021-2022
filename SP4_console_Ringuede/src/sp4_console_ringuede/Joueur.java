package sp4_console_ringuede;

/**
 *
 * @author delph
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton [] ListeJetons;
    int nombreJetonsRestants;
    int nombreDesintegrateurs;
    
    public Joueur (String unNom) {
        Nom = unNom;
    }
        
    public void affecterCouleur(String uneCouleur) {
        Couleur = uneCouleur;
    }
    
    public boolean ajouterJeton(String unJeton) {
        for (int i=0; i<ListeJetons.length; i++){
            if (ListeJetons[i]== null){
                int rang = i;
                break;
            }
        }
        ListeJetons[rang] = unJeton;
    }
    
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs ++;
    }
    
    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs>0){
            nombreDesintegrateurs --;
        }
    }
    
        
}
