package chapter3;
import java.time.*;
public class DatesAndTimeLesson {
    public static String dateOrdinalString(LocalDate date){
        String ordinalDateString = null;
        if (date.getDayOfMonth() % 100 >= 11 && date.getDayOfMonth() % 100 <= 13) {
            return "th";
        }

        switch (date.getDayOfMonth() % 10) {
            case 1:
                ordinalDateString = date.getDayOfMonth() +  "st";
                break;
            case 2:
                ordinalDateString = date.getDayOfMonth() +  "nd";
                break;
            case 3:
                ordinalDateString = date.getDayOfMonth() +  "rd";
                break;
            default:
                ordinalDateString = date.getDayOfMonth() +  "th";
        }
        return String.format("%s of %s, %s", ordinalDateString,date.getMonth(),date.getYear());
    }
    
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1 = LocalDate.of(2005, 6, 7);
        LocalDate date2 = LocalDate.of(2015, Month.JANUARY, 7);
        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15,30);
        LocalTime time3 = LocalTime.of(6, 15,30,2000);
        LocalDateTime ldt1 = LocalDateTime.of(2005, Month.DECEMBER, 7,6,15);
        LocalDateTime ldt2 = LocalDateTime.of(date1,time1);

        //date plus or minus - Years, Months, Weeks, Days
        System.out.println(date1.plusDays(40).minusWeeks(3));
        // date1 = date1.plusDays(40).minusWeeks(3);
        System.out.println(date1);

        // time plus or minus - Hours, Minutes, Seconds, Nanos
        System.out.println(time1.plusHours(1).minusNanos(300));
        System.out.println(time1);
        // DateTime plus or minus - Years, Months, Weeks, Days, Hours, Minutes, Seconds, Nanos
        System.out.println(ldt1.plusDays(21).plusHours(2));
        System.out.println(ldt1);
        LocalDate date3 = LocalDate.of(2000, 5, 11);
        Period period = Period.between(date3, LocalDate.now());
        

        System.out.println(String.format("Duration of your life is %s years, %s months and %s days", 
            period.getYears(),period.getMonths(),period.getDays()));
        LocalDate date4 = LocalDate.of(2025, 7, 2);
        System.out.println(dateOrdinalString(date4));
           
    }
}