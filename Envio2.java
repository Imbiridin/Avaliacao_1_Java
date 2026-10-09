public class Envio2 {
    private String codigoRastreio;
    private double pesoKg;
    private int tipoEntrega;
    private double valorFrete;

    public String codigoRastreio(){
        return codigoRastreio;
    }

    public double getPesoKg(){
        return pesoKg;
    }

    public int tipoEntrega(){
        return tipoEntrega;
    }

    public double valorFrete(){
        return valorFrete;
    }

    public void setCodigorastreio(String codigoString){
        this.codigoRastreio = codigoString;
    }

    public void setValorFrete(double valorFrete){
        this.valorFrete = valorFrete;
    }

    public void setTipoEntrega(int tipoEntrega){
        this.tipoEntrega = tipoEntrega;
    }

    public void setPesoKg(double pesokg){
        this.pesoKg = pesokg;
    }

    public double calcularvalorFrete(int tipoEntrega){
        

        if (tipoEntrega == 1) {
            return valorFrete = 10.00 + (5.00 * getPesoKg());
        } else if (tipoEntrega == 2) {
            return valorFrete = 25.00 + (9.00 * getPesoKg());
        } else if (tipoEntrega == 3){
            return valorFrete = 60.00 + (20.00 * getPesoKg());
        } else {
            return valorFrete = 15.00 + (4 * getPesoKg());
        }
    }
}
