package homework.J11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

/**
 * Created by YangFan on 2016/11/16.
 */
public class G16_11 {
    public static void main(String[] args){
        ShowWord sw = new ShowWord();
    }
}

class ShowWord extends JFrame{
    JLabel jLabel = new JLabel();
    int mX = 0;
    int mY = 0;
    public ShowWord(){
        this.setLayout(null);
        this.setSize(500,250);
        this.add(jLabel);
        this.setVisible(true);
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mX = e.getX();
                mY = e.getY();
            }
        });
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                jLabel.setFont(new Font("Consolas" , 0 , 20));
                jLabel.setBounds(mX -10 , mY-45 , 50 ,20);
                jLabel.setText(e.getKeyChar()+"");
            }
        });

    }
}
