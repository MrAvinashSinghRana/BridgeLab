package BridgeLab;

import java.util.Scanner;

/**
 * Collinear
 */
public class Collinear {

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        Scanner scan = new Scanner(System.in);
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<2 ; j++ ){
                arr[i][j]=scan.nextInt();
            }
        }
        boolean iscollinear =checkCollinearUsingSlope(arr);
        System.out.println(iscollinear);
        
        
        scan.close();
    }

    private static boolean checkCollinearUsingSlope(int[][] arr) {
        double diffX = (arr[1][1]-arr[0][1])/(arr[1][0]-arr[0][0]);
        double diffY = (arr[2][1]-arr[1][1])/(arr[2][0]-arr[1][0]);
        double diffZ = (arr[2][1]-arr[0][1])/(arr[2][0]-arr[0][0]);
        if(diffX == diffY  && diffY == diffZ) return true;
        return false;
    }
}