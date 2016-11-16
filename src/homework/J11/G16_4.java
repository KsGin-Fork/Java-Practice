package homework.J11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by YangFan on 2016/11/16.
 */
public class G16_4 extends JFrame{
    public static void main(String[] args){
        Calculator calculator = new Calculator();
    }

}

class Calculator extends JFrame{

    double result = 0;

    public Calculator(){
            View();
    }

    public void View(){

        this.setLayout(new GridLayout(2,1));
        this.setSize(450,200);
        JPanel jPanel1 = new JPanel(new FlowLayout());
        jPanel1.add(new JLabel("Number1:"));
        JTextField jf1 = new JTextField(7);
        jPanel1.add(jf1);
        jPanel1.add(new JLabel("Number2:"));
        JTextField jf2 = new JTextField(7);
        jPanel1.add(jf2);
        jPanel1.add(new JLabel("Result:"));
        JTextField jf3 = new JTextField(7);
        jf3.setEditable(false);
        jPanel1.add(jf3);

        JPanel jPanel2 = new JPanel(new FlowLayout());
        JButton AddJbt = new JButton("Add");
        JButton SubJbt = new JButton("Subtract");
        JButton MulJbt = new JButton("Multiply");
        JButton DivJbt = new JButton("Divide");
        jPanel2.add(AddJbt);
        jPanel2.add(SubJbt);
        jPanel2.add(MulJbt);
        jPanel2.add(DivJbt);

        this.add(jPanel1);
        this.add(jPanel2);
        this.setVisible(true);


        ActionListener OnClick = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(jf1.getText());
                double n2 = Double.parseDouble(jf2.getText());
                switch (e.getActionCommand()){
                    case "Add": result = n1 + n2; break;
                    case "Subtract": result = n1 - n2; break;
                    case "Multiply": result = n1 * n2; break;
                    case "Divide": if (n2 == 0) { jf3.setText("除数不能为0"); break;}
                        result = n1 / n2; break;
                    default:break;
                }
                if (jf3.getText() != "") jf3.setText(result + "");
            }
        };

        AddJbt.addActionListener(OnClick);
        SubJbt.addActionListener(OnClick);
        MulJbt.addActionListener(OnClick);
        DivJbt.addActionListener(OnClick);
    }
}
