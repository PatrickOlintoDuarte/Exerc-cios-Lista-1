import javax.swing.JOptionPane;
    public class ex004 {
    public static void main(String[] x) {
        //Declaração de variaveis
        Integer n, ant;
        
        n =  Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        
        ant = n - 1;
    
        String s = String.format(
            "O antecessor de %d é %d", 
            n, ant
        );
        JOptionPane.showMessageDialog(null, s);

    }
}
