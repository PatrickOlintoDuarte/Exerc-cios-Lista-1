import javax.swing.JOptionPane;
public class Soma {
    public static void main(String[] x) {
        //Declaração de variaveis
        double op1, op2, res;
        //entrada de dados
        op1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro operando"));
        op2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo operando"));
        //processamento
        res = op1 + op2;
        //saida
        //String s = op1 + "+" + op2 + "=" + res;
        //JOptionPane.showMessageDialog(null, s);
        String s = String.format(
            "Resultado: %.2f + %.2f =  %.2f.", 
            op1, op2, res
        );
        JOptionPane.showMessageDialog(null, s);



    }
}
