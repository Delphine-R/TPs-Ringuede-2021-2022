package tp2_manip_ringuede;

/**
 *
 * @author delph
 */
public class TP2_manip_Ringuede {

    public static void main(String[] args) {
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        
        Tartiflette assiette3 = assiette2 ; 

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        assiette2.nbCalories ++;
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        // on remarque que assiette2 et assiette3 référencent-elles la même tartiflette.
        
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        
        Tartiflette temp;
        
        temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        
        //une référence objet qui annonce référencer un type d’objet ne peut pas en référencer un autre qui n’a aucun rapport
        
        Moussaka [] tabMouss = new Moussaka[10];
        Moussaka a1 = new Moussaka(42);
        tabMouss[0] = a1;
        Moussaka a2 = new Moussaka(43);
        tabMouss[1] = a2;
        Moussaka a3 = new Moussaka(44);
        tabMouss[2] = a3;
        Moussaka a6 = new Moussaka(45);
        tabMouss[3] = a6;
        Moussaka a4 = new Moussaka(46);
        tabMouss[4] = a4;
        Moussaka a5 = new Moussaka(47);
        tabMouss[5] = a5;
        
        System.out.println(tabMouss);
        
        }
        
    }
    
}
