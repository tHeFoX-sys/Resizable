import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Frame {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    Random r = new Random();


    Frame(){

        panel.setSize(r.nextInt(),r.nextInt());//Covers all possible resolutions of a monitor
        panel.setBackground(new Color(0,20,40));//Color of the frame



        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//Does nothing when you press the X on the right top corner
        frame.setTitle("RESIZABLE");//Title
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);//Sets the grid layout to null,there are many layouts that you can use in Java Swing
        frame.add(panel);
        frame.setVisible(true);

    }


}
