import java.awt.Color;
	
public class Pixel extends Point{
	private Color color;
			
	// Getter and setter
	public Color getColor() {return color;}
	public void setColor(Color color) {this.color = color;}
	
	Pixel(int x, int y)  {
		// Initialize super class constructor
		// Must be the first method
		super(x, y);
	}
	
	Pixel(int x, int y, Color color)  {
		// Initialize super class constructor
		// Must be the first method
		super(x, y);
		this.color=color;
	}
	


	
	//Overload method toString of super class Point
	public String toString() {return (super.toString() + ", couleur :" + color.toString());
	}
}



