import javax.swing.JOptionPane;
public class ex11 {
    public static void main(String[] x) {
        Double salario , vendas , salarioFixo , comissao ;
        Integer carros;
        
        carros = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de carros vendidos: "));

        vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total de suas vendas: "));

        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario fixo: "));

        comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por carro vendido: "));
        

        salario = salarioFixo + (comissao * carros) + (vendas * 0.05);

        String resultado = String.format(       
            "O salário final do vendedor será: %.2f reais"
            salario
        );

        JOptionPane.showMessageDialog(null, resultado);  
    }
}