package Lessons;

public class javaConditions {

    public static void main(String[] args) {
        int age = 11;
        int minAgeToDrink = 18;
        boolean canDrink = age >=  minAgeToDrink;
        if(canDrink) {
            System.out.println("You Can drink!");
        } else {
            System.out.println("You can't drink :*(");
        }
    }

}
