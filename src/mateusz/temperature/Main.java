package mateusz.temperature;

/**
 *
 * @author Mateusz Pabian
 */


//main function
public class Main {
     public static void main(String[] args)
    {
        //creating new instance of TemperatureDatabase class
        TemperatureDatabase temperature = new TemperatureDatabase();
        
        temperature.handleTemperatureDatabaseLogic();
        
    }
}
