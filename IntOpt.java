package BridgeLab;

import java.util.Scanner;

/**
 * IntOpt
 */
public class IntOpt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("obtained value : ");
        System.out.println(a + b *c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
        sc.close();
    }
}