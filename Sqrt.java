package BridgeLab;

import java.util.Scanner;

/**
 * Sqrt
 */
public class Sqrt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double num = sc.nextInt();
        double sqrtVlaue = sqroot(num);
        System.out.println("Square root of "+num+" is : "+sqrtVlaue);
        sc.close();
        }
        public static double sqroot(double num) {
            double c = num;
            double epsilon = 1e-15;
            while (Math.abs(c - num/c) > epsilon*c)
                c = (num/c + c) / 2.0;
            return c;
        }
        public static double sqroot(double num, double epsilon) {
            if (num < 0) return Double.NaN;
            double c = num;
            while (Math.abs(c - num/c) > epsilon*c)
            c = (num/c + c) / 2.0;
            return c;
        }
        
}