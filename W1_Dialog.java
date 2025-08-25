import javax.swing.JOptionPane;

public class W1_Dialog {
    public static void main(String[] args) {
    String name;
    name=JOptionPane.showInputDialog("Enter your name:"); // show message box to enter the data
    JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    JOptionPane.showMessageDialog(null,"water level low","Warning",2);
    }
}


// This code creates a simple dialog box that prompts the user to enter their name

