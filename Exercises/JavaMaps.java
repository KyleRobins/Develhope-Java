package Exercises;

import java.util.HashMap;
import java.util.Map;
public class JavaMaps {
    public static void main(String[] args) {
        // Task 1: Create a HashMap with English names for numbers from 1 to 5
        Map<Integer, String> firstHashMap = new HashMap<>();
        firstHashMap.put(1,"One");
        firstHashMap.put(2,"Two");
        firstHashMap.put(3,"Three");
        firstHashMap.put(4,"Four");
        firstHashMap.put(5,"Five");

        //Task 2: Create a HashMap create an HashMap that maps the odd number from 1 to 9 with their respective Italian names


        Map<Integer, String> secondHashMap = new HashMap<>();
        secondHashMap.put(1,"Uno");
        secondHashMap.put(3,"Tre");
        secondHashMap.put(5,"Cinque");
        secondHashMap.put(7,"Sette");
        secondHashMap.put(9,"Nove");
        
        //Task 3: Merge the firstHashMap into the secondHashMap

        firstHashMap.putAll(secondHashMap);

        //Task 4: Print the modified firstHashMap
        System.out.println("modified first HashMap: ");
        for (Map.Entry<Integer,String>entry : firstHashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //Task 5: Print on screen the value of the keys 5, 6, 7, 8 and 9

        int[] keysToFind = {5,6,7,8,9};
        System.out.println("\nValues of keys 5,6,7,8 and 9:");
        for (int key : keysToFind){
            String value = firstHashMap.get(key);
            if(value != null){
                System.out.println(key + ":" + value);
            } else {
                System.out.println(key + ":No associated value");
            }
        }
    }
}
