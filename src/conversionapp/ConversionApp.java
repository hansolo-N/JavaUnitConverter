/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionapp;
import java.util.*;
/**
 *
 * @author Mohammed Hanslo
 */
public class ConversionApp {

   
    // US customary units to SI units
    static double feetToMeters(double n1)
    {
      return n1 * 0.305;  
    }
    
    static double poundsToKilos(double n1)
    {
      return n1 * 0.454;  
    }
    
    static double fahrenheitToCelsius(double n1)
    {
      return (n1-32)/1.8;  
    }
    
    static double squareFeetToSquareMeters(double n1)
    {
        return 0.093 * n1;
    }
    
    static double gallonsToLitres(double n1)
    {
        return 3.785 * n1;
    }
    
    static double poundforceToNewtons(double n1)
    {
        return 4.45 * n1;
    }
    
    //SI units to US customary units
    
    static double metersToYards(double n1)
    {
        return 1.09 * n1;
    }
    
    static double squareMetersToSquareFeet(double n1)
    {
        return 1.195 * n1;
    }
    
    static double celsiusToFahrenheit(double n1)
    {
      return (1.8 *n1) + 32;  
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        
        String [] unitTypes = {"feet","meters","gallons","fahrenheit","celsius","yards","pounds","kilos","squarefeet","squaremeters","litres","poundforce","newtons"};
        
        
        
        System.out.println("================================================");
        System.out.println("Welcome to unit conversion Application!");
        System.out.println("if you would like to exit program type 'exit' for your first input");
        
        while(flag)
        {
            System.out.println("please enter the unit you are converting from:");
            String unitFrom = input.next();
            
            if(unitFrom.toLowerCase().equals("exit"))
            {
              System.out.println("program exiting!");
              System.out.println("================================================");
              break;
            }
            
            boolean retval = Arrays.asList(unitTypes).contains(unitFrom);
            
            if(!retval){
                System.out.println("your first value type does match any relevant metric/imperial try again");
                continue;
            }
            
            System.out.println("please enter the unit you are converting to:");
            String unitTo = input.next();
            
            retval = Arrays.asList(unitTypes).contains(unitTo);
            
            if(!retval){
                System.out.println("your second value type does match any relevant metric/imperial try again");
                continue;
            }
            
            System.out.println("please enter the units value:");
            double unit_value = input.nextDouble();
            
            
            
            if(unitFrom.toLowerCase().equals("feet") &&  unitTo.toLowerCase().equals("meters"))
            {
                double convertedUnit = feetToMeters(unit_value);
                System.out.println("conversion feet to meters: " + convertedUnit + "m");
            }
            else if(unitFrom.toLowerCase().equals("meters") &&  unitTo.toLowerCase().equals("yards"))
            {
                double convertedUnit = metersToYards(unit_value);
                System.out.println("conversion meters to feet: " + convertedUnit + "yrds");
            }
            
            else if(unitFrom.toLowerCase().equals("pounds") &&  unitTo.toLowerCase().equals("kilo"))
            {
                double convertedUnit = poundsToKilos(unit_value);
                System.out.println("conversion pounds to kilos: " + convertedUnit + "kilos");
            }
            
            else if(unitFrom.toLowerCase().equals("fahrenheit") &&  unitTo.toLowerCase().equals("celsius"))
            {
                double convertedUnit = fahrenheitToCelsius(unit_value);
                System.out.println("conversion fahrenheit to celsius: " + convertedUnit + "C");
            }
            else if(unitFrom.toLowerCase().equals("celsius") &&  unitTo.toLowerCase().equals("fahrenheit"))
            {
                double convertedUnit = celsiusToFahrenheit(unit_value);
                System.out.println("conversion celsius to fahrenheit: " + convertedUnit + "F");
            }
            
            else if(unitFrom.toLowerCase().equals("squarefeet") &&  unitTo.toLowerCase().equals("squaremeters"))
            {
              double convertedUnit = squareFeetToSquareMeters(unit_value);
              System.out.println("conversion squareFeet to SquareMeters: " + convertedUnit + "m^2");  
            }
            
            else if(unitFrom.toLowerCase().equals("gallons") &&  unitTo.toLowerCase().equals("litres"))
            {
              double convertedUnit = gallonsToLitres(unit_value);
              System.out.println("conversion gallons to litres: " + convertedUnit + "L");  
            }
            
            else if(unitFrom.toLowerCase().equals("poundforce") &&  unitTo.toLowerCase().equals("newtons"))
            {
              double convertedUnit = poundforceToNewtons(unit_value);
              System.out.println("conversion poundforce to newtons: " + convertedUnit + "N");  
            }
            
            else if(unitFrom.toLowerCase().equals("squaremeters") &&  unitTo.toLowerCase().equals("squarefeet"))
            {
              double convertedUnit = squareMetersToSquareFeet(unit_value);
              System.out.println("conversion squaremeters to squarefeet: " + convertedUnit + "ft^2");  
            }
            
            else
            {
                System.out.println("incorrect unit type entered , try again!");
            }
        }
        
    }
    
}
