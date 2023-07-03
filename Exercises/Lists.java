
package Exercises;
//-Define a testing class with a main() method where you:
// * -Create a not mutable List of strings called cityNames using asList() that you populate with 3 city names
// *-Try to add a 4th city name at the end of the List -If you get an exception,
// *try to understand why and eventually comment the faulty code -Try to change the 2nd item of the array,
// *entering the value Tegucigalpa print the content of cityNames
// *-Define a mutable empty List of strings called kingsOfRome
// *-Insert the names of the 7 kings of Rome into the mutable list
// *-Print the content of kingsOfRome -Convert kingsOfRome into an array called kingsOfRomeArray,
// *using new String[0] to determine the type of the array
// *-.Change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar
// *Print the content of kingsOfRomeArray
// *

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lists {
    public static void main (String[] args){
        //create a non-mutable list of city names
        List<String> cityNames = Arrays.asList("New York", "Nairobi", "Cairo");

        try {
            //to add a fourth city to the list
            cityNames.add("Kampala");
        } catch (UnsupportedOperationException e){
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Cannot add elements to a non-mutable List.");
        }

        //try to change the second item on the list

        cityNames.set(1, "Tegucigalpa");
        //print the content of citynames

        System.out.println("Content of cityNames: " + cityNames);
        //Define a mutable array list called kings of rome
        List<String> kingsOfRome = new ArrayList<>();
        //insert the names of the 7 kings in a mutable list

        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Tarquinius Superbus");
        //print the content of kingsOfRome

        System.out.println("Contents of kingsOfRome: " + kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[kingsOfRome.size()]);
        // Change the value of the 7th king in kingsOfRomeArray with the value "Lucius Tarquinius Supercar"
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        // Print the content of kingsOfRomeArray
        System.out.println("Content of kingsOfRomeArray: " + Arrays.toString(kingsOfRomeArray));
    }
}
