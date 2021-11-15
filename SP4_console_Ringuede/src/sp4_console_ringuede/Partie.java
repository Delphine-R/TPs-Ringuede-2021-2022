package sp4_console_ringuede;

/**
 *
 * @author delph
 */


public class Partie {

   

    Joueur [] ListeJoueurs = new Joueur [2];

    Joueur joueurCourant;

    Grille grilleJeu;

   

    public void attribuerCouleursAuxJoueurs(){

        ListeJoueurs[0].affecterCouleur("Rouge");

        ListeJoueurs[1].affecterCouleur("Jaune");

       

    }

   

    public void initialiserPartie(){

      grilleJeu = new Grille();

      Jeton jeton1 = new Jeton("Rouge");

      Jeton jeton2 = new Jeton("Jaune");

     

      for (int i = 0; i < 21; i++){

          ListeJoueurs[0].ajouterJeton(jeton1);

          ListeJoueurs[1].ajouterJeton(jeton2);

       

      }

    

    }

   

}


/** ma version avant de copier celle d'anthony
public class Partie {
    
    Joueur [] ListeJoueurs;
    Joueur ListeJoueurs;
    Grille grilleJeu;
    
    public Partie(Joueur, Joueur){
    
    }
    
    public void initialiserPartie(){
        
        
    }
    
    public void debuterPartie(){
        
        /*
        
        - montrer la grille
        - possibilité de placer un desintegrateur ou non
        - choix de col et de lig pour placer le jeton
        - test de l'emplacement sinon : boucle
        - verif si c'est trou noir ou desintegrateur
        - verif gagnant
        - verif fin de partie avec le nbJetonRestant
        
        */
        /*
        grille.afficherGrilleSurConsole();
        
        
    
    }
    
    public void attribuerCouleursAuxJoueurs(){
    
    }
}
*/