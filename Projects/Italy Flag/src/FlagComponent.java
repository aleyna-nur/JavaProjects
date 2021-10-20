import javax.swing.*;
import java.awt.*;

public class FlagComponent extends JComponent {
    public void paintComponent(Graphics2D g){
        Graphics2D g2 = (Graphics2D) g;
        ItalyFlag flag = new ItalyFlag(100,100, 90);
        flag.drawFlag(g2);
    }
}
