package BridgeLab;

/**
 * PowerOf2
 */
public class PowerOf2 {

    public static void main(String[] args) {
        //taking input form command line 
        int n = Integer.parseInt(args[0]);
        for(int i = 1 ; i <= n ; i++){
            long value =(long) Math.pow(2, i);
            System.out.println(value);
        }
    }
}