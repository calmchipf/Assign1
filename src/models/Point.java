package models;
import java.lang.Math;

public class Point {
    private double x;
    private double y;

    public Point(double x_cord, double y_cord){
        setX(x_cord);
        setY(y_cord);
    }

    public void setX(double x_cord) {
        this.x = x_cord;
    }

    public void setY(double y_cord) {
        this.y = y_cord;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point dest_point) {
        double xside = dest_point.x - this.x;
        double yside = dest_point.y - this.y;
        return Math.sqrt(Math.pow(xside, 2) + Math.pow(yside, 2));
    }

    public String toString() {
        return "Point = { x: " + this.getX() + ", y: " + this.getY() + " }";
    }

}