import javax.swing.JOptionPane;
public class ex005 {
    public static void main(String[] x) {
        //Declaração de variaveis
        Integer altura, base, area;
        //entrada de dados
        
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura:"));
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
        
        area = altura * base;
    
        String s = String.format(
            "A area do retângulo é %d", 
            area
        );
        JOptionPane.showMessageDialog(null, s);

    }
}