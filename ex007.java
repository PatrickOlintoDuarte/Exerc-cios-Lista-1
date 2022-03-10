import javax.swing.JOptionPane;
public class ex007 {
    public static void main(String[] x) {
        Integer ano, mes, dias, D;
        
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano):"));

        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes):"));

        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite os dias):"));
  
        D = (ano*365) + (mes*30);
    
        String s = String.format(
            "Idade expressa em dias: %d dias", 
            D
        );
        JOptionPane.showMessageDialog(null, s);

    }
}