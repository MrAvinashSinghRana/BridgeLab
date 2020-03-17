package BridgeLab;

import java.util.Scanner;

/**
 * FlipCoin
 */
public class FlipCoin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flip = sc.nextInt();
        flipcoin(flip);
        sc.close();
    }
    public static void flipcoin(int flip){
        int sumHeads=0 ,sumTails=0;
        for(int i = 1 ; i <= flip ; i++ ){
            int occur = (int) ( Math.random() * 2 + 0 );
            //System.out.println(occur);
            if(occur == 1){
                System.out.println("Heads");
                sumHeads = sumHeads + 1 ;
            }
            else {
                System.out.println("Tail");
                sumTails = sumTails + 1 ;
            }
        }
        System.out.println("No. of Heads  : " + sumHeads);
        System.out.println("No. of Tails  : " + sumTails);
        System.out.println("percentage of occurance  of heads : " + ( sumHeads * (100/flip)) + "%");
        System.out.println("percentage of occurance  of tails : " + ( sumTails * (100/flip)) + "%");
    }
}