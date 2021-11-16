package sp4_console_ringuede;

/**
 *
 * @author delph
 */
public class Grille {

    Cellule[][] CellulesJeu;

    public Grille() {
        Cellule[][] CellulesJeu = new Cellule[6][7];
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
}

/*MA VERSION AVANT DE COPIER CELLE D'ANTHONY
public class Grille {

    Cellule [][] CellulesJeu = new Cellule [6][7];

    public Grille(){

    }

    public boolean ajouterJetonDansColonne(Jeton unJeton , int numColonne ){

        if (CellulesJeu.affecterJeton(unJeton) == false){
            return false;
        }
        else{
            for(int i=0; i<6; i++ ){

        }
        }


    }

    public boolean etreRemplie(){

    }

    public void viderGrille(){

    }

    public void afficherGrilleSurConsole(){

    }

    public boolean celluleOccupee(int ligne, int col){
        if (CellulesJeu[ligne][col].jetonCourant == null){
            return false;
        }
        else{
            return true;
        }

    }//THIS ONE

    public String lireCouleurDuJeton(int ligne , int col){
        CellulesJeu[ligne][col].lireCouleurDuJeton();
        return "";
    }//THIS ONE

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
    //ENV

    public void tasserGrille(){

    }

    public boolean colonneRemplie(int ){

    }

    public boolean placerDesintegrateur(int , int ){

    }

    public boolean placerTrouNoir(int , int){

    }

    public boolean supprimerJeton(int , int){

    }


}
 */
