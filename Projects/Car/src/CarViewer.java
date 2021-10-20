import javax.swing.*;

public class CarViewer {
    public static void main(String[] args)
    {
        JFrame cerceve = new JFrame();
        cerceve.setTitle("Arabalar");
        cerceve.setSize(300,400);
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cerceve.setVisible(true);

        CarComponent bilesen = new CarComponent();
        cerceve.add(bilesen);
        cerceve.setVisible(true);


    }
}
