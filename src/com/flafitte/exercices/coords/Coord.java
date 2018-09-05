package com.flafitte.exercices.coords;

// Coordinate class
public class Coord{
	// Position
	protected int pos;
	protected int oldPos;
	protected final int MAX_VALUE;
	protected final int MIN_VALUE;
	private final String name;
	
	// Getter and setter
	public int getPos() {return pos;}
	public void setPos(int pos) {oldPos=this.pos;this.pos = pos;}
	public String getName() {return name;}
	public int getMAX_VALUE() {return MAX_VALUE;}
	public int getMIN_VALUE() {return MIN_VALUE;}
	
	
	//Constructors
	Coord(String name,  int MIN_VALUE , int MAX_VALUE,int pos)  {
		if (pos>MAX_VALUE || pos<MIN_VALUE) {outOfBoundError(pos);}
		this.pos=pos;
		this.name=name;
		this.MIN_VALUE=MIN_VALUE;
		this.MAX_VALUE=MAX_VALUE;
	}

	// Move the point by adding/removing m to his position
	public void move(int m) {
		if (this.pos+m < MAX_VALUE || this.pos+m > MIN_VALUE) {
			oldPos=this.pos;
			this.pos=this.pos+m;
		}
		
		else
			{outOfBoundError(pos);}
	}

	// Point is out of MAX_VALUE
	private void outOfBoundError(int pos) {
		throw new Error ("MIN_VALUE < " + pos + "Value " + pos + " > MAX_VALUE " + MAX_VALUE);
	}
	
	public String toString() {return this.name + " position:" + pos;}
}



