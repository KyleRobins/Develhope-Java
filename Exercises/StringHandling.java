package Exercises;

public class StringHandling {
    public static void main(String[] args){
        String string1 = "Hello";
        String string2 = "How are you?";
        //Extract the first two characters from string1
        String FirstTwoCharacters = string1.substring(0, 2);
        //Extract the last two characters from string2
        String LastTwoCharacters = string2.substring(string2.length() -2);
        //combine the four chars  into an array of char
        char[] charArray = (FirstTwoCharacters + LastTwoCharacters).toCharArray();

        //print chararray
        System.out.println(charArray);

    }
}
