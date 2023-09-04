package Exercises;

class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape() {
        System.out.println("Creating a Shape object");
        shapeName = "Undefined shape";
    }

    public Shape(double radius) {
        System.out.println("Creating a Circle object");
        shapeName = "Circle";
        numberOfEdges = 0;
    }

    public Shape(int edges, double edgeLength) {
        System.out.println("Creating a Square object");
        shapeName = "Square";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2) {
        System.out.println("Creating a Rectangle object");
        shapeName = "Rectangle";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("Creating a Triangle object");
        shapeName = "Triangle";
        numberOfEdges = edges;
    }

    public String getShapeDetails() {
        return "Shape: " + shapeName + "\nNumber of Edges: " + numberOfEdges;
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(5.0);
        Shape shape3 = new Shape(4, 10.0);
        Shape shape4 = new Shape(4, 5.0, 8.0);
        Shape shape5 = new Shape(3, 3.0, 4.0, 5.0);

        String shape1Details = shape1.getShapeDetails();
        String shape2Details = shape2.getShapeDetails();
        String shape3Details = shape3.getShapeDetails();
        String shape4Details = shape4.getShapeDetails();
        String shape5Details = shape5.getShapeDetails();

        System.out.println(shape1Details);
        System.out.println(shape2Details);
        System.out.println(shape3Details);
        System.out.println(shape4Details);
        System.out.println(shape5Details);
    }
}

