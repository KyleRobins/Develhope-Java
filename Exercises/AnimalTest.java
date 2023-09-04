package Exercises;

class Animal {
    protected String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void animalSound() {
        System.out.println("Default animal sound");
    }
}

class Lion extends Animal {
    public Lion(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println(animalName + " roars");
    }
}

class Cow extends Animal {
    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println(animalName + " moos");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Lion lion = new Lion("Simba");
        Cow cow = new Cow("Bessie");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}

