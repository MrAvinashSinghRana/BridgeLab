package BridgeLab;

import java.time.*;

/**
 * DayOfWeek
 */
public class DayOfWeekExample {

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println(dayOfWeek.name());


    }
}