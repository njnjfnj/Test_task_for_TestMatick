package figures;

public class Rectangle extends Figure {
	protected double sideSize2;
	
	public Rectangle(int x, int y, String color, double sideSize1, double sideSize2) {
        super(x, y, color, sideSize1);
        this.sideSize2 = sideSize2;
        if(sideSize1 < sideSize2) {
        	this.main_size = sideSize2;
        	this.sideSize2 = sideSize1;
        } 
    }
	
	public Rectangle(Coordinates cords, String color, double sideSize1, double sideSize2) {
        super(cords, color, sideSize1);
        this.sideSize2 = sideSize2;
    }
	
	@Override
	public double getArea() {
		return this.main_size * this.sideSize2;
	}
	
	public double getBiggerSideLenght()	{
		return this.main_size;
	}
	
	public double getSmallerSideLenght()	{
		return this.sideSize2;
	}
	
	@Override
    public String toString() {
		return String.format("{\"Figure:\" \"Square\", \"area\": %f, \"Bigger side lenght\": %f, \"Smaller side lenght\": %f, \"Color\": %s, \"Pos\": %s}", 
				this.getArea(), this.getBiggerSideLenght(), this.getSmallerSideLenght(), this.getColor(), this.cords.toString());
	}

}
