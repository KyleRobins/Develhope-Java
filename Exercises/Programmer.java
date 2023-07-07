package Exercises;

class Programmer {
    String name;
    int age;
    boolean wearsGlasses;

    //constructor
    public Programmer(String name, int age, boolean wearsGlasses){
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }

    //method
    public void drinkCoffee(){
        System.out.println("Espresso is the secret!: ");
    }

    //method to print programmer details
    public void printDetails(){
        System.out.println(name + " is a " + age + "-yo programmer");
    }

    public void hasGlasses(){
        System.out.println(" Is" + name + "wearing glasses? " + wearsGlasses);
    }

}

class TestProgrammers{
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("john", 30 , false);
        programmer1.drinkCoffee();
        programmer1.printDetails();

        Programmer programmer2 = new Programmer("Kyle",25, true);
        programmer2.printDetails();
        programmer2.hasGlasses();
    }

}
