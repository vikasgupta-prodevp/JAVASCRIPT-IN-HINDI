//import javax.swing.*;
//import java.awt.*;
//
//public class MyFrame extends JFrame {
//    MyFrame(){
//
//        this.setVisible(true);
//        this.setSize(245,245);
//        this.setTitle("Hello and welcome");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
//
//        ImageIcon image=new ImageIcon("C:\\Users\\vikas gupta\\Desktop\\JAVA\\JAVA-2\\src\\logo.png");
//        this.setIconImage(image.getImage());
//
//        this.getContentPane().setBackground(Color.gray);
//    }
//}


import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

    this.setVisible(true);
     this.setResizable(true);
        this.setSize(445,454);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      this.getContentPane().setBackground(Color.gray);

        ImageIcon image=new ImageIcon("C:\\Users\\vikas gupta\\Desktop\\JAVA\\JAVA-2\\src\\logo.png");
   this.setIconImage(image.getImage());
   this.setTitle("This is Made from JAVA CODE");
    }
}

