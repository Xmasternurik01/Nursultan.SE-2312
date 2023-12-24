package models;
import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> points;
    private int sizeOfArray = 0;
    private double currentLongestSide = 0.0;
    private double currentPerimeter = 0.0;
    public Shape(){
        points = new ArrayList<>();
    }

    public void addPoint(Point point){
        this.points.add(point);
        this.sizeOfArray++;

        if(sizeOfArray > 1){
            Point previousPoint = this.points.get(sizeOfArray - 2);
            double currentSide = point.distance(previousPoint);
            this.currentLongestSide = Math.max(currentSide, this.currentLongestSide);
            this.currentPerimeter += currentSide;
        }
    }
    public double getAverageSide(){
        return (this.calculatePerimeter() / (double)sizeOfArray);
    }
    public double getLongestSide(){
        if(sizeOfArray < 2){
            return 0.0;
        }
        Point firstPoint = points.getFirst();
        Point lastPoint = points.get(sizeOfArray - 1);
        return Math.max(currentLongestSide, lastPoint.distance(firstPoint));
    }
    public double calculatePerimeter(){
        if(sizeOfArray < 2){
            return 0.0;
        }
        Point firstPoint = points.getFirst();
        Point lastPoint = points.get(sizeOfArray - 1);
        return (lastPoint.distance(firstPoint) + currentPerimeter);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
