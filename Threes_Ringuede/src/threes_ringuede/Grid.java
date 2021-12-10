package threes_ringuede;

public class Grid {

    Integer[][] grid;

    public Grid() {
        // la grille est composé de 4x4 éléments qui ont une valeur null si vide.

        grid = new Integer[3][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = null;
            }
        }
    }
    
    public void emptyGrid(){
       for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                grid[l][c] = null;
            }
        } 
    }
    
    public void printGrid(){
        for (int l = 3 ; l>=0 ; l--){
            for (int c = 0 ; c < 4 ; c++){
                if (grid[l][c] == null)System.out.print("E");
                else System.out.print(grid[l][c]);
            }
        }
    }
    
    public void packDown(String direction) {
        if ("right".equals(direction)) {
            for (int l = 0; l < 4; l++) {
                for (int c = 3; c > 0; c--) {
                    if (grid[l][c] == null) {
                        grid[l][c] = grid[l][c - 1];
                    }
                }
            }
        }
        if ("left".equals(direction)) {
            for (int l = 0; l < 4; l++) {
                for (int c = 0; c < 3; c++) {
                    if (grid[l][c] == null) {
                        grid[l][c] = grid[l][c + 1];
                    }
                }
            }
        }
        if ("up".equals(direction)) {
            for (int c = 0; c < 4; c++) {
                for (int l = 3; l > 0; l--) {
                    if (grid[l][c] == null) {
                        grid[l][c] = grid[l - 1][c];
                    }
                }
            }
        }
        if ("down".equals(direction)) {
            for (int c = 0; c < 4; c++) {
                for (int l = 0; l < 3; l++) {
                    if (grid[l][c] == null) {
                        grid[l][c] = grid[l + 1][c];
                    }
                }
            }
        }
    }    

    public void move(String direction) {

        //part 1 : déplacement vers la droite
        if ("right".equals(direction)) {

            //1.a) lecture de la ligne jusqu'à arret
            // conditions d'arret : case null ou fusion ou fin de ligne
            for (int l = 0; l < 4; l++) {

                int col = 3;
                boolean fusion = false;

                while (col > 0 && grid[l][col] != null && !fusion) {
                    if (grid[l][col] == grid[l][col - 1]) { //fusion
                        grid[l][col] += grid[l][col - 1];
                        grid[l][col - 1] = null;
                        fusion = true;
                    }
                    col--;
                }
            }

            //1.b) tasser la grille (=décallage de une case si null à cote)
            packDown("right");

            //fin part 1 à refaire pour toutes les directions. 
        }
        //vers la gauche
        if ("left".equals(direction)) {
            for (int l = 0; l < 4; l++) {
                int c = 0;
                boolean f = false;
                while (c < 3 && grid[l][c] != null && !f) {
                    if (grid[l][c] == grid[l][c + 1]) {
                        grid[l][c] += grid[l][c + 1];
                        grid[l][c - 1] = null;
                        f = true;
                    }
                    c++;
                }
            }
            packDown("left");
        }

        //vers le haut
        if ("up".equals(direction)) {
            for (int c = 0; c < 4; c++) {
                int l = 3;
                boolean f = false;
                while (l > 0 && grid[l][c] != null && !f) {
                    if (grid[l][c] == grid[l - 1][c]) {
                        grid[l][c] += grid[l - 1][c];
                        grid[l - 1][c] = null;
                        f = true;
                    }
                    l--;
                }
            }
            packDown("up");
        }

        //vers le bas
        if ("down".equals(direction)) {
            for (int c = 0; c < 4; c++) {
                int l = 0;
                boolean f = false;
                while (l < 3 && grid[l][c] != null && !f) {
                    if (grid[l][c] == grid[l + 1][c]) {
                        grid[l][c] += grid[l + 1][c];
                        grid[l + 1][c] = null;
                        f = true;
                    }
                    l++;
                }
            }
            packDown("down");
        }
    }

    public void moveElVersion2048() {

        //part 1 : deplacement vers la droite.
        for (int l = 0; l < 4; l++) {

            //1.a) décallage vers la droite.
            for (int col = 3; col >= 0; col--) {
                while (grid[l][col] == null) {
                    for (int i = col; i >= 0; i--) { // tous les élements à  
                        grid[l][col] = grid[l][col - 1];
                        grid[l][col - 1] = null;
                    }
                }
            }

            //1.b) addition des elements qui sont égaux.
            for (int col = 3; col >= 0; col--) {
                if (grid[l][col] == grid[l][col - 1]) {
                    grid[l][col] = grid[l][col] + grid[l][col - 1];
                    grid[l][col - 1] = null;
                }
            }

            //1.c) décallage final apres les additions.
            for (int col = 3; col >= 0; col--) {
                while (grid[l][col] == null) {
                    grid[l][col] = grid[l][col - 1];
                    grid[l][col - 1] = null;
                }
            }
        }
        //fin part 1.
    }

    public boolean gridFull() {
        //test si la grille est remplie i.e. la partie est finie.

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (grid[i][j] == null) { // cherche une seule case null
                    return false;
                }
            }
        }
        return true;
    }
}