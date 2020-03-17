package BridgeLab;

import java.util.Arrays;

/**
 * CheckTwiceNumber
 */
public class CheckTwiceNumber {

    public static void main(String[] args) {
        int[] array = new int[100];
        int k = (int) (Math.random() * 99 + 1);
        for(int i=0 ; i< 100 ; i++){
            if(i == k ){
                array[i] = (int) (Math.random() * 100 + 1);
            }
            else array[i] = i+1;

            System.out.print(array[i] + " ");
        }
        checkTwiceNumber(array);
    }

    private static void checkTwiceNumber(int[] array) {
        Arrays.sort(array);
        for(int i = 1 ; i < 100 ; i++ ){
            if(array[i] == array[i-1]){
                System.out.println("\nrepeat number is : " + array[i]);
                break;
            }
        }
    }
}