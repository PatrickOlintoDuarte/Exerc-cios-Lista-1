import javax.swing.JOptionPane;
public class ex009 {
    public static void main(String[] x) {
        Integer reajuste;
        double salario, desconto, salarioatual;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario mensal: "));

        reajuste = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de reajuste: "));

        desconto = reajuste*salario/100;
        salarioatual = salario-desconto;
    
        String s = String.format(
            "Novo Salario: %.2f, com %d de reajuste", 
            salarioatual, reajuste
        );
        JOptionPane.showMessageDialog(null, s);

    }
}