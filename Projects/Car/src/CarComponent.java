import javax.swing.*;
import java.awt.*;

public class CarComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        CarDraw araba1 = new CarDraw(50,50);

        araba1.Draw(g2);
    }
}
