public class Envio1{
    public String codigoRastreio;
    public double pesoKg;
    public int tipoEntrega;
    public double valorFrete;

    public double calcularvalorFrete(int tipoEntrega, double pesoKg){
        this.tipoEntrega = tipoEntrega;
        this.pesoKg = pesoKg;


        if(tipoEntrega == 1){
            return valorFrete = 10 + (5 * pesoKg);
        } else if (tipoEntrega == 2){
            return valorFrete = 25 + (9 * pesoKg);
        } else if (tipoEntrega == 3){
            return valorFrete = 60 + (20 * pesoKg);
        }else{
            return valorFrete = 15 + (4 * pesoKg);
        }
    }
}