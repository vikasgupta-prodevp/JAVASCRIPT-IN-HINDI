import javax.swing.*;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {
    ImageIcon image=new ImageIcon("C:\\Users\\vikas gupta\\Desktop\\JAVA\\JAVA-2\\src\\Screenshot 2023-11-02 201741.png");

        JLabel label=new JLabel();
        label.setText("hello bro");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("MV Boil",Font.PLAIN,20));
        label.setIconTextGap(100);



        JFrame frame=new JFrame();
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.ICONIFIED);
        frame.setVisible(true);

        frame.add(label);


    }

}
