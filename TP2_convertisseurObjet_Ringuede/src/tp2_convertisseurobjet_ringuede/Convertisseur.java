package tp2_convertisseurobjet_ringuede;

/**
 *
 * @author delph
 */
public class Convertisseur {
    
    int nbConversions;
    
    public Convertisseur () {
        nbConversions = 0 ;
    }

    public double CelciusVersKelvin(double uneTemp){
        double temp = (uneTemp + 273.15);
        nbConversions ++;
        return temp;
    }
    
    public double KelvinVersCelcius(double uneTemp){
        double temp = (uneTemp - 273.15);
        nbConversions ++;
        return temp;
    }
    
    public double FahrenheitVersCelcius(double tFahrenheit) { 
        double tCelcius = (tFahrenheit - 32) / 1.8;
        nbConversions ++;
        return tCelcius;
    }
    
    public double CelciusVersFahrenheit(double tCelcius) { 
        double tFahrenheit = (tCelcius + 32) * 1.8;
        nbConversions ++;
        return tFahrenheit;
    }

    public double KelvinVersFahrenheit(double tKelvin) { 
        double tFahrenheit = ((tKelvin - 273.15) * 1.8) + 32;
        nbConversions ++;
        return tFahrenheit;
    }

    public double FahrenheitVersKelvin(double tFahrenheit) { 
        double tKelvin = ((tFahrenheit - 32) / 1.8) + 273.15;
        nbConversions ++;
        return tKelvin;
    }
    
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
}
}
    
