package tp2_convertisseurobjet_ringuede;

/**
 *
 * @author delph
 */

import java.util.Scanner;

public class TP2_convertisseurObjet_Ringuede {

    public static void main(String[] args) {

        Convertisseur unConvertisseur = new Convertisseur();

        System.out.println(unConvertisseur.CelciusVersKelvin(32));
        System.out.println(unConvertisseur.FahrenheitVersCelcius(42));

        System.out.println(unConvertisseur);

        Convertisseur autreConvertisseur = new Convertisseur();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour, saisissez une valeur :");
        double temp = sc.nextFloat();
        System.out.println("""
                           Saisissez la conversion que vous souhaiter effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) Fahrenheit vers Celcius
                           4) Celcius vers Fahrenheit
                           5) Kelvin vers Fahrenheit
                           6) De Farenheit vers Kelvin""");

        int choix = sc.nextInt();
        double tempf; // temperature finale convertie;

        switch (choix) {
            case 1:
                tempf = autreConvertisseur.CelciusVersKelvin(temp);
                System.out.println(temp + " degrés Celcius est égal à " + tempf + " dégrés Kelvin");
            case 2:
                tempf = autreConvertisseur.KelvinVersCelcius(temp);
                System.out.println(temp + " degrés Kelvin est égal à " + tempf + " dégrés Celcius");
            case 3:
                tempf = autreConvertisseur.FahrenheitVersCelcius(temp);
                System.out.println(temp + " degrés Fahrenheit est égal à " + tempf + " dégrés Celcius");
            case 4:
                tempf = autreConvertisseur.CelciusVersFahrenheit(temp);
                System.out.println(temp + " degrés Celcius est égal à " + tempf + " dégrés Fahrenheit");
            case 5:
                tempf = autreConvertisseur.KelvinVersFahrenheit(temp);
                System.out.println(temp + " degrés Kelvin est égal à " + tempf + " dégrés Fahrenheit");
            case 6:
                tempf = autreConvertisseur.FahrenheitVersKelvin(temp);
                System.out.println(temp + " degrés Fahrenheit est égal à " + tempf + " dégrés Kelvin");
        }

    }

}
