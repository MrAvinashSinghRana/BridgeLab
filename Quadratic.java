package BridgeLab;
import java.util.Scanner;

/**
 * Quadratic
 */
public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        quadratic(a, b, c);
        sc.close();
    }
    public static void quadratic(double a, double b, double c ){
        double delta = b*b - 4*a*c;
        if(delta > 0){
            double sqrtDelta = (Math.sqrt(delta));
            double rootX = (-b + sqrtDelta)/2*a;
            double rootY = (-b - sqrtDelta)/2*a;
            System.out.println("Two roots of quadratic equation : "+rootX + "&" + rootY);
        }else System.out.println("Not a quadratic equation");
    }
}