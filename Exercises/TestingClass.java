package Exercises;

public class TestingClass {
    public static void main(String[] arg){
        int a = 15;
        a += 5;
        a -= 4;
        int b = a++;
        boolean statement1 = (b % 2 != 0);
        boolean statement2 = (((b * (b + 1)) % 3) == 0);

        System.out.println("Statement 1: " + statement1);
        System.out.println("Statement 2: " + statement2);
    }
}
