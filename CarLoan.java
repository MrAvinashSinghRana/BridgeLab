package BridgeLab;

/**
 * CarLoan
 */
public class CarLoan {

    public static void main(String[] args) {
        double p = Integer.parseInt(args[0]);
        double y= Integer.parseInt(args[1]);
        double r = Integer.parseInt(args[2]);
        double noOfMonth =12 * y ;
        r = r / 1200 ; 
        double payment = (double) (p*r) / (1-(1/Math.pow(1+r, noOfMonth)));
        System.out.println(payment);   
    }
}