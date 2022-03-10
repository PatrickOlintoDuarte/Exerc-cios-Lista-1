import javax.swing.JOptionPane;
public class ex006 {
    public static void main(String[] x) {
        Integer idade, anos;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade:"));
  
        anos = idade * 365;
    
        String s = String.format(
            "%d representam %d dias", 
            idade, anos
        );
        JOptionPane.showMessageDialog(null, s);

    }
}