package homework.J11;

import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;

/**
 * Created by YangFan on 2016/11/16.
 */
public class G16_16{
    public static void main(String[] args){
        Show s = new Show();
    }
}

class Show extends JFrame{
    boolean flag = true;
    JLabel jLabel = new JLabel("www.xxxxxx.com");
    public Show(){
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.setVerticalAlignment(SwingConstants.CENTER);
        jLabel.setForeground(Color.WHITE);
        this.add(jLabel);
        this.setSize(500,250);
        this.setVisible(true);
        java.util.Timer timer = new java.util.Timer(true);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                flag = !flag;
                jLabel.setVisible(flag);
            }
        };
        timer.schedule(task,1000 ,300);
    }
}
