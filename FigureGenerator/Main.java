
import util.FigureGenerator;
import figures.*;

public class Main {
	public static void main(String[] args) {
		FigureGenerator g = new FigureGenerator();
		
		for(Figure i : g.GenerateRandomFigures(10, 1920, 1080, 300, -1)) {
			System.out.println(i.toString());
		}
		
	}
}
