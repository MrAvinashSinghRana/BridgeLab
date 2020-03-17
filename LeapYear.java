package BridgeLab;
import java.util.Scanner;

/**
 * LeapYear
 */
public class LeapYear {

    public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            System.out.print("enter the year : ");
            int year = sc.nextInt();
            System.out.print("Hey User , " + year +" " + leapYear(year));
            sc.close();
    }
    public static String leapYear(int year) {
        if(year%4 == 0 && year%100 != 0 || year%400 ==0){
            return "is a Leap Year";
        }
        else return "is not a Leap Year";
        
    }
}