package Exercises;

public class Enumerations {

    public enum Month{
        JANUARY ,FEBRUARY ,MARCH ,APRIL ,MAY ,JUNE ,JULY ,AUGUST ,SEPTEMBER ,OCTOBER ,NOVEMBER ,DECEMBER;
    }
    public static void main(String[] args) {
        //Iterate through the month enumuration
        for (Month month : Month.values()){
            String monthName = month.name();
            String message = monthName + (monthName.endsWith("Y") ? " ends with Y": " doesn't end with y");
            System.out.println(message);
        }

    }
}
