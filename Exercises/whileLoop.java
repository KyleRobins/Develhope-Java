package Exercises;
//Write a while loop for our trading bot!
//
//        The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.*
//        It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
//        It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
//        On days which it sells, it can only sell 1000 pounds for euros.
//        Write a while loop
//        Use the calculation for exchange rate below
//        1 + (Math.random() * 0.2);
//        To recalculate our rate every day (once per loop)
//        Print the number of days it takes for our bot to sell its pounds
public class whileLoop {
    public static  void main (String[] args){
     double poundToEuro = 1.15; //exchange rate
        int startingPounds = 10000;// initial amounts of pounds
        int poundsToSell = 1000;//pounds to sell per day
        int days = 0;//counter for the number of days

        while (startingPounds > 0){
            double exchangeRate = 1 + (Math.random() * 0.2);

            if(exchangeRate > poundToEuro){
                startingPounds -= poundsToSell;
            }
            days++;
            System.out.println("Day " + days + ": Remaining Pounds = " + startingPounds);
        }
        System.out.println("It took " + days + " days for the bot to sell all its pounds.");
    }
}
