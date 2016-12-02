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
    JTextField jtread = new JTextField(20);
    Set<Integer> integerSet = new HashSet<>();
    public Show() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(new JLabel("Enter number : "));

        JTextField jt = new JTextField(10);
        jt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    try {
                        integerSet.add(Integer.parseInt(jt.getText()));
                        jtread.setText("");
                        for (Integer n : integerSet) {
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

        jtread.enableInputMethods(false);
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
        Integer[] ints = new Integer[integerSet.size()];
        integerSet.toArray(ints);
        Arrays.sort(ints);
        String text = "";
        for (Integer i : ints){
            text += (i + " ");
        }
        jtread.setText(text);
    }

    public void Shuffle(){
        String text = "";
        Integer[] ints = new Integer[integerSet.size()];
        integerSet.toArray(ints);
        for (int i = integerSet.size() - 1 ; i >= 0  ; --i){
            int index = (int)(Math.random() * i);
            text += ints[index] + " ";
            for (int j = index ; j < integerSet.size() - 1 ; ++j){
                ints[j] = ints[j+1];
            }
        }
        jtread.setText(text);
    }

    public void Reverse(){
        String text = "";
        List<Integer> integerList = new LinkedList<>();
        Matcher m = Pattern.compile("\\b([0-9.]+)\\b").matcher(jtread.getText());
        while (m.find()){
            integerList.add(Integer.parseInt(m.group(1)));
        }
        for (Integer i : integerList){
            text = i + " " + text;
        }
        jtread.setText(text);
    }
}