    package sp4_console_ringuede;

/**
 *
 * @author delph
 */

public class Grille {

   

    Cellule [][] CellulesJeu;

       

    public Grille(){

        CellulesJeu = new Cellule [6][7];

       

        for (int i = 0 ; i < 6 ; i++){

            for (int j = 0 ; j < 7 ; j++){

                CellulesJeu[i][j] = new Cellule();

            }

        }

    }
    

    public boolean ajouterJetonDansColonne(Jeton m, int c){

        int colonne = c - 1;

        Jeton j = m;

       

        for (int i = 5; i >= 0; i-=1){

            if (i == 0 && CellulesJeu [i][colonne].jetonCourant != null){

                return false;

               

            } else if (CellulesJeu [i][colonne].jetonCourant == null){

                CellulesJeu [i][colonne].affecterJeton(j);

                return true;

               

            }else{

                continue;

            }

           

        }

       return false;

    }

   

    public boolean etreRemplie(){

        for (int i = 0; i < 6; i++){

            for (int j = 0; j < 7; j++){

                if (CellulesJeu [i][j].jetonCourant != null){

                    continue;

                }else{

                    return false; // Ca finit directement la methode? oui

                }

            }

        }

        return true; // Ca return true même si ça a déja return le false avant? non

    }

   

    public void viderGrille(){

        for (int i = 0; i < 6; i++){

            for (int j = 0; j < 7; j++){

                CellulesJeu [i][j].jetonCourant = null;

            }

        }

    }

  

    public void afficherGrilleSurConsole(){

       

        for (int i = 0; i < 6; i++){

            System.out.println("");

            for (int j = 0; j < 7; j++){

                if(CellulesJeu [i][j].jetonCourant == null){

                    System.out.print("x ");

                }else if (CellulesJeu [i][j].jetonCourant.lireCouleur() == "Rouge" ){

                    System.out.print("R ");

                }else{

                    System.out.print("J ");

                }

               

            }

        }

    }



    public boolean celluleOccupee(int ligne, int col){

        int l = ligne - 1;

        int c = col - 1;

       

        if (CellulesJeu[ligne][col].jetonCourant == null){

            return false;

        }

        else{

            return true;

        }

   

    }

   

    public String lireCouleurDuJeton(int ligne , int col){

        CellulesJeu[ligne][col].lireCouleurDuJeton();

        return "";

    }

   

    public boolean etreGagnantePourJoueur(Joueur unJoueur){

       

        String uneCouleur = unJoueur.Couleur; //lit la couleur à chercher

       

        //test ligne gagnante

        for (int c=0; c<4; c++){

            for (int l=0; l<6; l++){ //couvre les cases de départ

                for (int i=0; i<4; i++){ //lecture des 4 cases voisines à la case de départ

                    if (!lireCouleurDuJeton(l,c+i).equals(uneCouleur)){

                        break;

                    }

                    else{

                        if (i==3 && lireCouleurDuJeton(l,c+i).equals(uneCouleur) )//si il a atteint la dernière case

                            return true;

                    }

                }

            }

        }

       

        //test colonne gagnante

        for (int c=0; c<7; c++){

            for(int l=0; l<4; l++){

                for (int i=0; i<4; i++){ //lecture des 4 cases voisines à la case de départ

                    if (!lireCouleurDuJeton(l+i,c).equals(uneCouleur)){

                        break;

                    }

                    else{

                        if (i==3 && lireCouleurDuJeton(l+i,c).equals(uneCouleur) )//si il a atteint la dernière case

                            return true;

                    }

                }

               

            }

        }

       

        //test diagonale haute/droite gagnante

        for (int c=0; c<4; c++){

            for(int l=0; l<3; l++){

                for (int i=0; i<4; i++){ //lecture des 4 cases voisines à la case de départ

                    if (!lireCouleurDuJeton(l+i,c+i).equals(uneCouleur)){

                        break;

                    }

                    else{

                        if (i==3 && lireCouleurDuJeton(l+i,c+i).equals(uneCouleur) )//si il a atteint la dernière case

                            return true;

                    }

                }  

            }

        }

       

        //test diagonale basse/droite gagnante

        for (int c=0; c<4; c++){

            for(int l=3; l<6; l++){

                for (int i=0; i<4; i++){ //lecture des 4 cases voisines à la case de départ

                    if (!lireCouleurDuJeton(l-i,c+i).equals(uneCouleur)){

                        break;

                    }

                    else{

                        if (i==3 && lireCouleurDuJeton(l-i,c+i).equals(uneCouleur) )//si il a atteint la dernière case

                            return true;

                    }

                }  

            }

        }

       

        return false; // non gagnant

    }

 

