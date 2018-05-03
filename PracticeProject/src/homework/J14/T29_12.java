package homework.J14;

import javax.swing.*;

/**
 * Created by KsGin on 12/22/2016.
 */
public class T29_12 {
    public static void main(String[] args) throws InterruptedException {
        UsingJprocessbar usingJprocessbar = new UsingJprocessbar(0);
        for (int i = 0 ; i < 1000 ; ++i){                  //只实现1000次
            Thread.currentThread().sleep(500);
            usingJprocessbar.setValue((int)(Math.random() * 100));
        }
    }
}


class UsingJprocessbar extends JFrame{
    JProgressBar jProgressBar;
    int value;
    UsingJprocessbar(int value){
        this.value = value;
        jProgressBar = new JProgressBar();
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(100);
        jProgressBar.setSize(200 , 20);
        jProgressBar.setValue(value);
        this.setSize(1000 , 300);
        this.add(jProgressBar);
        this.setVisible(true);
    }

    public void setValue(int value){
        jProgressBar.setValue(value);
    }
}


