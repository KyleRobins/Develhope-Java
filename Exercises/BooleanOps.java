/*Question
*Try to solve on paper the following boolean algebra operations:

[A]: 2 <= 2 && !true
[B]: !false && 3 > 2
[C]: considering that t=false and f=true: !(!t || f)
[D]: 6 > 6 ^ !(true && true)
Then compare your solutions with a Java program that tests the validity of your assumptions.
*
*
* */


package Exercises;

public class BooleanOps {
    public static void main(String[] args){
        boolean assumptionA = 2 <= 2 && !true;
        System.out.println("Assumption A: " + assumptionA);
        boolean assumptionB = !false && 3 > 2;
        System.out.println("Assumption B: " + assumptionB);
        boolean t = false;
        boolean f = true;
        boolean assumptionC = !(!t || f);
        System.out.println("Assumption C: " + assumptionC);
        boolean assumptionD = 6 > 6 ^ !(true && true);
        System.out.println("Assumption D: " + assumptionD );

    }
}
