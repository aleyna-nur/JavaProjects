import javax.swing.*;

public class FaceTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Face to alien");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Face head = new Face();
        frame.add(head);

        frame.setVisible(true);

    }
}    
        