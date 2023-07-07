package Exercises;
import java.time.LocalDate;
import java.time.Year;
public class DateAndTime {
    public static void main(String[] args){
        LocalDate currentDate = LocalDate.now();
        //calculate days left in the month
        int daysLeftInTheMonth = currentDate.lengthOfMonth() - currentDate.getDayOfMonth();
        System.out.println("Days left in the month:" + daysLeftInTheMonth);

        //days left until the year ends
        int daysLeftInYear = Year.of(currentDate.getYear()).length() - currentDate.getDayOfYear();
        System.out.println("Days left till year end:" + daysLeftInYear);
    }
}
