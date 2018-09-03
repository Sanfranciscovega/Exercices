import java.awt.Color;


public class Main {

	public static void main(String[] args) throws Exception {
		Pixel p=new Pixel(1055, 25, Color.red);
		infos(p);
		// Move Pixel
		p.move(100, 10);
		infos(p);
		// Change color
		p.setColor(Color.BLUE);
		infos(p);
		

	}

	private static void infos(Pixel p) {
		System.out.println(p.toString());
	}
}
