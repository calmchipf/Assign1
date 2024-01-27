package models;
import java.lang.Math;

public class Point {
    private double x;
    private double y;

    public Point(double x-cord, double y-cord){
        setX(x-cord);
        setY(y-cord);
    }

    public void setX(double x-cord) {
        this.x = x-cord;
    }

    public void setY(double y-cord) {
        this.y = y-cord;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public distance(Point dest) {
        xside = dest.x - this.x;
        yside = dest.y - this.y;
        return Math.sqrt(Math.pow(xside, 2) + Math.pow(yside, 2))
    }

    public String toString {
        return "Point = { x: " + this.getX() + ", y: " + this.getY() + " }";
    }
}