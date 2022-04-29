import javax.swing.JOptionPane;

public class first {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Hi! What's your name?");

        JOptionPane.showMessageDialog(null, "Hi " + name);

    }

}
