import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Dos\\Assign1\\src\\newsource.txt");

        Scanner sc = new Scanner(file);  // Allocates memory for the scanner of our file
        Shape shape = new Shape();  // Creates an instance of Shape class

        while (sc.hasNext()) { // Scans the file until the last input token
            double x = sc.nextDouble();  // Assigns the next double for x
            double y = sc.nextDouble();  // Assigns the next double for y

            Point point = new Point(x, y);  // Creates an instance of a point Class with x and y as parameters
            shape.addPoint(point);  // Adds the instance to the array of the shape class' object
        }

        System.out.println(shape.calculatePerimeter() + " - The perimeter of the shape.");
        System.out.println(shape.getLongestSide() + " - The longest side of the shape.");
        System.out.println(shape.getAverageSide() + " - The average side of the shape.");

    }
}