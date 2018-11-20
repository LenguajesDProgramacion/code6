public class Lavadora extends Electrodomestico {
    private int capacidad;
    private int aguacantidad;


    public Lavadora(String marca, String modelo, String color, int peso, String garantia, int capacidad, int aguacantidad){
        super(marca, modelo, color, peso,garantia);
        this.capacidad = capacidad;
        this.aguacantidad = aguacantidad;
    }

    public String capacidadMaxima(int capacidad) {
        String detalle = "";
        if (capacidad <= this.capacidad) {
            detalle = "El peso esta dentro de la capacidad";
        } else
            detalle = "Lo sentimos no soporta esta capacidad" + capacidad;
        return detalle;
    }

    public String cantidadAgua(int agua){
        String detalle = "";
        if (agua <= this.aguacantidad){
            detalle = "La cantidad de agua es soportada";
        }
        else
            detalle = "Disminuya el agua";
        return detalle;
    }

}
