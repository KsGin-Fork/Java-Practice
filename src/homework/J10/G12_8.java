package homework.J10;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by YangFan on 2016/11/9.
 */
public class G12_8 {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setLayout(new GridLayout(2,3));
        jf.setSize(300,200);
        Font myFont = new Font("TimesRoman",1,20);
        Border bd = BorderFactory.createLineBorder(Color.YELLOW,1);

        JLabel jb1 = new JLabel("black");
        jb1.setBorder(bd);
        jb1.setFont(myFont);
        jb1.setForeground(Color.BLACK);
        jb1.setToolTipText("black");

        JLabel jb2 = new JLabel("blue");
        jb2.setBorder(bd);
        jb2.setFont(myFont);
        jb2.setForeground(Color.BLUE);
        jb2.setToolTipText("blue");

        JLabel jb3 = new JLabel("cyan");
        jb3.setBorder(bd);
        jb3.setFont(myFont);
        jb3.setForeground(Color.CYAN);
        jb3.setToolTipText("cyan");

        JLabel jb4 = new JLabel("green");
        jb4.setBorder(bd);
        jb4.setFont(myFont);
        jb4.setForeground(Color.GREEN);
        jb4.setToolTipText("green");

        JLabel jb5 = new JLabel("magenta");
        jb5.setBorder(bd);
        jb5.setFont(myFont);
        jb5.setForeground(Color.MAGENTA);
        jb5.setToolTipText("magenta");

        JLabel jb6 = new JLabel("orange");
        jb6.setBorder(bd);
        jb6.setFont(myFont);
        jb6.setForeground(Color.ORANGE);
        jb6.setToolTipText("orange");

        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);
        jf.add(jb6);
        jf.setVisible(true);
    }
}
