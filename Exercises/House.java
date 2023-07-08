package Exercises;

class House {
    private String address;
    private int numberOfFloors;

    public House (String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("A new house object is created");
    }
}

class Tester {
    public static void main(String[] args) {
        House house1;
        House house2;

        house1 = new House("Gwakairu", 2);
        house2 = new House("Nanyuki", 3);
    }
}