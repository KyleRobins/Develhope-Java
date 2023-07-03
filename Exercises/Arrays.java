package Exercises;

public class Arrays {
    public static void main(String[] arg){
        String[] carBrands = {"Bmw", "Toyota", "Subaru", "Honda", "Mercedes"};
        System.out.println("Number of items in carBrands array: " + carBrands.length);
        System.out.println("Third item in carBrand array: " + carBrands[2]);

        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;
        System.out.println("Content of primeNumbers array:");
        for (int number: primeNumbers) {
            System.out.println(number);
        }



    }
}
