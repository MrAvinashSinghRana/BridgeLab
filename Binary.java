package BridgeLab;

/**
 * Binary
 */
public class Binary {

    public static void main(String[] args) {
        
        System.out.println("Eenter the value to get its binary  : ");
        long l = Long.parseLong(args[0]);
        binary(l);
    }

    private static void binary(long l) {
        StringBuffer sb = new StringBuffer();
        while(l>0){
            long k = l%2;
            sb.append(k);
            l /= 2;
        }
        sb.reverse();
        System.out.println(sb);
    }
    
}