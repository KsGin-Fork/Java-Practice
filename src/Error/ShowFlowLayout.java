package Error;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ShowFlowLayout{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String t = cin.next();
        String[] x = Pattern.compile("[[+]-[*]/]").split(t);
        Matcher m = Pattern.compile("[[+]-[*]/]").matcher(t);
        String result = "";
        if (m.find()) {
            switch (m.group(0)) {
                case "+":result = new BigDecimal(x[0]).add(new BigDecimal(x[1])).toString();break;
                case "-":result = new BigDecimal(x[0]).subtract(new BigDecimal(x[1])).toString();break;
                case "*":result = new BigDecimal(x[0]).multiply(new BigDecimal(x[1])).toString();break;
                case "/":result = new BigDecimal(x[0]).divide(new BigDecimal(x[1]),100,RoundingMode.HALF_EVEN).toString();break;
            }
        }
        System.out.println(result);
    }

}
