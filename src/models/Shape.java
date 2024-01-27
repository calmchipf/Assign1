package models;
import java.util.ArrayList;
public class Shape {

    ArrayList<Point> points;
    public Shape(){
        points = new ArrayList<Point>();
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public double calculatePerimeter(){
        double perimeter = 0;
        int length = points.size();

        perimeter += points.getFirst().distance(points.get(length - 1));
        for (int i = 1; i < length; i++) {
            perimeter += points.get(i - 1).distance(points.get(i));
        }

        return perimeter;
    }

    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }

    public double getLongestSide() {
        int length = points.size();
        double max_side = points.getFirst().distance(points.get(length - 1));

        for (int i = 1; i < length; i++) {
            double next_side = points.get(i - 1).distance(points.get(i));
            if (next_side > max_side) max_side = next_side;
        }

        return max_side;
    }
}