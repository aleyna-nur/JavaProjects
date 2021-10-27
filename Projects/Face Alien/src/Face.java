import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Face extends JComponent{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double head = new Ellipse2D.Double(100,100,200,300);
        g2.draw(head);

        g2.setColor(Color.GREEN);
        Rectangle eye = new Rectangle(140,180,30,30);
        g2.fill(eye);
        eye.translate(80,0);
        g2.fill(eye);

        g2.setColor(Color.RED);
        Line2D.Double mouth = new Line2D.Double(150,300,250,300);
        g2.draw(mouth);

        g2.setColor(Color.BLUE);
        g2.drawString("Hello world", 165,420);


    }
}

