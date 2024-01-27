package models;
import java.util.ArrayList;
public class Shape {

    ArrayList<Point> points;  // Creating an attribute for the ArrayLis
    public Shape(){  // A default constructor allocating memory for our 'points' attribute
        points = new ArrayList<Point>();
    }

    public void addPoint(Point point){  // Method for adding the given point to the array
        points.add(point);
    }

    public double calculatePerimeter(){  // Method for calculating the perimeter of the shape
        double perimeter = 0;  // Declaration of the perimeter
        int length = points.size();

        // Adding the length between the first and last points to the perimeter
        perimeter += points.getFirst().distance(points.get(length - 1));
        for (int i = 1; i < length; i++) {  // Adds the lengths between points from first to last to the perimeter
            perimeter += points.get(i - 1).distance(points.get(i));
        }

        return perimeter;  // Return of the perimeter
    }

    public double getAverageSide() {  // Method for calculating the average side of the shape
        return calculatePerimeter() / points.size();  // Return of the perimeter divided by the number of points
    }

    public double getLongestSide() {  // Method for getting the longest side of the shape
        int length = points.size();
        double max_side = points.getFirst().distance(points.get(length - 1));
        // By typing this we assume that the first length is the maximum

        for (int i = 1; i < length; i++) {  // We check every other length with the initial to get the maximum
            double next_side = points.get(i - 1).distance(points.get(i));
            if (next_side > max_side) max_side = next_side;
        }

        return max_side;  // Return of the longest side
    }

}