package models;

public class Point {
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point dest){
        return Math.sqrt(Math.pow(dest.x - this.x, 2.0) + Math.pow(dest.y - this.y, 2.0));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
