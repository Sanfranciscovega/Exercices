package com.flafitte.exercices.coords;
import java.awt.Color;

// Pixel = 2 coords + one color
public class Pixel{
	protected Coord X; // X coordinates
	protected Coord Y; // Y coordinates
	
	Pixel(int x,  int X_MIN, int X_MAX, int y,int Y_MIN, int Y_MAX){
		if ((X_MIN<x<<X_MAX)==true) {
			if ((Y_MIN<y<<Y_MAX)==true) {
				// Set x and y coordinates of pixel
				X=new Coord("X", X_MIN, X_MAX, x);
				Y=new Coord("Y", Y_MIN, Y_MAX, y);
			}
			else {throw new Error ("Y hors limites");}
		}
		else {throw new Error ("X hors limites");}
	}
	
	// Return x and y coordinates + color
	protected String getCoord() {
		return (X.getName() + " " + X.getPos() + "," + Y.getName() + " " + Y.getPos() + " couleur: " + color);
	}
	
	// Pixel has a color
	private Color color;
	public Color getColor() {return color;}
	public void setColor(Color color) {this.color = color;}
}


