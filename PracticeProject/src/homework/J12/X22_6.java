package homework.J12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by KsGin on 2016/12/2.
 */
public class X22_6 {
    public static void main(String[] args) {
        new Show();
    }
}

class Show extends JFrame {
    JTextField jtread = new JTextField(25);
    Set<Double> numberSet = new HashSet<>();
    public Show() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(new JLabel("Enter number : "));

        JTextField jt = new JTextField(15);
        jt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    try {
                        numberSet.add(Double.parseDouble(jt.getText()));
                        jtread.setText("");
                        for (Double n : numberSet) {
                            jtread.setText(jtread.getText() + n + " ");
                        }
                        jt.setText("");
                    }catch (NumberFormatException ne){
                        JOptionPane.showMessageDialog(null , "please input a number ! ");
                    }
                }
            }
        });
        this.add(jt);
        this.add(jtread);

        JButton jbt_sort = new JButton("Sort");
        jbt_sort.addActionListener(e -> Sort());
        this.add(jbt_sort);

        JButton jbt_shuffle = new JButton("Shuffle");
        jbt_shuffle.addActionListener(e -> Shuffle());
        this.add(jbt_shuffle);

        JButton jbt_reverse = new JButton("Reverse");
        jbt_reverse.addActionListener(e -> Reverse());
        this.add(jbt_reverse);

        this.setSize(400,200);
        this.setVisible(true);
    }

    private void Sort(){
        Double[] doubles = new Double[numberSet.size()];
        numberSet.toArray(doubles);
        Arrays.sort(doubles);
        String text = "";
        for (Double i : doubles){
            text += (i + " ");
        }
        jtread.setText(text);
    }

    public void Shuffle(){
        String text = "";
        Double[] doubles = new Double[numberSet.size()];
        numberSet.toArray(doubles);
        for (int i = numberSet.size() - 1 ; i >= 0  ; --i){
            int index = (int)(Math.random() * i);
            text += doubles[index] + " ";
            for (int j = index ; j < numberSet.size() - 1 ; ++j){
                doubles[j] = doubles[j+1];
            }
        }
        jtread.setText(text);
    }

    public void Reverse(){
        String text = "";
        List<Double> integerList = new LinkedList<>();
        Matcher m = Pattern.compile("\\b([\\-0-9.]+)\\b").matcher(jtread.getText());
        while (m.find()){
            integerList.add(Double.parseDouble(m.group(1)));
        }
        for (Double i : integerList){
            text = i + " " + text;
        jtread.setText(text);
    }
    }
}