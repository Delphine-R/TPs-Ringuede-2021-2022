package sp4_console_ringuede;

/**
 *
 * @author delph
 */
public class SP4_console_Ringuede {

    public static void main(String[] args) {

        Partie partie = new Partie();
        partie.initialiserPartie();
        partie.debuterPartie();

    }
}

/*
public class SP4_console_Ringuede {

    public static void main(String[] args){

        Joueur joueur1 = new Joueur("joueur1");
        Joueur joueur2 = new Joueur("joueur2");


        Partie partie = new Partie(joueur1, joueur2);

        partie.initialiserPartie();
        partie.debuterPartie();

    }
}
 */
