public class FormatadorUtils {

    public static String padronizarExtensao(String nomeArquivo) {
        if (nomeArquivo == null || nomeArquivo.isEmpty()) {
            return "";
        }

        String arquivoLimpo = nomeArquivo.trim();

        int indicePonto = arquivoLimpo.lastIndexOf(".");

        if (indicePonto != -1) {
            String nome = arquivoLimpo.substring(0, indicePonto);
            String extensao = arquivoLimpo.substring(indicePonto).toLowerCase();
            return nome + extensao;
        }

        return arquivoLimpo;
    }

    public static String mascararCartao(String numeroCartao) {
        if (numeroCartao == null) {
            return "";
        }

        String numerosApenas = numeroCartao.replaceAll("\\D", "");

        if (numerosApenas.length() >= 4) {
            String ultimosQuatro = numerosApenas.substring(numerosApenas.length() - 4);
            return "****-****-****-" + ultimosQuatro;
        }

        return "****-****-****-****";
    }
}

