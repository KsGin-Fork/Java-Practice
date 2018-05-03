package homework.J07;


import javafx.scene.shape.Circle;

import javax.swing.*;
import java.util.Date;

import java.util.ArrayList;

/**
 * Created by YangFan on 2016/10/19.
 */
public class C11_6 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(new Date());
        arr.add(new String("Hello"));
        arr.add(new JFrame());
        arr.add(new Circle());
        for (int i = 0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i).toString());
        }
    }
}

