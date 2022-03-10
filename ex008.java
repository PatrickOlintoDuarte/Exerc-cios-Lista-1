import javax.swing.JOptionPane;
public class ex008 {
    public static void main(String[] x) {
        Integer total, brancos, nulos, validos, pbrancos, pnulos, pvalidos;
        
        total = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero total de eleitores do municipio: "));

        brancos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de votos em branco: "));

        nulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de votos nulos: "));

        validos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de votos validos: "));
  
        pbrancos = brancos/total*100;
        pnulos = nulos/total*100;
        pvalidos = validos/total*100;
    
        String s = String.format(
            "Percentual de votos Brancos: %d
             Percentual de votos Nulos: %d
             Percentual de votos Validos: %d", 
            pbrancos, pnulos, pvalidos
        );
        JOptionPane.showMessageDialog(null, s);

    }
}