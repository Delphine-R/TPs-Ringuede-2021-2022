package sp4_console_ringuede;

/**
 *
 * @author delph
 */

import java.util.Scanner;//permet les entrées de l'utilisateur

public class Partie {//partie est la classe
    
    Joueur [] ListeJoueurs = new Joueur [2];// attribut ListeJoeur de type : tableau rempli de type Joueur
    Joueur joueurCourant;
    Grille grilleJeu;
    int JC = 3; //JC est un entier qui permet de désigner quel joueur est le joueur courant.
    // JC est égal à 3 début de partie, ensuite il va alterner entre 0 et 1 ce qui correspond au rang dans l'array ListeJoueurs.

    public void attribuerCouleursAuxJoueurs(){
        ListeJoueurs[0].affecterCouleur("Rouge");
        ListeJoueurs[1].affecterCouleur("Jaune");
    }

    public void initialiserPartie(){
      grilleJeu = new Grille();
      
      for (int i = 0; i < 21; i++){
          Jeton jeton1 = new Jeton("Rouge");
          Jeton jeton2 = new Jeton("Jaune");
          ListeJoueurs[0].ajouterJeton(jeton1);
          ListeJoueurs[1].ajouterJeton(jeton2);
      }
    }
    
    public void debuterPartie(){
        
        /*
        
        - initialise les objets : jetonCourant, joueurCourant ( et joueurCourant = listeJoueur[0] )
        - montrer la grille
        - possibilité de placer un desintegrateur ou non ***
        - choix de col pour placer le jeton
        - test de l'emplacement sinon : boucle
        - verif si c'est trou noir ou desintegrateur
        - verif gagnant
        - verif fin de partie avec le nbJetonRestant
        
        Scanner sc = new Scanner(System.in);//permet les entrées de l'utilisateur
        
        Jeton jetonCourant = new Jeton();
       
        
        grilleJeu.afficherGrilleSurConsole();
        
        System.out.println("C'est à votre tour de placer votre jeton\nEntrez un numéro de colone");
        int colonne = sc.nextInt();
        boolean placementDispo = grilleJeu.colonneRemplie(colonne);
        while (placementDispo = false) {
           System.out.println("Erreur : la colonne " + colonne + " est remplie.\nEntrez un autre numéro de colone"); 
           colonne = sc.nextInt();
           placementDispo = grilleJeu.colonneRemplie(colonne);
        }
        
        grilleJeu.ajouterJetonDansColonne(jetonCourant, colonne);
        
        */
        
        Scanner sc = new Scanner(System.in);
        boolean partieFinie = false;
        
        Joueur joueurCourant = new Joueur("joueur");
        Joueur adversaireCourant = new Joueur("adversaire");
        Jeton jetonCourant = new Jeton();
        
        if(JC == 0) {
            joueurCourant = ListeJoueurs[1];   
            adversaireCourant = ListeJoueurs[0];
            jetonCourant.Couleur = joueurCourant.Couleur;
        }
        else{
            joueurCourant = ListeJoueurs[0];
            adversaireCourant = ListeJoueurs[1];
            jetonCourant.Couleur = joueurCourant.Couleur;
        }
        
        if (grilleJeu.etreRemplie() == true){
            partieFinie = true;
        }
        if (grilleJeu.etreGagnantePourJoueur(adversaireCourant) == true){
            partieFinie = true;
        }
        
        if (partieFinie!= true){
            
            grilleJeu.afficherGrilleSurConsole();
            
            System.out.println("C'est à votre tour de placer votre jeton\nEntrez un numéro de colone");
            int colonne = sc.nextInt();
            
            boolean placementDispo = grilleJeu.colonneRemplie(colonne);// test si l'emplacement est dispo
            
            while (placementDispo == false) { // à refaire jusqu'à ce que le choix de colonne soit valide
               System.out.println("Erreur : la colonne " + colonne + " est remplie.\nEntrez un autre numéro de colone"); 
               colonne = sc.nextInt();
               placementDispo = grilleJeu.colonneRemplie(colonne);
            }
        
        grilleJeu.ajouterJetonDansColonne(jetonCourant, colonne);
            
            
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