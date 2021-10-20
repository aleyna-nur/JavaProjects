import java.awt.*;
import java.awt.geom.Line2D;

public class ItalyFlag {
    public int xLeft;
    public int yTop;
    public int width;

    public ItalyFlag(int x, int y, int awidth){
        xLeft = x;
        yTop = y;
        width = awidth;
    }

    public void drawFlag(Graphics2D g2){
        Rectangle d1 = new Rectangle(xLeft, yTop, width/3, width * (2/3));
        Rectangle d2 = new Rectangle(xLeft + width * (2/3), yTop, width/3, width * (2/3));

        Line2D.Double l1 = new Line2D.Double(xLeft + width/3, yTop, xLeft + width * (2/3), yTop);
        Line2D.Double l2 = new Line2D.Double(xLeft + width/3, yTop + width * (2/3), xLeft + width * (2/3), yTop + width * (2/3) );

        g2.setColor(Color.GREEN);
        g2.fill(d1);
        g2.setColor(Color.RED);
        g2.fill(d2);
        g2.setColor(Color.BLACK);
        g2.draw(l1);
        g2.draw(l1);

    }
}
