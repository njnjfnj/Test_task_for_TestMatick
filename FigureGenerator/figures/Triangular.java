package figures;

public class Triangular extends Figure{
	protected double side2;
	protected double gamma;

	public Triangular(int x, int y, String color, double side1, double side2, double gamma) {
        super(x, y, color, side1);
        this.side2 = side2;
        this.gamma = gamma;
    }

	public Triangular(Coordinates cords, String color, double side1, double side2, double gamma) {
        super(cords, color, side1);
        this.side2 = side2;
        this.gamma = gamma;
    }

	@Override
	public double getArea() {
		return this.main_size*this.side2*Math.sin(gamma);
	}

	public double getSide1()	{
		return this.main_size;
	}

	public double getSide2()	{
		return this.side2;
	}
	
	public double getGamma()	{
		return this.gamma;
	}
	

	@Override
    public String toString() {
		return String.format(
		        "{\"Figure\": \"Triangular\", \"area\": %.2f, \"Side1 length\": %.2f, \"Side2 length\": %.2f, \"Gamma corner\": %.2f, \"Color\": \"%s\", \"Pos\": %s}",
		        this.getArea(),
		        this.getSide1(),
		        this.getSide2(),
		        this.getGamma(),
		        this.getColor(),
		        this.cords.toString()
		    );
	}
}
