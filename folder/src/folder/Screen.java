package folder;

import javax.swing.JFrame;

public class Screen extends JFrame {
	
	public Screen() {
	
		this.setSize(900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Screen screen = new Screen();
		MyCanvas canvas = new MyCanvas();
		screen.getContentPane().add(canvas);
		
	}

}
