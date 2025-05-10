package figures;

public class Circle extends Figure {
	public Circle(int x, int y, String color, double radius) {
        super(x, y, color, radius);
    }
	
	public Circle(Coordinates cords, String color, double radius) {
        super(cords, color, radius);
    }
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.main_size, 2);
	}
	
	public double getCircleLenght()	{
		return 2*Math.PI*this.main_size;
	}
	
	@Override
    public String toString() {
		return String.format("{\"Figure:\" \"Circle\", \"area\": %f, \"Lenght\": %f, \"Color\": %s, \"Pos\": %s}", 
				this.getArea(), this.getCircleLenght(), this.getColor(), this.cords.toString());
	}
	
}
