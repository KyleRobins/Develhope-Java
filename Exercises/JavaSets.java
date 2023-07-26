package Exercises;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaSets{

    public static void main(String[] args) {
        //Task one we are asked to create an HashSet will all the days of the week and print its content

        Set<String> daysOfTheWeekHashSet = new HashSet<>();
        daysOfTheWeekHashSet.add("Monday");
        daysOfTheWeekHashSet.add("Tuesday");
        daysOfTheWeekHashSet.add("Wednesday");
        daysOfTheWeekHashSet.add("Thursday");
        daysOfTheWeekHashSet.add("Friday");
        daysOfTheWeekHashSet.add("Saturday");
        daysOfTheWeekHashSet.add("Sunday");

        System.out.println("HashSet with days of the week:");
        System.out.println(daysOfTheWeekHashSet);

        //Task 2 
        Set<String> daysOfWeekLinkedHashSet = new LinkedHashSet<>();
        daysOfWeekLinkedHashSet.add("Monday");
        daysOfWeekLinkedHashSet.add("Tuesday");
        daysOfWeekLinkedHashSet.add("Wednesday");
        daysOfWeekLinkedHashSet.add("Thursday");
        daysOfWeekLinkedHashSet.add("Friday");
        daysOfWeekLinkedHashSet.add("Saturday");
        daysOfWeekLinkedHashSet.add("Sunday");

        System.out.println("\nLinkedHashSet with days of the week (preserves insertion order):");
        System.out.println(daysOfWeekLinkedHashSet);

        // Task 3: Print the new LinkedHashSet
        System.out.println("\nNew Set (LinkedHashSet):");
        System.out.println(daysOfWeekLinkedHashSet);

        // Task 4: Check if the first HashSet is equal to the LinkedHashSet
        boolean isEqual = daysOfTheWeekHashSet.equals(daysOfWeekLinkedHashSet);
        System.out.println("\nIs the first HashSet equal to the second one? " + isEqual);

    } 
}