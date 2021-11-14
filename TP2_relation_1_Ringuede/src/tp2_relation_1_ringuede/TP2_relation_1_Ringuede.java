package tp2_relation_1_ringuede;

/**
 *
 * @author delph
 */
public class TP2_relation_1_Ringuede {

    public static void main(String[] args) {
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;

        bob.liste_voitures[1] = uneAutreClio ;
        bob.nbVoitures = 2 ;
        uneAutreClio.Proprietaire = bob ;
        
        reno.liste_voitures[0] = une2008 ;
        reno.nbVoitures = 1 ;
        une2008.Proprietaire = reno ;
        
        reno.liste_voitures[1] = uneMicra ;
        reno.nbVoitures = 2 ;
        uneMicra.Proprietaire = reno ;
        
        
    }
    
}
