/**
 * This class contains methods related to word manipulation games.
 * It provides functionality to add a greeting to a word and concatenate a full name.
 *
 * @author Your Name
 */
public class WordGames {

    /**
     * Adds a greeting "Hello" to the input word.
     *
     * @param word The word to which the greeting is added.
     * @return The formatted string: "Hello [wordHere]".
     */
    public String addHelloWord(String word) {
        return "Hello " + word;
    }

    /**
     * Concatenates the given name and surname to form a full name.
     *
     * @param name    The first name.
     * @param surname The last name.
     * @return The full name obtained by concatenating name and surname.
     */
    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }
}

/**
 * This class is used to test the WordGames class methods.
 * It creates a WordGames object and invokes its methods to demonstrate functionality.
 *
 * @author Your Name
 */
    class Tester {

    /**
     * The main method to test the WordGames class methods.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();

        // Test addHelloWord method
        String greeting = wordGames.addHelloWord("World");
        System.out.println("Result of addHelloWord method: " + greeting);

        // Test getFullName method
        String fullName = wordGames.getFullName("John", "Doe");
        System.out.println("Result of getFullName method: " + fullName);
    }
}
