package threes_ringuede;

public class Player {

    String name;
    int score; // bonus : correspond à la somme des valeurs affichées sur la grille
    int plays; // nbr de coups joués

    public Player(String aName) {
        //constructeur qui attribue le nom et initialise les scores
        name = aName;
        score = 0;
        plays = 0;
    }

}
