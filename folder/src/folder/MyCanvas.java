package folder;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyCanvas extends Canvas implements KeyListener {

	
	DrawImage player = new DrawImage("files/player2.png");
	int x = 0;
	int y = 0;
	
	
	public MyCanvas() {
		
		this.setSize(900, 600);
		this.setBackground(Color.GREEN);
		this.addKeyListener(this);
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(player.getImg(), 100 + x, 100 + y, 80, 100, this);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int c = e.getKeyCode();
		if (c == 37) { //left
			x = x - 20;
		}
		if (c == 39) { //right
			x = x + 20;
		}
		if (c == 38) { //up
			y = y - 20;
		}
		if (c == 40) { //40
			y = y + 20;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
