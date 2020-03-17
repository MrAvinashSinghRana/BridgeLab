package BridgeLab;

import java.util.Arrays;

/**
 * Star5
 */
public class Star5 {

    public static void main(String[] args) {
        double[] arr = new double[5];
        System.out.println("five different values b/w 0 and 1 : ");

        // to store value of range 0 to 1
        for(int i = 0 ; i < 5 ; i++ ){
            arr[i] = (double) (Math.random() * 1 + 0);
            System.out.printf("%f \n" , arr[i]);
        }

        // to calculate the sum of array
        double sumOfArray = Arrays.stream(arr).sum();

        double average = sumOfArray/5;
        System.out.printf("Average : %f\n",average);
        
        // to find min and max
        Arrays.sort(arr);
        double min = arr[0];
        double max = arr[4];
        System.out.printf("min value : %f \n" , min);
        System.out.printf("max value :%f \n" , max);
    }
}