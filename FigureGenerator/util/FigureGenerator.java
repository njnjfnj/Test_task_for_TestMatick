package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import figures.*;

@FunctionalInterface
interface FigureFactory {
    Figure create(double maxSize, int windowWidth, int windowHeight, Random r);
}

public class FigureGenerator {
	protected ArrayList<FigureFactory> generators = new ArrayList<>();

	
	public static String randomColor() {
        Random rand = new Random();
        int colorInt = rand.nextInt(0xFFFFFF);
        String hex = String.format("#%06X", colorInt);
        return hex;
    }
	
	public FigureGenerator() {		
		generators.add((double maxSize, int windowWidth, int windowHeight, Random r)-> {
			double radius = r.nextDouble(maxSize/2);
			String color = randomColor();
			
			// -(int)(radius/4) so figures can not be much out of bound
			Coordinates cords = new Coordinates(r.nextInt(windowWidth-(int)(radius/4)), r.nextInt(windowHeight)-(int)(radius/4));
						
			return new Circle(cords, color, radius);
		});
		generators.add((double maxSize, int windowWidth, int windowHeight, Random r)-> {
			double side1 = r.nextDouble(maxSize);
			double side2 = r.nextDouble(maxSize);
			String color = randomColor();
			
			Coordinates cords = new Coordinates(r.nextInt(windowWidth-(int)(side1/10)), r.nextInt(windowHeight)-(int)(side2/10));
						
			return new Rectangle(cords, color, side1, side2);
		});
		generators.add((double maxSize, int windowWidth, int windowHeight, Random r)-> {
			double side1 = r.nextDouble(maxSize/1.5);
			double side2 = r.nextDouble(maxSize/1.5);
			double gamma = r.nextDouble(360);
			String color = randomColor();
			
			Coordinates cords = new Coordinates(r.nextInt(windowWidth-(int)(side1/10)), r.nextInt(windowHeight)-(int)(side2/10));
						
			return new Triangular(cords, color, side1, side2, gamma);
		});
		generators.add((double maxSize, int windowWidth, int windowHeight, Random r)-> {
			double side1 = r.nextDouble(maxSize/1.5);
			double side2 = r.nextDouble(maxSize/1.5);
			double alpha = r.nextDouble(360);
			double beta = r.nextDouble(360);
			String color = randomColor();
			
			Coordinates cords = new Coordinates(r.nextInt(windowWidth-(int)(side1/2)), r.nextInt(windowHeight)-(int)(side2/2));
						
			return new Trapezoid(cords, color, side1, side2, alpha, beta);
		});

	}
	
	public LinkedList<Figure> GenerateRandomFigures(int amount, int windowWidth, int windowHeight, int maxSize, long seed) {
		if(seed == -1) seed = System.currentTimeMillis();
		
		LinkedList<Figure> res = new LinkedList<Figure>();
		
		Random r = new Random(seed);
		for(;amount > 0; --amount) {
			res.add(generators.get(r.nextInt(generators.size())).create(maxSize, windowWidth, windowHeight, r));
		}
		
		return res;
	}
}
