import java.awt.Color;


public class Main {

	public static void main(String[] args) throws Exception {
		//Pixel p=new Pixel(1055, 25, Color.red);
		Pixel pix=new Pixel(15, 0, 2560, 15, 0, 1440);
		pix.setColor(Color.GREEN);
		infos(pix);
		// Move Pixel
		pix.X.move(100);infos(pix);
		pix.Y.move(100);infos(pix);
		// Change color
		pix.setColor(Color.BLUE);
		infos(pix);
		

	}

	private static void infos(Pixel p) {
		System.out.println(p.getCoord());
	}
}
