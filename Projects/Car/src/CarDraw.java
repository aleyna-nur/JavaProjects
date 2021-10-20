import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class CarDraw {
    private int xLeft;
    private int yTop;

    public CarDraw(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    public void Draw(Graphics2D g){
        Rectangle govde = new Rectangle(xLeft,yTop+10,60,10);
        Ellipse2D.Double onTekerlek = new Ellipse2D.Double(xLeft+10,yTop+20,10,10);
        Ellipse2D.Double arkaTekerlek = new Ellipse2D.Double(xLeft+40,yTop+20,10,10);
        Point2D.Double n1 = new Point2D.Double(xLeft+10,yTop+10);
        Point2D.Double n2 = new Point2D.Double(xLeft+20,yTop);
        Point2D.Double n3 = new Point2D.Double(xLeft+40,yTop);
        Point2D.Double n4 = new Point2D.Double(xLeft+50,yTop+10);
        Line2D.Double front = new Line2D.Double(n1,n2);
        Line2D.Double up = new Line2D.Double(n2,n3);
        Line2D.Double back = new Line2D.Double(n3,n4);

        g.draw(govde);
        g.draw(onTekerlek);
        g.draw(arkaTekerlek);
        g.draw(front);
        g.draw(up);
        g.draw(back);
    }
}
