package BridgeLab;

import java.util.Scanner;

/**
 * TemperatureConversion
 */
public class TemperatureConversion {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Temprature ( in celcius ) : ");
        double temp = sc.nextDouble();
        double farenTemp = temp * (9/5) + 32 ;
        System.out.println("celcius : " + temp +" = " + farenTemp + "F");

        System.out.println();

        
        System.out.println("Enter the Temprature ( in farhenheit ) :");
        temp = sc.nextDouble();
        double celcTemp = (temp - 32 ) * (5/9);
        System.out.println("Fahtenheit : " + temp +" = " + celcTemp + "C");

        sc.close();
    }
}