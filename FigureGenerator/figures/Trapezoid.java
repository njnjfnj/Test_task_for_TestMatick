package figures;

public class Trapezoid extends Figure{
	protected double smallerSide;
	protected double leftCorner;
	protected double rightCorner;

	public Trapezoid(int x, int y, String color, double biggerSide, double smallerSide, double leftCorner, double rightCorner) {
        super(x, y, color, biggerSide);
        this.smallerSide = smallerSide;
        this.leftCorner = leftCorner;
        this.rightCorner = rightCorner;

    }

	public Trapezoid(Coordinates cords, String color, double biggerSide, double smallerSide, double leftCorner, double rightCorner) {
        super(cords, color, biggerSide);
        this.smallerSide = smallerSide;
        this.leftCorner = leftCorner;
        this.rightCorner = rightCorner;
    }

	@Override
	public double getArea() {
		return Math.pow(this.main_size - this.smallerSide, 2)*Math.tan(leftCorner)*Math.tan(rightCorner)/(2*(Math.tan(leftCorner)+Math.tan(rightCorner)));
	}

	public double getBiggerSideLenght()	{
		return this.main_size;
	}

	public double getSmallerSideLenght()	{
		return this.smallerSide;
	}
	
	public double getLeftCorner()	{
		return this.leftCorner;
	}
	
	public double getRightCorner()	{
		return this.rightCorner;
	}

	@Override
    public String toString() {
		return String.format(
		        "{\"Figure\": \"Trapezoid\", \"area\": %.2f, \"Bigger side length\": %.2f, \"Smaller side length\": %.2f, \"Left corner\": %.2f, \"Right corner\": %.2f, \"Color\": \"%s\", \"Pos\": %s}",
		        this.getArea(),
		        this.getBiggerSideLenght(),
		        this.getSmallerSideLenght(),
		        this.getLeftCorner(),
		        this.getRightCorner(),
		        this.getColor(),
		        this.cords.toString()
		    );
	}
}
