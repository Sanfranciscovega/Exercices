import java.awt.Color;

	
public class Pixel extends Point{
	private Color color;
	static final int MAX_X=2560;
	static final int MAX_Y=1440;
	private int oldX;
	private int oldY;
	
	// Getter and setter
	public Color getColor() {return color;}
	public void setColor(Color color) {this.color = color;}
	
	Pixel(int x, int y)  {
		// Initialize super class constructor
		// Must be the first method
		super(x, y);
		isInBound();
		storeOldPositions();
	}
	
	Pixel(int x, int y, Color color)   {
		// Initialize super class constructor
		// Must be the first method
		super(x, y);
		isInBound();
		storeOldPositions();
		this.color=color;
	}
	
	// Move Pixel
	public void move(int x, int y){
		// TODO : check before assigning values
		storeOldPositions();
		super.x=super.x+x;
		super.y=super.y+y;
		isInBound();
	}
	
	private void storeOldPositions() {
		oldX=super.x;
		oldY=super.y;
}

	
	//Overload method toString of super class Point
	public String toString() {return (super.toString() + ", couleur :" + color.toString());}
	
	private void isInBound() {
		if (x<0  || x>MAX_X || y<0  || y>MAX_Y)	{outOfBound();}
	}
	
	private void outOfBound() {
		throw new Error ("Pixel hors bornes / X: " + super.x + " (max:" + MAX_X + "), Y: " + super.y + " (max:" + MAX_Y +")");
	}
}



