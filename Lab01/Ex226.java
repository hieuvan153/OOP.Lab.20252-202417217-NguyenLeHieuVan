import javax.swing.JOptionPane;

public class Ex226 {
    public static void main(String[] args) {
        double type = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the type of equation: \nThe first-degree equation with one variable: 1\nThe system of first-degree equations with two variables: 2\nThe second-degree equation with one variable: 3"));

        if (type == 1) {
            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input a", JOptionPane.INFORMATION_MESSAGE));
            double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input b", JOptionPane.INFORMATION_MESSAGE));

            if (a == 0) {
                if (b == 0) {
                    JOptionPane.showMessageDialog(null, "The equation has infinite solutions.");
                } else {
                    JOptionPane.showMessageDialog(null, "The equation has no solution.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "The equation has one solution: " + (-b / a));
            }
        } else if (type == 2) {
            double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input a11", JOptionPane.INFORMATION_MESSAGE));
            double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input a12", JOptionPane.INFORMATION_MESSAGE));
            double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the third number: ", "Input b1", JOptionPane.INFORMATION_MESSAGE));
            
            double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the fourth number: ", "Input a21", JOptionPane.INFORMATION_MESSAGE));
            double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the fifth number: ", "Input a22", JOptionPane.INFORMATION_MESSAGE));
            double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the sixth number: ", "Input b2", JOptionPane.INFORMATION_MESSAGE));

            double d = a11 * a22 - a21 * a12;
            double d1 = b1 * a22 - b2 * a12;
            double d2 = a11 * b2 - a21 * b1;

            if (d == 0 && d1 == 0 && d2 == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinite solutions.");
            } else if (d == 0) {
                JOptionPane.showMessageDialog(null, "The equation has no solution.");
            } else {
                double x1 = d1 / d;
                double x2 = d2 / d;
                JOptionPane.showMessageDialog(null, "The equation has one solution: \n" + "x1 = " + x1 + "\nx2 = " + x2);
            }
        } else if (type == 3) {
            double a = 0;
            while (a == 0) {
                a = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input a", JOptionPane.INFORMATION_MESSAGE));
                if (a == 0) {
                    JOptionPane.showMessageDialog(null, "a must be different from 0.");
                }
            }
            double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input b", JOptionPane.INFORMATION_MESSAGE));
            double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the third number: ", "Input c", JOptionPane.INFORMATION_MESSAGE));
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has two real roots: \n" + "x1 = " + x1 + "\nx2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has one real root: \n" + "x = " + x);
            } else {    
                JOptionPane.showMessageDialog(null, "The equation has no solution.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        }

        System.exit(0);
    }
}