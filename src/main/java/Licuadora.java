public class Licuadora extends Electrodomestico {
    private String tamaño;

    public Licuadora(String marca, String modelo, String color, int peso, String garantia, String tamaño){
        super(marca, modelo, color, peso, garantia);
        this.tamaño = tamaño;
    }
}
