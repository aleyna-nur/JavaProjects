import javax.swing.*;

public class FlagView {
    public static void main(String[] args) {
        JFrame cerceve = new JFrame();
        cerceve.setTitle("Flag");
        cerceve.setSize(400,400);
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //cerceve.setVisible(true);

        FlagComponent flag = new FlagComponent();
        cerceve.add(flag);
        cerceve.setVisible(true);

    }
}    
        