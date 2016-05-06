package bin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.Timer;

public class DrawApplet extends JApplet implements ActionListener
{
    final static Color bg = Color.white;
    final static Color fg = Color.black;
    final static Color red = Color.red;
    final static Color white = Color.white;
    
    public static float drawWidth = 1000;
    public static float drawHeight = 1000;
    
    public static float incWidth = drawWidth/Main.gridWidth;
    public static float incHeight = drawHeight/Main.gridHeight;
    
    public int x = 0;
    public int y = 0;
    
	int xPos = 0;
	int xSpeed = 10;
	
	int speed = 10;
	
	static boolean started = false;
	
	Timer t = new Timer(20,this);

	public void paint(Graphics g)
	{
        Graphics2D g2 = (Graphics2D)g;
                
        if(!started)
        {
	        for(float i=0;i<drawWidth+10;i+=incWidth)
	        {
	           g2.drawLine((int)i,0,(int)i,(int)drawHeight);
	        }
	        for(float i=0;i<drawHeight+10;i+=incHeight)
	        {
	            g2.drawLine(0,(int)i,(int)drawWidth,(int)i);
	        }
	        started = true;
        }

        g.fillRect(x, y, (int)incWidth, (int)incHeight);
        
        t.start();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		xPos += xSpeed;
		repaint();
	}
	
	public void init()
	{
        //setBackground(bg);
        //setForeground(fg);
	}
	

	public void getKeyInput(int n)
	{
		System.out.println(n);
		
		if(n==87) //up
		{
			System.out.println("yess");
			y-=incHeight;
		}
		else if(n==83) //down
		{
			y+=incHeight;
		}
		else if(n==65) //left
		{
			x-=incWidth;
		}
		else if(n==68) //right
		{
			x+=incWidth;
		}

		//g2.setColor(Color.BLACK);
		//g2.drawLine(0, 0, (int)drawWidth, (int)drawHeight);

	}
	
}
