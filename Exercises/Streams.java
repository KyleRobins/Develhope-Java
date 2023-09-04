package Exercises;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Streams {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/file.txt"))) {
            reader.lines()
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

