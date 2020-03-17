package BridgeLab;

import java.util.Scanner;

/**
 * IntOpt
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for the range of prime number : ");
        int n = sc.nextInt();
        int k  = sc.nextInt();
        primeNumber(n, k);
        sc.close(); 
    }
    public static void primeNumber(int n , int k){
        for(int i=n ; i <= k ; i++ ){
            int flag = 0;
            for(int j = 2 ; j<i/2 ; j++ ){
                if(i%j == 0 ){
                    flag = 1 ;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(i + " ");
            }
        }
    }
    
}