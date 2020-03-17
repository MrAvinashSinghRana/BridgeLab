package BridgeLab;

/**
 * SpringSeason
 */
//import java.util.*;
public class SpringSeason {

    public static void main(String[] args) {
        // command line argument  
        int m = Integer.parseInt(args[0]);
        if(m>=3 && m<=6 ){
            System.out.println("true");
        }else System.out.println("false");
    }
}