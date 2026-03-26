import javax.swing.JOptionPane;

public class Ex225 {
    public static void main(String[] Args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, "The sum of two numbers is: " + (num1 + num2));
        JOptionPane.showMessageDialog(null, "The difference of two numbers is: " + (num1 - num2));
        JOptionPane.showMessageDialog(null, "The product of two numbers is: " + (num1 * num2));
        if (num2 == 0.0) {
            JOptionPane.showMessageDialog(null, "Divisor must be different from 0!", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The quotient of two numbers is: " + (num1 / num2));
        }
        System.exit(0);
    }
}
