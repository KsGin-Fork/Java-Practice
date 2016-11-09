package homework.J10;

import javax.swing.*;
import java.awt.*;

/**
 * Created by YangFan on 2016/11/9.
 */
public class G12_4 {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setLayout(new FlowLayout());
        jf.setSize(600,80);
        jf.add(new MyJPanel());
        jf.add(new MyJPanel());
        jf.setVisible(true);
    }
}

class MyJPanel extends JPanel{
    public MyJPanel(){
        this.add(new JButton("Button1"));
        this.add(new JButton("Button2"));
        this.add(new JButton("Button3"));
    }
}