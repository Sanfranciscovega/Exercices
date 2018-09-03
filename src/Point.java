public class Point{
	protected int x;
	protected int y;
	protected int z;
	
	// Getter and setter
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public int getZ() {return z;}
	public void setZ(int z) {this.z = z;}
	
	//Constructor
	Point(int x, int y)  {
		this.x=x;
		this.y=y;
	}

	// Move Pixel
	public void move(int x, int y){
		this.x=this.x+x;
		this.y=this.y+y;
		this.z=this.z+z;
	}
	
	public String toString() {return "X:" + x + ", Y:" + y + ", Z:" + z;}
}



