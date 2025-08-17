import javax.swing.JOptionPane;

public class GuiCalculator {
    public static void main(String[] args) {
        JOptionPane pane = new JOptionPane();

        String input1 = pane.showInputDialog("Enter first number: ");
        String input2 = pane.showInputDialog("Enter second number: ");
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);

        double sum  = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double modulo = num1 % num2;

        String sumR = "SUM: " + num1 + " + " + num2 + " = " + sum + "\n";
        String diffR = "DIFFERENCE: " + num1 + " - " + num2 + " = " + diff + "\n";
        String productR = "PRODUCT: " + num1 + " * " + num2 + " = " + product + "\n";
        String quotientR = "QUOTIENT: " + num1 + " / " + num2 + " = " + quotient + "\n";
        String moduloR = "MODULO: " + num1 + " % " + num2 + " = " + modulo + "\n";
        String result = sumR + diffR + productR + quotientR + moduloR;

        pane.showMessageDialog(null, result, "Calculator Result", JOptionPane.INFORMATION_MESSAGE);
    }
}