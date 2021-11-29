package sp4_console_ringuede;

/**
 *
 * @author delph
 */
import java.util.Scanner;//permet les entrées de l'utilisateur
import java.util.Random; //permet de générer des numéros aléatoires

public class Partie {

    Joueur[] ListeJoueurs = new Joueur[2];

    Joueur joueurCourant;

    Grille grilleJeu;

    int JC = 3;//JC est un entier qui permet de désigner quel joueur est le joueur courant.
    // JC est égal à 3 début de partie, ensuite il va alterner entre 0 et 1 ce qui correspond au rang dans l'array ListeJoueurs.

    public Partie() {
    }

    public void attribuerCouleursAuxJoueurs() {

        double nb = Math.random();

        int nb1;
        int nb2;

        if (nb >= 0.5) {
            nb1 = 1;

        } else {
            nb1 = 0;

        }
        nb2 = 1 - nb1;

        ListeJoueurs[nb1].affecterCouleur("Rouge");
        ListeJoueurs[nb2].affecterCouleur("Jaune");

    }

    public void initialiserPartie() {

        Joueur joueur1;
        Joueur joueur2;

        grilleJeu = new Grille();
        grilleJeu.viderGrille();

        Scanner j1 = new Scanner(System.in);

        System.out.println("Rentrez le nom du Joueur 1 :");
        joueur1 = new Joueur(j1.nextLine());

        System.out.println("Rentrez le nom du Joueur 2 :");
        joueur2 = new Joueur(j1.nextLine());

        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;

        attribuerCouleursAuxJoueurs();

        for (int i = 0; i < 21; i++) {

            Jeton jeton1 = new Jeton(ListeJoueurs[0].Couleur);

            Jeton jeton2 = new Jeton(ListeJoueurs[1].Couleur);

            ListeJoueurs[0].ajouterJeton(jeton1);

            ListeJoueurs[1].ajouterJeton(jeton2);

        }

        Random alea = new Random();

        int cpt = 0;

        Joueur JoueurCourant;
       
        
        
        int l_trouNoir;

        int col_trouNoir;

        int l_desin;

        int col_desin;

 

        for (int j = 0; j < 5; j++) {

            l_trouNoir = alea.nextInt(5) + 1;

            col_trouNoir = alea.nextInt(6) + 1;

            /* ici le random envoie un nbr aleatoire entre 0 et 6 sauf que le

                reste du programme gère les entrées du joueurs cad les numéros

                de colonnes entre 1 et 7 d'ou le plus 1.*/

            if (grilleJeu.CellulesJeu[l_trouNoir][col_trouNoir].presenceTrouNoir() == true){

                j--;

               

 

            }else{

                grilleJeu.placerTrouNoir(l_trouNoir,col_trouNoir);

                if (j <= 1 && cpt < 2){

                    cpt ++;

                    grilleJeu.placerDesintegrateur(l_trouNoir,col_trouNoir);

                }

            }

            // while (grilleJeu.CellulesJeu[l_trouNoir][col_trouNoir].presenceTrouNoir() == true) {

                // l_trouNoir = alea.nextInt(5) + 1;

                // col_trouNoir = alea.nextInt(6) + 1;

 

           

            

            // grilleJeu.placerTrouNoir(l_trouNoir, col_trouNoir);

           

            

            // if (j == 0 || j == 1) {

                // grilleJeu.placerDesintegrateur(l_trouNoir, col_trouNoir);

            // }

 

        }

       
        // Déterminer de manière aléatoire le premier joueur à jouer.

        Random r = new Random();

        boolean premier = r.nextBoolean();

        if (premier){

            JoueurCourant = ListeJoueurs[0];

        }else{

            JoueurCourant = ListeJoueurs[1];

        }


        // Afficher le joueur courant.

        //lbl_jcourant_nom.setText(JoueurCourant.Nom);
        
        Random alea1 = new Random();

 

        for (int k = 0; k < 3; k++) {

            l_desin = (alea1.nextInt(5)) + 1;

            col_desin = (alea1.nextInt(6)) + 1;

            while (grilleJeu.CellulesJeu[l_desin][col_desin].presenceDesintegrateur() == true || grilleJeu.CellulesJeu[l_desin][col_desin].presenceTrouNoir() == true ) {

                l_desin = (alea1.nextInt(5)) + 1;

                col_desin = (alea1.nextInt(6)) + 1;
            }
            grilleJeu.placerDesintegrateur(l_desin, col_desin);

        }
        /*Random alea = new Random();
        int cpt = 0;

        for (int j = 0; j < 5; j++) {
            int l_trouNoir = alea.nextInt(5) + 1;
            int col_trouNoir = alea.nextInt(6) + 1;
            // ici le random envoie un nbr aleatoire entre 0 et 6 sauf que le 
               // reste du programme gère les entrées du joueurs cad les numéros 
               // de colonnes entre 1 et 7 d'ou le plus 1.

            if (cpt < 2) {
                if (grilleJeu.placerDesintegrateur(l_trouNoir, col_trouNoir) == false) {
                    cpt--;
                }
                cpt++;
            }
            if (grilleJeu.placerTrouNoir(l_trouNoir, col_trouNoir) == false) {
                j--;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            int l_desin = alea.nextInt(5)+1;
            int col_desin = alea.nextInt(6)+1;
            if (!grilleJeu.placerDesintegrateur(l_desin, col_desin) || grilleJeu.CellulesJeu[l_desin-1][col_desin-1].presenceTrouNoir()) {
                i--;
            }
        } */
    }

