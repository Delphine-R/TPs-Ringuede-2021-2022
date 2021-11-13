/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_ringuede;

/**
 *
 * @author delph
 */
public class TP2_Bieres_RINGUEDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*BouteilleBiere uneBiere = new BouteilleBiere() ;
        
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson" ;
        uneBiere.ouverte = false ;
        
        BouteilleBiere secBiere = new BouteilleBiere() ;
        
        secBiere.nom = "Leffe ";
        secBiere.degreAlcool = 6.6 ;
        secBiere.brasserie = "Abbaye de Leffe" ;
        
        Partie devenue obsolète grâce aux constructeurs*/
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere troisBiere = new BouteilleBiere("Despe", 4.6, "Desperado");
        BouteilleBiere quatreBiere = new BouteilleBiere("Heineken", 3.2, "Holland");
        BouteilleBiere cinqBiere = new BouteilleBiere("Juice", 8.9, "alcooliques");

        uneBiere.lireEtiquette();
        deuxBiere.lireEtiquette();

        uneBiere.decapsuler();
        uneBiere.decapsuler();

        System.out.println(uneBiere);

        System.out.println(deuxBiere);
        deuxBiere.decapsuler();
        System.out.println(deuxBiere);

    }

}
