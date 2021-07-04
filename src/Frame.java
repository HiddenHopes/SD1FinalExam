import javax.swing.*;

public class Frame {
    public static void main (String[] args)  {
        JFrame frame = new JFrame();
        frame.setSize(852,480);
        frame.add(new board());
        frame.setVisible(true);
    }
}