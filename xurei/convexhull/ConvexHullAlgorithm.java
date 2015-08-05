package xurei.convexhull;
import java.awt.Point;
import java.util.ArrayList;

public interface ConvexHullAlgorithm 
{
	ArrayList<Point> execute(ArrayList<? extends Point> points);
}
