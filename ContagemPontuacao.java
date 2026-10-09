import javax.swing.JOptionPane;

public class ContagemPontuacao {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite o feedback do cliente:");

        if (texto == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
            return;
        }

        int totalPontuacoes = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == '.' || caractere == ',' || caractere == '!' || caractere == '?') {
                totalPontuacoes++;
            }
        }

        JOptionPane.showMessageDialog(null, 
            "Texto analisado: " + texto + 
            "\nTotal de pontuações (., ,, !, ?): " + totalPontuacoes);
    }
}

