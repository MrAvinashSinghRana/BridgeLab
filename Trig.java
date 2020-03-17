package BridgeLab;

import java.util.Scanner;

/**
 * Trig
 */
public class Trig {

    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        // taking input as angle
        System.out.println("Enter an angle : ");
        double angle = sc.nextDouble();
        
        /**  
         * firstly,we need radian value to get sin,cos and tan values of any angle
         * here , Math.toRadians()  return double datatype
         * then we pass the value to Math.sin()/cos()/tan() as parameter
        */
        double redianValue = Math.toRadians(angle);
        double sinValue = Math.sin(redianValue);
        System.out.println(sinValue);
        double cosValue = Math.cos(redianValue);

        // printf : used for format specifier
        System.out.printf("sin value : %.2f\ncos value : %.2f\nredian value : %.2f", sinValue,
        cosValue,redianValue);
        sc.close();
    }
}