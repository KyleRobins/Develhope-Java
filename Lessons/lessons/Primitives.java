package Lessons;

public class Primitives {
    public static void main(String[] args){
        //Essential Primitives: int,char,boolean,double
        //Useful Primitives: long,short,float,byte

        //Essential Primitives

        //Int Example;
        int myInt = 20; //wholes numbers
        System.out.println(myInt);

        //Char Example;
        char myChar = 'A'; // use single quotes to print character literals
        System.out.println("char example: " + myChar);

        //Boolean Example
        boolean myBool = true; // true or false values
        boolean myBool1 = false;
        System.out.println(myBool);
        System.out.println(myBool1);

        //Double Example
        double myDouble = 2.34; //8 bytes
        System.out.println(myDouble);

        //Useful Primitives
        //Long Example
        long myLong = 123456789L; // 8 bytes use the L to represent a long primitive
        System.out.println(myLong);

        //Short Example
        short myShort = 2300; //2 bytes
        System.out.println(myShort);

        //Float Example
        float myFloat = 1.2f; //Add the f to show it's a float
        System.out.println(myFloat);

        //Byte Example
        byte myByte = 50;
        System.out.println(myByte);
    }
}
