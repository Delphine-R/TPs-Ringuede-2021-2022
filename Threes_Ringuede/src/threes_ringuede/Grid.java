package threes_ringuede;

public class Grid {

    Element[][] gridEl;

    public Grid() {
        // la grille est composé de 4x4 éléments qui ont une valeur null si vide.

        gridEl = new Element[3][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gridEl[i][j] = new Element();
            }
        }
    }

    public moveEl(Direction dir) { // IDEE POUR LA PROCHAINE FOIS / LECTURE DE DROITE A GAUCHE POUR LE DECALLAGE AVEC UN WHILE CASE = NULL
        // deplace tous les elements dans la direction en parametre

        // cas décallage vers la droite
        // lecture de la grille en partant de la direction opposée 
        // ex: decallage de gauche à droite => lecture de droite à gauche
        for (int i = 3; i >= 0; i--) {
            
            int cnt = 4; // compte les cases vides par ligne 
            
            while ( cnt != 0){
                
                cnt = 0;
            
                //test si il reste des cases vides pour ensuite sortir du while 
// PROBLEME il peut rester des cases vides meme si le decallage est termine
                for (int j = 0; j < 4 ; j--) {               
                
                    if (gridEl[i][j] == null){
                        cnt ++;
                    }
                }
                
                for (int col = 3; col >= 0; col--) {               
                
                    if (gridEl[i][col] == null){
                        cnt ++; 

                       gridEl[i][col] = gridEl[i][col-1];
                    }       
            }
            
            for (int j = 0; j <4 ; j--) {               
                
                if (gridEl[i][j] == null){
                    cnt ++; // nbr de décallage à réaliser, juste pour remplir les cases vides
                    
            for (int k = 0 ; k < cnt; k ++){
                
                for (int col = 3; col >= 0; col--) {               
                
                    if (gridEl[i][j] == null){
                        cnt ++; 

                       gridEl[i][j] = gridEl[i][j-1];
                    }               
                }
            }        
            
        }
               
    }

    public boolean gridFull() {
        //test si la grille est remplie i.e. la partie est finie.

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (gridEl[i][j] == null) { // cherche une seule case null
                    return false;
                }
            }
        }
        return true;
    }
}
