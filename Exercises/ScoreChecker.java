package Exercises;

public class ScoreChecker {
    public static void checkScore(double score) {
        if (score > 0 && score <=50.00){
            System.out.println("Average Score");
        }else if (score > 50.00 && score <= 100.00){
            System.out.println("Very Good Score");
        } else{
            throw new ArithmeticException("Score is out of Scale!");
        }     
    }

    public static void main(String[] args) {
        try{
            double[] scores = {2.15, 50.0, 95.02, 100.01};
            for(double score : scores){
                checkScore(score);
            }
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
}
