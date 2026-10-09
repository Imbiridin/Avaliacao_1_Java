import javax.swing.JOptionPane;

public class TesteEnvio2 {

    public static void main(String[] args) {
        Envio2 ev = new Envio2();

        boolean continuar = true;
        while (continuar) {

            JOptionPane.showMessageDialog(null, "\n" + "-".repeat(50) + "\n SELECIONE O TIPO DE FRETE \n" + "-".repeat(50));
            String opcao_T = JOptionPane.showInputDialog("[1] ECONÔMICA | [2] EXPRESSA | [3] INTERNACIONAL | [4] OUTROS TIPOS | [0] SAIR");
            int opcao = Integer.parseInt(opcao_T);

            switch (opcao) {
                case 1:{
                    String codigo_T = JOptionPane.showInputDialog("Informe o codigo de rastreio: ");
                    ev.setCodigorastreio(codigo_T);

                    String pesoKg_T = JOptionPane.showInputDialog("Informe o peso(kg) do produto: ");
                    double pesoKg = Double.parseDouble(pesoKg_T);
                    ev.setPesoKg(pesoKg);

                    JOptionPane.showMessageDialog(null, "O valor do frete é de R$" + ev.calcularvalorFrete(1));
                    break;
                }
                case 2:{
                    String codigo_T = JOptionPane.showInputDialog("Informe o codigo de rastreio: ");
                    ev.setCodigorastreio(codigo_T);

                    String pesoKg_T = JOptionPane.showInputDialog("Informe o peso(kg) do produto: ");
                    double pesoKg = Double.parseDouble(pesoKg_T);
                    ev.setPesoKg(pesoKg);

                    JOptionPane.showMessageDialog(null, "O valor do frete é de R$" + ev.calcularvalorFrete(2));
                    break;
                }
                case 3:{
                    String codigo_T = JOptionPane.showInputDialog("Informe o codigo de rastreio: ");
                    ev.setCodigorastreio(codigo_T);

                    String pesoKg_T = JOptionPane.showInputDialog("Informe o peso(kg) do produto: ");
                    double pesoKg = Double.parseDouble(pesoKg_T);
                    ev.setPesoKg(pesoKg);

                    JOptionPane.showMessageDialog(null, "O valor do frete é de R$" + ev.calcularvalorFrete(3));
                    break;
                }
                case 4:{
                    String codigo_T = JOptionPane.showInputDialog("Informe o codigo de rastreio: ");
                    ev.setCodigorastreio(codigo_T);

                    String pesoKg_T = JOptionPane.showInputDialog("Informe o peso(kg) do produto: ");
                    double pesoKg = Double.parseDouble(pesoKg_T);
                    ev.setPesoKg(pesoKg);

                    JOptionPane.showMessageDialog(null, "O valor do frete é de R$" + ev.calcularvalorFrete(4));
                    break;
                }
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado pela preferência!");
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Informe um valor válido!");
            }

        }
    }
}
