import javax.swing.JOptionPane;

public class W1_InputNumber {
    public static void main(String[] args) {
        String input;
        int num;
        input = JOptionPane.showInputDialog("Give a Number between 1 to 10");
        num = Integer.parseInt(input); // convert String to int
        JOptionPane.showMessageDialog(null,"The Square of " + num + " is: " + num * num);
        double num2;
        input = JOptionPane.showInputDialog("How much is the ticket price?");
        num2 = Double.parseDouble(input); // convert String to double
        JOptionPane.showMessageDialog(null,"The ticket price after 6% tax is RM" + num2*1.06);
    }
}
