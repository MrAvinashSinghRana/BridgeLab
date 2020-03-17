package BridgeLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Calendar
 */
public class Calendar {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Day , Month ,Year in Sequence : ");
        String[] str = bufferedReader.readLine().split(" ");
        String day = nameOfDay(str);
        System.out.println(day);
    }

    private static String nameOfDay(String[] str) {
        int[] ints = new int[3];
        for(int i=0 ; i<3 ; i++){
            ints[i]= Integer.parseInt(str[i]);
        }
        LocalDate localDate = LocalDate.of(ints[2], ints[1], ints[0]);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
    
        return dayOfWeek.name();
    }
}