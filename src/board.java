import javax.swing.*;
import java.awt.*;
public class board extends JPanel{
    Image img;
    Car car;
    board(){
        ImageIcon imageIcon = new ImageIcon("test.jpeg");
        img = imageIcon.getImage();

        car = new Car();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(img,0,0,this);
        g.drawImage(car.carimage,300,450,this);
    }
}
