package Exercises;
import java.util.Scanner;
class HouseEnc {
    private int floorNumbers;
    private String address;
    private String[] residentNames;

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String[] getResidentNames(){
        return residentNames;
    }

    public void setResidentNames(String[] residentNames) {
        this.residentNames = residentNames;
    }
}

class HouseTester{
    public static void main(String[] args) {
        HouseEnc house = new HouseEnc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of floors: ");
        int floorNumbers  = scanner.nextInt();
        house.setFloorNumbers(floorNumbers);
        scanner.nextLine();

        System.out.print("Enter the address: ");
        String address = scanner.nextLine();
        house.setAddress(address);

        System.out.print("Enter the names of the residents (separated by comma): ");
        String residentsInput = scanner.nextLine();
        String[] residentNames = residentsInput.split(",");
        house.setResidentNames(residentNames);

        //printing the house details
        System.out.println("\nHouse details: ");
        System.out.println("Floors: " + house.getFloorNumbers());
        System.out.println("Address: " + house.getAddress());
        System.out.print("Residents: ");
        for (String name : house.getResidentNames()) {
            System.out.print(name.trim() + " ");
        }
    }
}
