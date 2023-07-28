package Exercises;
import java.util.*;

public class JavaMapsAndSets {
    public static void main(String[] args) {
        // Task 1: create a Map called months where the key is the name of the month and value is the cardinal number of the month
        Map<String, Integer> months = new LinkedHashMap<>();

        // Task 2: populate the Map, being sure to preserve the insertion order
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        // Task 3: obtain and print a Set view of the keys that are in months using a specific Map method
        Set<String> monthKeys = months.keySet();
        System.out.println("Set view of the keys in the month:");
        System.out.println(monthKeys);

        // Task 4: then convert months using a Collection of integers:
        // into a List (and print it) of integers called cardinalMonth where you insert all the values of the Map
        // into an array (and print it) of integers called cardinalMonthArray where you insert all the values of the Map

        List<Integer> valuesList = new ArrayList<>(months.values());
        System.out.println("\nList of integers (cardinalMonth):");
        System.out.println(valuesList);

        Integer[] cardinalMonthArray = valuesList.toArray(new Integer[0]);
        System.out.println("\nArray of integers (cardinalMonthArray):");
        System.out.println(Arrays.toString(cardinalMonthArray));
    }
}

