package homework.J11;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by YangFan on 2016/11/16.
 */
public class G16_8 {
    public static void main(String[] args){
        MouseDemo ms = new MouseDemo();
    }
}

class MouseDemo extends JFrame{
    JLabel outPutLabel = new JLabel();
    public MouseDemo(){
        this.setLayout(null);
        this.setSize(500,250);
        this.setVisible(true);
        this.add(outPutLabel);
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                outPutLabel.setBounds(e.getX() , e.getY()-40 , 100 ,20);
                outPutLabel.setText("(" + e.getX() + "," + e.getY() + ")");
                outPutLabel.setVisible(true);
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                outPutLabel.setBounds(e.getX() , e.getY()-40 , 100 ,20);
                outPutLabel.setText("(" + e.getX() + "," + e.getY() + ")");
                outPutLabel.setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                outPutLabel.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                outPutLabel.setVisible(false);
            }


        });
    }


}