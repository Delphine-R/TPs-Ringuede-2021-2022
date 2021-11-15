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
    
    public void ajouterJeton(Jeton unJeton) {
        int rang = 0;
        for (int i=0; i<ListeJetons.length; i++){
            if (ListeJetons[i]== null){
                rang = i;
                break;
            }
        }
        ListeJetons[rang] = unJeton;
    }
    
    /*
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs ++;
    }
    
    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs>0){
            nombreDesintegrateurs --;
        }
    }
    */
        }
