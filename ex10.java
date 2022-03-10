import javax.swing.JOptionPane;
public class ex10 {
    public static void main(String[] x) {
        Integer PercImposto, PercDistribuidor;
        double CustoFabrica, ValorDistribuidor, ValorImposto, CustoConsumidor;
        
        PercDistribuidor = 29;
        PercImposto = 47;

        CustoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fabrica: "));
  
        ValorDistribuidor = CustoFabrica * PercDistribuidor/100;
        ValorImposto = CustoFabrica * PercImposto/100;
        CustoConsumidor = CustoFabrica + ValorDistribuidor + ValorImposto;
    
        String s = String.format(
            "O custo do Consumidor é %.2f", 
            CustoConsumidor
        );
        JOptionPane.showMessageDialog(null, s);

    }
}