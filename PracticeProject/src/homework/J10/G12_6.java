package homework.J10;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by YangFan on 2016/11/9.
 */
public class G12_6 {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setLayout(new GridLayout(2,2));
        jf.setSize(300,200);
        Border bd = BorderFactory.createLineBorder(Color.BLACK,1);
        JLabel jb1 = new JLabel(new ImageIcon("F:\\杨帆\\Pictures\\1.jpg"));
        jb1.setBorder(bd);
        JLabel jb2 = new JLabel(new ImageIcon("F:\\杨帆\\Pictures\\2.jpg"));
        jb2.setBorder(bd);
        JLabel jb3 = new JLabel(new ImageIcon("F:\\杨帆\\Pictures\\3.jpg"));
        jb3.setBorder(bd);
        JLabel jb4 = new JLabel(new ImageIcon("F:\\杨帆\\Pictures\\4.jpg"));
        jb4.setBorder(bd);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.setVisible(true);
    }
}
