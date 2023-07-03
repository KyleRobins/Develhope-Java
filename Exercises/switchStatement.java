package Exercises;
import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.print("Enter a number between 1 and 10 (or 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                quit = true;
            } else {
                try {
                    int number = Integer.parseInt(input);

                    if (number >= 1 && number <= 10) {
                        switch (number) {
                            case 1:
                                System.out.println("one");
                                break;
                            case 2:
                                System.out.println("two");
                                break;
                            case 3:
                                System.out.println("three");
                                break;
                            case 4:
                                System.out.println("four");
                                break;
                            case 5:
                                System.out.println("five");
                                break;
                            case 6:
                                System.out.println("six");
                                break;
                            case 7:
                                System.out.println("seven");
                                break;
                            case 8:
                                System.out.println("eight");
                                break;
                            case 9:
                                System.out.println("nine");
                                break;
                            case 10:
                                System.out.println("ten");
                                break;
                        }
                    } else {
                        System.out.println("Cannot give you the name");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or 'q' to quit.");
                }
            }
        }
    }
}
