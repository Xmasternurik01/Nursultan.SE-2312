import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        // implicit casting byte > short > int > long > float > double
        File file = new File("C:\\Users\\ACER\\IdeaProjects\\as1\\src\\source.txt");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while (sc.hasNext()) {
            double x = Double.parseDouble(sc.next());
            double y = Double.parseDouble(sc.next());

            Point point = new Point(x, y);
            shape.addPoint(point);

            // Print the coordinates as they are read
            System.out.println("Added point: (" + x + ", " + y + ")");
        }



        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest Side: " + shape.getLongestSide());
    }
}