
package simplesumingui;
import javax.swing.JOptionPane;

public class Main {

  
    public static void main(String[] args) {
       String Fn = JOptionPane.showInputDialog("Enter first integer:");
       String Ln = JOptionPane.showInputDialog("Enter Second integer:");
       int num1 = Integer.parseInt(Fn);
       int num2 = Integer.parseInt(Ln);
       int sum = num1 + num2;
       JOptionPane.showMessageDialog(null,"The answer of sum is "+ sum,"the title",JOptionPane.PLAIN_MESSAGE);
    }

}
