package figures;

public class Coordinates {
	protected int x;
	protected int y;
	
	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	
	public double getDistanceFromPos(int x, int y) {
		return Math.sqrt(Math.pow(x-this.x, 2)+Math.pow(y-this.y, 2));
	}
	
	public double getDistanceFromPos(Coordinates cords) {
		return Math.sqrt(Math.pow(cords.getX()-this.x, 2)+Math.pow(cords.getY()-this.y, 2));
	}
	
	public String toString() {
		return String.format("(%d;%d)", this.x, this.y);
	}
}