    public boolean colonneRemplie(int colonne){

        int c = colonne - 1;

        for (int i =0; i < 6; i++){

            if (CellulesJeu [i][c].jetonCourant == null){

                return false;

            }  

        }

        return true;

       

    }

   

    public void tasserGrille(int colonne){

        int c = colonne - 1;

       

        for (int i = 0; i <5; i++){

            CellulesJeu [i][c].jetonCourant = CellulesJeu [i+1][c].jetonCourant;

           

        }

        CellulesJeu [5][c].jetonCourant = null;


    }
    
    public boolean placerTrouNoir(int ligne , int col){
        int l = ligne-1;
        int c = col-1;
        return CellulesJeu [l][c].placerTrouNoir();
    }

   

    public boolean placerDesintegrateur (int l, int c){

        int l1 = l-1;

        int c1 = c-1;

       

        return CellulesJeu [l1][c1].placerDesintegrateur();
  

    }

   

    public boolean supprimerJeton(int l, int c){

        int l2 = l-1;

        int c2 = c-1;

       

        if (CellulesJeu[l2][c2].jetonCourant == null){

            System.out.println("Jeton absent");

            return false;

        }

        else{

            CellulesJeu[l2][c2].jetonCourant = null;

            return true;

           

        }

          

    }

       

    public Jeton recupererJeton(int l, int c){

        int l3 = l-1;

        int c3 = c-1;

        Jeton reference = CellulesJeu[l3][c3].recupererJeton();

       

        CellulesJeu[l3][c3].jetonCourant = null;

       

        return reference;

    }
 

    }
    
