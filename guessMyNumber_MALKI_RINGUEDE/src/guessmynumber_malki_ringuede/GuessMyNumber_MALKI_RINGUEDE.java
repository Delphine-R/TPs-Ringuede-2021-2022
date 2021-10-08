/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_malki_ringuede;

import java.util.Random;
import java.util.Scanner;

// modif test git

/**
 * fait le 4 octobre 2021
 *
 * @author Nawel Malki et Ringuede Delphine
 */
public class GuessMyNumber_MALKI_RINGUEDE {

    public static void main(String[] args) {
        /**
         * Random generateurAleat = new Random(); // ajout auto de
         * java.util.Random int n; for (int i=0; i<5; i++){ //boucle pour
         * générer des entiers aléatoires à chaque fois n =
         * generateurAleat.nextInt(100); System.out.println(n); }
         */

        Random generateurAleat = new Random(); // ajout auto de java.util.Random
        int n;
        n = generateurAleat.nextInt(100);
        System.out.println("choix de l'ordi : " + n);

        // ENTREE DE L'UTILISATEUR 
        Scanner sc = new Scanner(System.in);
        // rajout automatique de : import java.util.Scanner;
        System.out.println("Choisissez un entier compris entre 0 et 100 :");
        int entier = sc.nextInt();
        int cpt = 0;

        //NIVEAU DE DIFFICULTE
        String niveau = "a";
        do {
            System.out.println("Choisissez un niveau de difficulté: \nEntrez f pour facile, n pour normal et d pour difficile");
            niveau = sc.nextLine();
        } while ((niveau != "f") && (niveau != "n") && (niveau != "d"));

        //TEST DE LA VALEUR
        while (entier != n) { // boucle qui se lance tant que l'utilisateur n'a pas trouvé n  
            cpt++;
            if (n < entier) {
                System.out.println("Trop grand");
            }
            if (n > entier) {
                System.out.println("Trop petit");
            }
            if (n == entier) {
                System.out.println("Gagné!!!");
            }
        }
    }
}
