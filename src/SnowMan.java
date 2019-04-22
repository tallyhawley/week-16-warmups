import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman 
	   int temp = getHeight()/3;
	   window.setColor(getColor());
	   window.fillOval(getXPos(), getYPos(), getWidth(), temp);
	   window.fillOval(getXPos(), getYPos()+temp, getWidth(), temp);
	   window.fillOval(getXPos(), getYPos()+temp*2, getWidth(), temp);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}