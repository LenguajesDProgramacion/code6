public class Electrodomestico {
    private String marca;
    private String modelo;
    private String color;
    private int peso;
    private String garantia;

    public Electrodomestico(String marca, String modelo, String color, int peso, String garantia){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.peso = peso;
        this.garantia = garantia;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public String getGarantia(){
        return garantia;
    }
    public void setGarantia(String garantia){
        this.garantia = garantia;
    }
}
