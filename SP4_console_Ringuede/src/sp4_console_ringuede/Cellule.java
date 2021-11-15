package sp4_console_ringuede;

/**
 *
 * @author delph
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule () {
        jetonCourant = null;
        trouNoir = false;
        desintegrateur = false;
    }
        
    public boolean affecterJeton(Jeton unJeton) {
        if (jetonCourant == null){
            jetonCourant = unJeton;
            return true;
        }
        else{
            return false;
        }  
    }
    
    /*
    public Jeton recupererJeton(){
    
    }
    
    public boolean supprimerJeton (){
    
    }
    
    public boolean placerTrouNoir (){
    
    }
    
    public boolean placerDesintegrateur(){
    
    }
    
    public boolean presenceTrouNoir(){
    
    }
    
    public boolean presenceDesintegrateur(){
    
    }
*/
    
    public String lireCouleurDuJeton(){
        if (jetonCourant == null){
            return "vide";
        }
        else{
            return jetonCourant.Couleur ;
        }
    }
    /*
    public boolean recupererDesintegrateur(){
    
    }
    
    public boolean activerTrouNoir(){
    
    }
    */
 
    
    
    
    
    
}
