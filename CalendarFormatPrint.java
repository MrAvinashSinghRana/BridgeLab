package BridgeLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
//import java.util.Arrays;

/**
 * CalendarFormatPrint
 */
public class CalendarFormatPrint  {

    public static void main(String[] args) throws IOException{
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Month ,Year in Sequence : ");
        String[] str = bufferedReader.readLine().split(" ");
        int[] in = new int[2];
        for(int i=0 ; i<2 ; i++){
            in[i]= Integer.parseInt(str[i]);
        }
        LocalDate localDate = LocalDate.of(in[1], in[0], 01);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        String s =dayOfWeek.name();
        String[] year = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER",
                        "NOVEMBER","DECEMBER"};

        String[] coun= { "SUNDAY" ,"MONDAY" , "TUESDAY" , "WEDNESDAY" , "THURSDAY" , "FRIDAY" , "SATURDAY"};
        int count = 0;
        for(String str1 : coun){
            if(s.equals(str1)){
                break;
            }
            count++;
        }
        String[][] days = new String[6][7];
        days[0][0] ="S" ;
        days[0][1] =" M" ;
        days[0][2] =" T" ;
        days[0][3] =" W" ;
        days[0][4] ="Th" ;
        days[0][5] =" F" ;
        days[0][6] =" S" ;
        
        
        int day = 0;
        if(in[0] == 1 || in[0] == 3 || in[0] == 5 || in[0] == 7 || in[0] == 8 || in[0] == 10 || in[0] == 12 ){
            day = 31;
        }
        else if(in[0] == 4 || in[0] == 6 || in[0] == 9 || in[0] == 11){
            day=30;
        }
        else{
            if(leapYear(in[1])){
                day = 29;
            }
            else day =28;
        }
        System.out.println(" "+year[in[0]-1]+" "+in[1]);
        int fill=1;
        for(int k = 1 ; k < 6 ; k++){
            for(int j= 0 ; j < 7 ; j++ ){
                if(fill<=day){
                    if(k==1 && j < count ){
                        days[k][j]="  ";
                    }
                    else {
                        days[k][j]=Integer.toString(fill);
                        fill++;
                    }
                }
                else days[k][j]="  ";
            }
            
        }

        for(int k = 0 ; k < 6 ; k++ ){
            for(int j = 0 ; j < 7 ; j++ ){
                System.out.printf("%2s  ",days[k][j]);
            }
            System.out.println();
        }
    }

    private static boolean leapYear(int i) {
        if(i%4 == 0 && i%100 != 0 || i%400 ==0){
            return true;
        }
        else return false;
    }
}