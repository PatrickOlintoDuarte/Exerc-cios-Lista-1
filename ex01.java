import javax.swing.JOptionPane;
public class ex01 {
        public static void main(String[] args) {
            double dolar, n1, real;

            dolar = 5.10;
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dolares que serão convertidos"));
            real = dolar * n1;

            String s = String.format(
            "%.2f dolares são equivalentes a %.2f reais", 
            n1, real
        );
        JOptionPane.showMessageDialog(null, s);
        }
}
