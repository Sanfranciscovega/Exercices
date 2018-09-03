import java.awt.Color;
	
public class Pixel extends Point{
	private Color color;
	static final int MAX_X=2560;
	static final int MAX_Y=1440;
	
	// Getter and setter
	public Color getColor() {return color;}
	public void setColor(Color color) {this.color = color;}
	
	Pixel(int x, int y) throws Exception {
		// Initialize super class constructor
		// Must be the first method
		super(x, y);
		if (x<0  || x>MAX_X || y<0  || y>MAX_Y)
			throw new Exception ("Pixel hors bornes");
	}
	
	Pixel(int x, int y, Color color) throws Exception  {
		// Initialize super class constructor
		// Must be the first method
		super(x, y);
		if (x<0  || x>MAX_X || y<0  || y>MAX_Y)
			throw new Exception ("Pixel hors bornes");
		this.color=color;
	}
	
	
	//Overload method toString of super class Point
	public String toString() {return (super.toString() + ", couleur :" + color.toString());
	}
}



