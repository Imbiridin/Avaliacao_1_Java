public class LivroAcervo {
    private int tombo;
    private String titulo;
    private int totalExemplares;
    private int exemplaresEmprestados;

    public LivroAcervo() {
        this.tombo = 101;
        this.titulo = "Estrutura de Dados em Java";
        this.totalExemplares = 5;
        this.exemplaresEmprestados = 0;
    }

    public LivroAcervo(int tombo, String titulo, int totalExemplares) {
        this.tombo = tombo;
        this.titulo = titulo;
        this.totalExemplares = totalExemplares;
        this.exemplaresEmprestados = 0;
    }

    public boolean realizarEmprestimo() {
        if (totalExemplares > exemplaresEmprestados) {
            exemplaresEmprestados++;
            return true;
        }
        return false;
    }

    public boolean realizarDevolucao() {
        if (exemplaresEmprestados > 0) {
            exemplaresEmprestados--;
            return true;
        }
        return false;
    }

    public int getExemplaresDisponiveis() {
        return totalExemplares - exemplaresEmprestados;
    }

    public int getTombo() {
        return tombo;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalExemplares() {
        return totalExemplares;
    }

    public void setTotalExemplares(int totalExemplares) {
        this.totalExemplares = totalExemplares;
    }

    public int getExemplaresEmprestados() {
        return exemplaresEmprestados;
    }
}