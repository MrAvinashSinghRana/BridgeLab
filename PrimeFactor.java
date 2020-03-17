package BridgeLab;

import java.util.Scanner;

/**
 * PrimeFactor
 */
public class PrimeFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        primeFactor(number);
        sc.close();
    }

    private static void primeFactor(int number) {
        System.out.println("Prime Factors of " + number);
        int flag=0;
        for(int i = 1 ; i <= number ; i++ ){
            flag = 0;
            for(int j = 2 ; j <= i/2 ; j++ ){
                if(i%j==0){
                    flag = 1 ;
                    break;
                }
            }
            if(flag == 0){
                if(number % i == 0 ){
                    System.out.print(i+" ");
                } 
            }
        }
    }
}