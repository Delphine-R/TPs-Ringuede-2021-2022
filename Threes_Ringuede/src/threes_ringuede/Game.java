package threes_ringuede;

import java.util.Scanner;

public class Game {

    Grid grid;

    public Player initGame() {

        grid = new Grid();
        grid.initGrid();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu Threes");

        System.out.println("Quel est votre nom de joueur : ");
        Player player = new Player(sc.nextLine());
        return player;
    }

    public boolean round(Player player) {
        
        boolean gameOver = false;
        
        if (!grid.gridFull()) {
            grid.newInt();

            Scanner sc = new Scanner(System.in);
            System.out.println("""
                               
                               Entrez le numéro correspondant au sens du déplacement : 
                               1 pour déplacer vers la droite, 
                               2 pour la gauche, 
                               3 pour le haut 
                               4 pour le bas.

                               Votre choix : """);
            int dir = sc.nextInt();
            while (dir != 1 && dir != 2 && dir != 3 && dir != 4) {
                System.out.println("""
                                   Erreur de saisie
                                    entrez a nouveau votre choix : """);
                dir = sc.nextInt();
            }
            String d = "aucune direction attribuée pour le moment";
            switch (dir) {
                case 1 -> d = "right";
                case 2 -> d = "left";
                case 3 -> d = "up";
                case 4 -> d = "down";
            }
            System.out.println(d);
            grid.move(d);

            player.score++; // chaque tour incrémente son score
            grid.printGrid(player);
        } 
        if (grid.gridFull()) {
            gameOver = true;
            System.out.println("La partie est terminée! \nVous avez joué " + player.score + " tours");
        }
        return gameOver;
    }
}
