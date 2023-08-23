public class Shape {

    // Define the Drawable interface
    interface Drawable {
        void draw();
    }

    // Implement Circle class
    static class Circle implements Drawable {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a circle with radius " + radius);
        }
    }

    // Implement Square class
    static class Square implements Drawable {
        private double sideLength;

        public Square(double sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a square with side length " + sideLength);
        }
    }

    // Implement Triangle class
    static class Triangle implements Drawable {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a triangle with base " + base + " and height " + height);
        }
    }

    public static void main(String[] args) {
        // Create instances of the shapes
        Drawable circle = new Circle(5);
        Drawable square = new Square(4);
        Drawable triangle = new Triangle(3, 6);

        // Call the draw() method on each shape
        circle.draw();
        square.draw();
        triangle.draw();
    }
}
