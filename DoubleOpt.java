package BridgeLab;

import java.util.Scanner;

/**
 * DoubleOpt
 */
public class DoubleOpt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("obtained value : ");
        System.out.println(a + b *c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
        sc.close();
    }
}