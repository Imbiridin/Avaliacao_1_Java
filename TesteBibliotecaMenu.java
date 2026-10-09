import javax.swing.JOptionPane;

public class TesteBibliotecaMenu {

    public static void main(String[] args) {
        LivroAcervo livro = new LivroAcervo();

        boolean continuar = true;

        while (continuar) {
            String opcao_T = JOptionPane.showInputDialog(null, 
                "-".repeat(30) + "\n MENU BIBLIOTECA \n" + "-".repeat(30) + 
                "\n[1] Consultar Livro\n[2] Registrar Empréstimo\n[3] Registrar Devolução\n[0] Sair");

            if (opcao_T == null) {
                break;
            }

            try {
                int opcao = Integer.parseInt(opcao_T);

                switch (opcao) {
                    case 1:
                        JOptionPane.showMessageDialog(null, 
                            "--- CONSULTA DE LIVRO ---"
                            + "\nTombo: " + livro.getTombo()
                            + "\nTítulo: " + livro.getTitulo()
                            + "\nTotal de Exemplares: " + livro.getTotalExemplares()
                            + "\nQuantidade Emprestada: " + livro.getExemplaresEmprestados()
                            + "\nDisponíveis na Estante: " + livro.getExemplaresDisponiveis());
                        break;

                    case 2:
                        if (livro.realizarEmprestimo()) {
                            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro: Não há exemplares disponíveis para empréstimo (esgotado).");
                        }
                        break;

                    case 3:
                        if (livro.realizarDevolucao()) {
                            JOptionPane.showMessageDialog(null, "Devolução registrada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro: Não há empréstimos ativos para este livro.");
                        }
                        break;

                    case 0:
                        JOptionPane.showMessageDialog(null, "Saindo do sistema. Até logo!");
                        continuar = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, informe apenas números válidos.");
            }
        }
    }
}