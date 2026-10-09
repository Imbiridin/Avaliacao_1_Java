import javax.swing.JOptionPane;

public class TesteFormatador {

    public static void main(String[] args) {
        String entradaArquivo = JOptionPane.showInputDialog(
            null, 
            "Digite o nome do arquivo (ex:  relatorio_vendas .PDF ):", 
            " relatorio_vendas .PDF "
        );

        if (entradaArquivo != null) {
            String arquivoFormatado = FormatadorUtils.padronizarExtensao(entradaArquivo);
            JOptionPane.showMessageDialog(null, 
                "Original: '" + entradaArquivo + "'" +
                "\nFormatado: '" + arquivoFormatado + "'");
        }

        String entradaCartao = JOptionPane.showInputDialog(
            null, 
            "Digite os 16 dígitos do cartão de crédito:", 
            "1234567812345678"
        );

        if (entradaCartao != null) {
            String cartaoMascarado = FormatadorUtils.mascararCartao(entradaCartao);
            JOptionPane.showMessageDialog(null, 
                "Original: " + entradaCartao +
                "\nMascarado: " + cartaoMascarado);
        }
    }
}

