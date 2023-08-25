package container;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        JFrame frame=new JFrame();                                  //cretaes a frame

        frame.setTitle("JFarme title goes here");                   //sets the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //exit out of the app default is HIDE_ON_CLOSE
        frame.setResizable(false);                                  //prevent frame from being resized
        frame.setSize(420,420);                         //sets the x-dimension and y-dimension
        frame.setVisible(true);                                     //make frame visible

        ImageIcon image=new ImageIcon("1.png");               //cretae an ImageIcon
        frame.setIconImage(image.getImage());                       //change icon of frame
        frame.getContentPane().setBackground(Color.cyan);          //chane background color
        //frame.getContentPane().setBackground(new Color(1,25,235));    //(new Color(hexadecimal number of color));

    }


}
