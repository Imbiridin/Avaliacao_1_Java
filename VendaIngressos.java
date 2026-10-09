import javax.swing.JOptionPane;

public class VendaIngressos {

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String idade_T = JOptionPane.showInputDialog(null, 
                "VENDA DE INGRESSO\n\nInforme a idade do espectador:", 
                "Cinema - Idade", 
                JOptionPane.QUESTION_MESSAGE);

            if (idade_T == null) break;
            int idade = Integer.parseInt(idade_T);

            String tipo_T = JOptionPane.showInputDialog(null, 
                "Informe o tipo de ingresso:\n[1] Inteira\n[2] Meia-entrada", 
                "Cinema - Tipo", 
                JOptionPane.QUESTION_MESSAGE);

            if (tipo_T == null) break;
            int tipoIngresso = Integer.parseInt(tipo_T);

            String valor_T = JOptionPane.showInputDialog(null, 
                "Informe o valor base do ingresso (R$):", 
                "Cinema - Valor Base", 
                JOptionPane.QUESTION_MESSAGE);

            if (valor_T == null) break;
            double valorBase = Double.parseDouble(valor_T);

            double valorFinal;
            String descricaoTipo;

            if (tipoIngresso == 2) {
                valorFinal = valorBase * 0.50; 
                descricaoTipo = "Meia-entrada";
            } else {
                valorFinal = valorBase;
                descricaoTipo = "Inteira";
            }

            String resumo = String.format(
                "--- RESUMO DA COMPRA ---\n\n" +
                "• Idade do Espectador: %d anos\n" +
                "• Tipo de Ingresso: %s\n" +
                "• Valor Líquido a Pagar: R$ %.2f", 
                idade, descricaoTipo, valorFinal
            );

            JOptionPane.showMessageDialog(null, resumo, "Resumo da Venda", JOptionPane.INFORMATION_MESSAGE);

            boolean respostaValida = false;

            while (!respostaValida) {
                String resposta = JOptionPane.showInputDialog(null, 
                    "Deseja registrar outra venda (S/N)?", 
                    "Continuar?", 
                    JOptionPane.QUESTION_MESSAGE);

                if (resposta == null) {
                    continuar = false;
                    respostaValida = true;
                } else if (resposta.equalsIgnoreCase("S")) {
                    respostaValida = true;
                } else if (resposta.equalsIgnoreCase("N")) {
                    respostaValida = true;
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Sessão encerrada. Bom filme!");
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Opção inválida! Digite 'S' para Sim ou 'N' para Não.", 
                        "Erro de Opção", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
} 

