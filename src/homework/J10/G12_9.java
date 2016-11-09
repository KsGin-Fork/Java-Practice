package homework.J10;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by YangFan on 2016/11/9.
 */
public class G12_9 {
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setLayout(new GridLayout(1,3));
        jf.setSize(600,150);
        for (int i = 0 ; i < 3 ; i++){
            jf.add(new JLabel(new ImageIcon("image\\card\\"+(new Random().nextInt(53)+1)+".png")));
        }
        jf.setVisible(true);
    }
}
