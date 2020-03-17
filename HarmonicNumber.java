package BridgeLab;

/**
 * HarmonicNumber
 */
public class HarmonicNumber {

    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double sum = 0 ;
        for(double i = 1 ; i <= n ; i++){
                sum =sum+(1/i);
        }
        System.out.println(sum);
    }
}