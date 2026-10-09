import javax.swing.JOptionPane;

public class TratamentoSKU {

    public static void main(String[] args) {
        String skuEntrada = JOptionPane.showInputDialog("Digite o SKU do produto:");

        if (skuEntrada == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
            return;
        }

        String skuTratado = skuEntrada.trim();
        skuTratado = skuTratado.toUpperCase();

        if (skuTratado.startsWith("PRD-")) {
            int indiceHifen = skuTratado.indexOf("-");
            String codigoNumerico = skuTratado.substring(indiceHifen + 1);
            JOptionPane.showMessageDialog(null,
                    "SKU Formatado: "
                    + skuTratado
                    + "\nStatus: SKU Válido!"
                    + "\nCódigo Numérico Extraído: "
                    + codigoNumerico);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Erro: O SKU é inválido!\nDeve iniciar obrigatoriamente com o prefixo 'PRD-'.",
                    "SKU Inválido",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
