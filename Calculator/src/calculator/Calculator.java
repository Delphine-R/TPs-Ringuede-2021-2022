/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 * TP0 PARTIE 3 : Calculator
 *
 * @author Delphine Ringuede
 * fait le 21 sept 2021
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
                           Please enter the operator:
                           1) add
                           2) substract
                           3) multiply
                           4) divide
                           5) modulo""");

        //choix de l'operateur + test si loperateur est valide
        int operateur = 0;
        double operande1, operande2, result = 0;

        do {
            Scanner sc = new Scanner(System.in); // fonction qui lit les entres de l'utilisateur
            System.out.println("\n Your choice of operator :");
            operateur = sc.nextInt();

            //entree des 2 elements
            System.out.println("\n Enter the first element:");
            operande1 = sc.nextInt();
            System.out.println("\n Enter the second element:");
            operande2 = sc.nextInt();

            //calcul selon les cas
            switch (operateur) {
                case 1 ->
                    result = operande1 + operande2;
                case 2 ->
                    result = operande1 - operande2;
                case 3 ->
                    result = operande1 * operande2;
                case 4 ->
                    result = operande1 / operande2;
                case 5 ->
                    result = operande1 % operande2;
                default ->
                    System.err.println("erreur de saisie"); //test si l operateur est valide
            }
        } while (operateur < 1 || operateur > 5); // boulcle a condition que l operateur soit valide
        System.out.println("\n The result: " + result);
    }
