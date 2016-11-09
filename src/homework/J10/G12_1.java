package homework.J10;

import javax.swing.*;
import java.awt.*;

/**
 * Created by YangFan on 2016/11/9.
 */
public class G12_1 {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setLayout(new FlowLayout());
        jf.setSize(600,80);
        JPanel jp1 = new JPanel(new FlowLayout());
        jp1.add(new JButton("Button1"));
        jp1.add(new JButton("Button2"));
        jp1.add(new JButton("Button3"));
        JPanel jp2 = new JPanel(new FlowLayout());
        jp2.add(new JButton("Button4"));
        jp2.add(new JButton("Button5"));
        jp2.add(new JButton("Button6"));

        jf.add(jp1);
        jf.add(jp2);
        jf.setVisible(true);
    }
}
