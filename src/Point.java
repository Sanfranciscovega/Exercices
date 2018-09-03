import java.awt.Color;

public class Point {
	private int x;
	private int y;
	
	//Constructor
	Point(int x, int y)  {
		this.x=x;
		this.y=y;
	}

	public String toString() {
		return "(" + x + "," + y +")";
	}
	
	// Intern class Pixel
	// Must be static, otherwise must instanciate in first call
	// Point p= new Point(...)
	// then Pixel pix=p.new Pixel(...)
	public static class Pixel extends Point{
		private Color color;
		
		Pixel(int x, int y, Color color)  {
			// Initialize super class constructor
			// Must be the first method
			super(x, y);
			this.color=color;
			
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
		
		//Overload method of super class toString
		public String toString() {
			return (super.toString() + " couleur :" + color);
		}
	}
	
	public static void main(String[] args) {
		Pixel p=new Pixel(15, 25, Color.red);
		System.out.println(p.toString());
	}
	
}

