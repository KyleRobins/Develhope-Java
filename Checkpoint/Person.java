package Checkpoint;
//
//Create a class called "Person" with properties such as name, age, and address. Implement the constructor and appropriate accessor methods for the class.
//        In the main method, create a new person object, set its properties, and print the details of the person.
//        Part Two:
//
//        Create a class called "Library" with an empty constructor and a list of books as its property.
//        Implement a method called "addBook" that allows you to add a new book to the library.
//        In the main method, create a new instance of the "Library" class and add at least three books of your choice.
//        Print the list of books in the library.
//        Part Three (Bonus):
//
//        Create a class called "Rectangle" with properties like length and width. Implement the constructor and appropriate accessor methods for the class.
//        Add a method called "calculatePerimeter" that calculates and returns the perimeter of the rectangle.
//        In the main method, create a new instance of the "Rectangle" class, set its properties, and call the "calculatePerimeter" method to calculate and print the perimeter

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    private String address;
public Person(String name, int age, String address ) {
    this.name = name;
    this.age = age;
    this.address = address;
}

public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public String getAddress(){
    return address;
}
//the library class
class Library{
    private List<String>books;
        public Library(){
            books = new ArrayList<>();
        }


        public void addBook(String book){
            books.add(book);
        }
    public List<String> getBooks() {
        return books;
    }
    //main class
    public class main{
        public static void main(String[] args){
            //get person
            Person person = new Person ("Kyle", 30, "Ruiru");
            System.out.println("Person Details");
            System.out.println();

        }
    }



}

}
