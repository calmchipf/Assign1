package models;
import java.lang.Math;

public class Point {
    private double x;  // Attribute for x-coordinate
    private double y;  // Attribute for y-coordinate

    public Point(double x_cord, double y_cord){  // Parametrized constructor taking the x and y coordinate values
        setX(x_cord);  // Call of a setter for x-coordinate
        setY(y_cord);  // Call of a setter for y-coordinate
    }

    public double getX() {
        return x;
    }  // Getter for x-coordinate

    public void setX(double x_cord) {
        this.x = x_cord;
    }  // Setter for x-coordinate

    public double getY() {
        return y;
    }  // Getter for x-coordinate

    public void setY(double y_cord) {
        this.y = y_cord;
    }  // Setter for y-coordinate

    public double distance(Point dest_point) {  // Method for calculating the distance between points
        double xside = dest_point.x - this.x;  // Difference between the x-coordinates
        double yside = dest_point.y - this.y;  // Difference between the y-coordinates
        return Math.sqrt(Math.pow(xside, 2) + Math.pow(yside, 2));  // The distance between coordinates
    }

    public String toString() {  // Method for returning the values as a string
        return "Point = { x: " + this.getX() + ", y: " + this.getY() + " }";
    }

}