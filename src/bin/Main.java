package bin;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Main 
{
	public static int gridWidth = 10;
	public static int gridHeight = 10;
	
	public static DrawApplet d;
	public static Graphics g;
	
	
	GridPoint[][] grid = new GridPoint[gridWidth][gridHeight];

	public static void main(String[] args)
	{
		JFrame drawFrame = new JFrame("Drawing");
		drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawFrame.setLocation(300,300);
		
		KeyInput k = new KeyInput();
		drawFrame.addKeyListener(k);
		
        d = new DrawApplet();
        
        drawFrame.getContentPane().add("Center", d);
        d.init();
		drawFrame.pack();
		drawFrame.setSize((int)d.drawWidth+33,(int)d.drawHeight+89);
		drawFrame.setVisible(true);
		
		/*while(true)
		{
			try
			{
				d.paint(g);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				Thread.currentThread().interrupt();
			}
		}*/
	}

}


