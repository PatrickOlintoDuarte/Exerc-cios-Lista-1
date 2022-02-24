import javax.swing.JOptionPane;
public class ex02 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, res;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor"));

        n1 = n1 * n1;
        n2 = n2 * n2;
        n3 = n3 * n3;
        n4 = n4 * n4;

        res = n1 + n2 + n3 + n4;

        String s = String.format(
            "Resultado: %.2f ", 
            res
        );
        JOptionPane.showMessageDialog(null, s);
    }
}