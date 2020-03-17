package BridgeLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * MathFunction
 */
public class MathFunction {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find its Harmonic, sin, cos and Binary values : ");
        long value = scan.nextInt();
        double harmonicDouble = harmonicNumber(value);
        System.out.printf("\nHarmoni Value of  %d  is  %.2f ",value,harmonicDouble);
        double sinVlue = sinCalculate(radianValue(value));
        System.out.printf("\nsin Value of  %d  is  %.2f ",value,sinVlue);
        double cosValue = cosCalculate(radianValue(value));
        System.out.printf("\ncos Value of  %d  is  %.2f ",value,cosValue);
        String binaryValue = binaryCalculate(value);
        System.out.println("\nBinary Value of "+ value + " is = "+ binaryValue);

        System.out.println("\nEnter value to calculate Square root value : ");
        double Value1 = scan.nextDouble();
        double sqrtValue  =  sqrtCalculate(Value1);
        System.out.println(sqrtValue);

        System.out.println("\nEnter value to calculate isPrime or not : ");
        int Value2 = scan.nextInt();
        boolean prime  =  isPrime(Value2);
        System.out.println(prime);


        //give input from command line (command line argument)
        System.out.println("\nEnter value to calculate factorial : ");
        //int value3 = Integer.parseInt(args[0]);
        int value3 = scan.nextInt();
        long factorial  =  factorialCalculate(value3);
        System.out.println(factorial);

        System.out.println("\nEnter dollar, rate, period value to calculate future Value : ");
        int dollar = scan.nextInt();
        int rate = scan.nextInt();
        int period = scan.nextInt();
        double compund  =  compoundCalculate(dollar, rate , period);
        System.out.println(compund);


        System.out.println("\nEnter Investment, rate, period value to calculate Compund Interest : ");
        int c = scan.nextInt();
        int r = scan.nextInt();
        int t = scan.nextInt();
        double compundInterest  =  compoundInterestCalculate(c, r , t);
        System.out.println(compundInterest);


        System.out.println("\nEnter Enter size of an array : ");
        int sizeArray = scan.nextInt();
        int[] array = new int[sizeArray];
        System.out.println("Provide values to array : ");
        for(int i = 0 ; i < sizeArray ; i++ ){
            array[i] = scan.nextInt();
        }
        int[] valueArray = minMaxArray(array);
        System.out.println("Min Value of array :"+ valueArray[0]+"\nMax Value of array : " + valueArray[1]);

        scan.nextLine();
        System.out.println("\nEnter Enter size of an array : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("write a string in a single line using single whitespace : ");
        String[] stringArray = br.readLine().split(" ");
        String[] valueStringArray = minMaxArray(stringArray);
        System.out.println("Min Value of array :"+ valueStringArray[0]+"\nMax Value of array : " + valueStringArray[1]);
        
        System.out.println("Enter the co- ordinate to check collinear : ");
        int[][] arr = new int[3][2];
        for(int i=0 ; i<3 ; i++){
            System.out.println("Enter "+(i+1)+" co-ordinate : ");
            for(int j=0 ; j<2 ; j++ ){
                arr[i][j]=scan.nextInt();
            }
        }
        boolean iscollinear =checkCollinearUsingSlope(arr);
        System.out.println(iscollinear);
        
        
        scan.close();
    }

    public static boolean checkCollinearUsingSlope(int[][] arr) {
        double diffX = (arr[1][1]-arr[0][1])/(arr[1][0]-arr[0][0]);
        double diffY = (arr[2][1]-arr[1][1])/(arr[2][0]-arr[1][0]);
        double diffZ = (arr[2][1]-arr[0][1])/(arr[2][0]-arr[0][0]);
        if(diffX == diffY  && diffY == diffZ) return true;
        return false;
    }

    public static String[] minMaxArray(String[] stringArray) {
        String[] str = new String[2];
        String max = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String min = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        for(String col : stringArray){
            if(max.compareTo(col)<0) max = col ;
            if(min.compareTo(col)>0) min = col ;
        }
        str[0] = min;
        str[1] = max;
        return str;
    }

    public static int[] minMaxArray(int[] array) {
        int[] col = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int v : array){
            if(min>v) min=v;
            if(max<v) max=v;
        }
        col[0]= min;
        col[1]= max;
        return col;
    }

    public static double compoundInterestCalculate(int c, int r, int t) {
        double p = Math.pow((c/(1+r)),t);
        return p;
    }

    public static double compoundCalculate(int dollar, int rate, int period) {
        double p = Math.pow((dollar*(1+rate)),period);

        return p;
    }

    public static long factorialCalculate(int value3) {
        BigInteger big = BigInteger.ONE;
        for(long i=1 ; i<= value3 ; i++){
            big = big.multiply(BigInteger.valueOf(i));
        }
        return big.longValue();
    }

    public static boolean isPrime(int value2) {
        for(int i = 2 ; i <= value2/2 ; i++ ){
            if(value2 % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double sqrtCalculate(double value1) {
        double c = value1;
        double epsilon = 1e-15;
        while(Math.abs(value1-c*c) > epsilon*c){
            c = (c + value1 / c) / 2.0;
        }
        return c;
    }
    public static double sqrtCalculate(double value1,double epsilon) {
        double c = value1;
        if (c < 0) return Double.NaN;
        while(Math.abs(value1-c*c) > epsilon*c){
            c = (c + value1 / c) / 2.0;
        }
        return c;
    } 

    public static double sinCalculate(double radianValue) {
        return Math.sin(radianValue);
    }

    public static double cosCalculate(double radianValue) {
        return Math.cos(radianValue);
    }

    public static String binaryCalculate(long value) {
        StringBuffer s = new StringBuffer(); 
        while(value>0){
            long cal = value % 2;
            s= s.append(cal);
            value /= 2; 
        }
        s.reverse();
        return s.toString() ;
    }

    public static double radianValue(long value) {
        return Math.toRadians(value);
    }

    private static double harmonicNumber(long value) {
        double sum = 0;
        for(double i = 1 ; i <= value ; i++ ){
            sum += (1/i);
        }
        return sum;
    }
}