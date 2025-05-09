package figures;

public abstract class Figure {
    protected String color; // in hex like #b8b8b8
    protected double main_size;
    
    protected Coordinates cords; // in usual cords of figure is top-left corner of the figure

    public Figure(int x, int y, String color, double size1) {
        this.color = color;
        this.main_size = size1;
        this.cords = new Coordinates(x, y);
    }
    
    public Figure(Coordinates cords, String color, double size1) {
        this.color = color;
        this.main_size = size1;
        this.cords = cords;
    }

    public String getColor() {
        return color;
    }
    
    public Coordinates GetPos() {
    	return cords;
    }
    
    public double getDistanceFromAnotherFigure(Figure fig) {
    	return cords.getDistanceFromPos(fig.GetPos());
    }

    public abstract double getArea();
    public abstract String toString();
    
}