/*
public class Grille { //FINI

    Cellule[][] CellulesJeu;

    public Grille() {
        CellulesJeu = new Cellule [6][7];

        for (int i = 0 ; i < 6 ; i++){
            for (int j = 0 ; j < 7 ; j++){
                CellulesJeu[i][j] = new Cellule();
            }
        }
    }

    public boolean ajouterJetonDansColonne(Jeton m, int c) {
        int colonne = c;
        Jeton j = m;
        
        for (int i = 0; i < 6; i++) {
            
            if (i == 5 && CellulesJeu[i][colonne].jetonCourant != null) {
                return false;
                
            } else if (CellulesJeu[i][colonne].jetonCourant == null) {
                CellulesJeu[i][colonne].affecterJeton(j);
                return true;

            } else {
                continue;
                
            }
        }
        
        return false;
    }

    public boolean etreRemplie() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (CellulesJeu[i][j].jetonCourant == null) {
                    return false; // test si une seule case est vide
                }
            }
        }
        return true;// cas où la grille est remplie
    }

    public void viderGrille() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                CellulesJeu[i][j].jetonCourant = null;
            }
        }
    }

    public void afficherGrilleSurConsole() {
        
        for (int i = 0; i < 6; i++) {           
            System.out.println(""); 
            
            for (int j = 0; j < 7; j++) {
                System.out.print(CellulesJeu[i][j].jetonCourant + " ");

            }
        }
    }

    public boolean celluleOccupee(int ligne, int col) {

        if (CellulesJeu[ligne][col].jetonCourant == null) {
            return false;
        } 
        else {
            return true;
        }
    }

    public String lireCouleurDuJeton(int ligne , int col){
        CellulesJeu[ligne][col].lireCouleurDuJeton();
        return "";
    }

    public boolean etreGagnantePourJoueur(Joueur unJoueur){

        String uneCouleur = unJoueur.Couleur; //lit la couleur à chercher

        //test ligne gagnante
        for (int c=0; c<4; c++){
            for (int l=0; l<6; l++){ //couvre les cases de départ

                for (int i=0; i<4; i++){ //lecture des 4 cases voisines à la case de départ
                    if (!lireCouleurDuJeton(l,c+i).equals(uneCouleur)){
                        break;
                    }
                    else{
                        if (i==3 && lireCouleurDuJeton(l,c+i).equals(uneCouleur) )//si il a atteint la dernière case
                            return true;
                    }
                }
            }
        }

        //test colonne gagnante
        for (int c=0; c<7; c++){
            for(int l=0; l<4; l++){
                for (int i=0; i<4; i++){ //lecture des 4 cases voisines à la case de départ
                    if (!lireCouleurDuJeton(l+i,c).equals(uneCouleur)){
                        break;
                    }
                    else{
                        if (i==3 && lireCouleurDuJeton(l+i,c).equals(uneCouleur) )//si il a atteint la dernière case
                            return true;
                    }
                }

            }
        }

        //test diagonale haute/droite gagnante
        for (int c=0; c<4; c++){
            for(int l=0; l<3; l++){
                for (int i=0; i<4; i++){ //lecture des 4 cases voisines à la case de départ
                    if (!lireCouleurDuJeton(l+i,c+i).equals(uneCouleur)){
                        break;
                    }
                    else{
                        if (i==3 && lireCouleurDuJeton(l+i,c+i).equals(uneCouleur) )//si il a atteint la dernière case
                            return true;
                    }
                }
            }
        }

        //test diagonale basse/droite gagnante
        for (int c=0; c<4; c++){
            for(int l=3; l<6; l++){
                for (int i=0; i<4; i++){ //lecture des 4 cases voisines à la case de départ
                    if (!lireCouleurDuJeton(l-i,c+i).equals(uneCouleur)){
                        break;
                    }
                    else{
                        if (i==3 && lireCouleurDuJeton(l-i,c+i).equals(uneCouleur) )//si il a atteint la dernière case
                            return true;
                    }
                }
            }
        }

        return false; // non gagnant
    }

    public boolean colonneRemplie(int colonne) {

        int c = colonne;

        for (int i = 0; i < 6; i++) {
            if (CellulesJeu[i][c].jetonCourant == null) {
                return false;
            }
        }
        return true;
    }
    
    public void tasserGrille(int colonne){
        int c = colonne - 1;

        for (int i = 0; i <5; i++){
            CellulesJeu [i][c].jetonCourant = CellulesJeu [i+1][c].jetonCourant;
        }
        CellulesJeu [5][c].jetonCourant = null;
    }

    public boolean placerTrouNoir(int ligne , int col){
        int l = ligne-1;
        int c = col-1;
        return CellulesJeu [l][c].placerTrouNoir();
    }
    
    public boolean placerDesintegrateur (int l, int c){
        int l1 = l-1;
        int c1 = c-1;
        return CellulesJeu [l1][c1].placerDesintegrateur();
    }
    
    public boolean supprimerJeton(int l, int c){
        int l2 = l-1;
        int c2 = c-1;

        if (CellulesJeu[l2][c2].jetonCourant == null){
            System.out.println("Jeton absent");
            return false;
        }

        else{
            CellulesJeu[l2][c2].jetonCourant = null;
            return true;
        }
    }
    
    public Jeton recupererJeton(int l, int c){
        int l3 = l-1;
        int c3 = c-1;
        Jeton reference = CellulesJeu[l3][c3].recupererJeton();
        CellulesJeu[l3][c3].jetonCourant = null;
        return reference;
    }
}
*/