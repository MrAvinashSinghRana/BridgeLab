package BridgeLab;
import java.util.Scanner;

/**
 * RollDie
 */
public class RollDie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much time Dice will roll \nenter the number : ");
        int l = sc.nextInt();
        System.out.println("\nMax number occurance : " + rollDie(l));
        sc.close();
    }

    public static int rollDie(int l) {
        int maxNum=0,count=0,maxCount=0;
        int[] array = new int[l];
        for(int i = 0 ; i < l ; i++ ){
            array[i] = (int)(Math.random() * 6 + 1);
            System.out.print(array[i]+" ");
        }
        for(int i=0 ; i < l ; i++){
            count=1;
            for(int j =i ; j<l ; j++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(maxCount < count ){
                maxCount = count ;
                maxNum = array[i] ;
            }
        }
        return maxNum;
    }
}