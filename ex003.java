import javax.swing.JOptionPane;
    public class ex004 {
    public static void main(String[] x) {
        //Declaração de variaveis
        double QuantVendida, preco, comissao, venda;
    
        preco =  Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitario das peças: "));

        QuantVendida =  Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida: "));

        venda = QuantVendida * preco;
        comissao = venda * 0.05;
    
        String s = String.format(
            "A comissão do vendedor será de %.2f", 
            comissao
        );
        JOptionPane.showMessageDialog(null, s);

    }
}