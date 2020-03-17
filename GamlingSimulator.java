package BridgeLab;

import java.util.Scanner;

/**
 * GamlingSimulator
 */
public class GamlingSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of stack : ");
        int  stack = sc.nextInt();
        System.out.println("No. of goal have to achieve : ");
        int  goals = sc.nextInt();
        System.out.println("choose a number b/w 0-9 to place bet : ");
        int trail= sc.nextInt();
        int cGoal = 0;
        int count=0;

        if(trail >= 0 || trail <10){
            while(cGoal < goals && stack>0  ){
                count += 1;
                int i = (int) (Math.random() * 10 + 0);
                if(i==trail){
                    stack += 1;
                    cGoal += 1;
                }else{
                    stack -= 1;
                }
            }
            float percentage =(float)cGoal / (float) count;
            System.out.println("Number of times won : " + cGoal);
            System.out.println("Number of time played : " + count);
            System.out.println("Percentage of win : "+ percentage*100 +"%" );

        }else System.out.println("Invalid bet value  ! , try again");
        sc.close();
    }
}