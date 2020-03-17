package BridgeLab;

/**
 * Distance
 */
public class Distance {

    public static void main(String[] args) {
        // comandline argument
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.print("Euclidean distance from ("+ (int) x + ","+(int) y+ ") to the origin (0,0) is :  ");
		System.out.printf("%.2f",distance);
    }
}