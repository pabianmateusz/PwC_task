/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mateusz.temperature;
import java.util.*;

/**
 *
 * @author mateusz
 */

public class TemperatureDatabase {
    
    int[] database = new int[1000];
    
    //looking for the temperature closest to zero
    public void handleTemperatureDatabaseLogic()
    {
        this.fillDatabase();
        this.absValueOfDatabaseRecords();
        this.sortDatabseASC();
        this.findTemperaturesNearestZero();
    }
    
    private void fillDatabase(){
        
        Random r = new Random();
        
        System.out.println("Random input data of temperature database");
        
        for(int i = 0; i < database.length; i++)
        {
            database[i] = r.nextInt(600) - 300;
            
            System.out.println(database[i]);
        }
    }
    
    private void absValueOfDatabaseRecords(){
    
        for(int i = 0; i < database.length; i++)
        {
            if(database[i] < 0)
            {
               database[i] = database[i] * (-1);
            }
        }   
    }
    
    private void sortDatabseASC(){
    
        Arrays.sort(database);
        
        System.out.println("Sorted absolute value of temperature database");
        
        for(int i = 0; i < database.length; i++)
        {
            System.out.println(database[i]);
        }  
    }
    
    private void findTemperaturesNearestZero(){
    
        int i = 0;
        
        System.out.println("Temperature nearest zero");
        
        do
        {
            System.out.println(database[i]);
            i++;
        }
        
        while (database[i - 1] == database[i]);
        
        System.out.println("Number of records found: " + i);
    }
    
}