    public void debuterPartie() {

        Scanner sc = new Scanner(System.in); // permet de prendre les entrées de l'utilisateur

        boolean partieFinie = false;

        String causePartieFinie = "Non déterminée";

        Joueur joueurCourant;

        Joueur adversaireCourant;

        Jeton jetonCourant = null;

        while (!partieFinie) {

            if (JC == 0) {

                joueurCourant = ListeJoueurs[1];
                adversaireCourant = ListeJoueurs[0];

                JC = 1; // permet de changer de joueur au prochain appel de cette méthode

            } else { // soit 3 pour le premier tour , soit 1

                joueurCourant = ListeJoueurs[0];
                adversaireCourant = ListeJoueurs[1];

                JC = 0;

            }

            jetonCourant = joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1];
            joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = null;
            joueurCourant.nombreJetonsRestants--;

            // 2 tests pour voir si la partie est terminée
            if (grilleJeu.etreRemplie()) {
                partieFinie = true;
                causePartieFinie = "Grille Remplie";
            }

            if (grilleJeu.etreGagnantePourJoueur(adversaireCourant)) {
                partieFinie = true;
                causePartieFinie = "Adversaire gagne";

            }

            //cas où la partie n'est pas terminée, le tour est lancé
            if (!partieFinie) {
                
                grilleJeu.afficherGrilleSurConsole();
                
                System.out.println("\nC'est à votre tour de placer votre jeton\nEntrez un numéro de colone");
                int colonne = sc.nextInt();
                
                boolean placementImpossible = grilleJeu.colonneRemplie(colonne);// test si l'emplacement est dispo
                while (placementImpossible == true) { // à refaire jusqu'à ce que le choix de colonne soit valide

                    System.out.println("Erreur : la colonne " + colonne + " est remplie.\nEntrez un autre numéro de colone");
                    colonne = sc.nextInt();

                    placementImpossible = grilleJeu.colonneRemplie(colonne);

                }

                // le boolean "doitEtreTrue" renvoyé doit etre true car on a deja testé si l'emplacement était dispo.
                boolean doitEtreTrue = grilleJeu.ajouterJetonDansColonne(jetonCourant, colonne);

            }

            // cas où la partie doit être terminée, partieFinie = true
            if (partieFinie) {
                System.out.println("La partie est terminée");

                if ("Adversaire gagne".equals(causePartieFinie)) {
                    System.out.println(adversaireCourant.Nom + " a gagné la partie ");

                } else {
                    System.out.println("Il y a égalité entre les 2 joueurs");

                }

            }
        }

    }

}
