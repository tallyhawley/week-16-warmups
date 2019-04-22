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
	   //arms
	   window.setColor(Color.black);
	   window.drawLine(getXPos(), getYPos() + 3*temp/2, getXPos() - temp, getYPos() + temp);
	   window.drawLine(getXPos()+getWidth(), getYPos() + 3*temp/2, getXPos() + getWidth() + temp, getYPos() + temp);
	   //body
	   window.setColor(getColor());
	   window.fillOval(getXPos(), getYPos(), getWidth(), temp);
	   window.fillOval(getXPos(), getYPos()+temp, getWidth(), temp);
	   window.fillOval(getXPos(), getYPos()+temp*2, getWidth(), temp);
	   //face
	   window.setColor(Color.black);
	   window.fillOval(getXPos() + getWidth()/4, getYPos() + temp/3, temp/5, temp/5);
	   window.fillOval(getXPos() + 3*getWidth()/4 - temp/5, getYPos() + temp/3, temp/5, temp/5);
	   window.setColor(Color.orange);
	   window.fillPolygon(new int[]{getXPos() + getWidth()/2,getXPos() + getWidth()/2, getXPos() + getWidth() - temp/5}, new int[]{getYPos() + temp/2, getYPos() + temp/2 + temp/5, getYPos() + temp/2 + temp/10}, 3);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}