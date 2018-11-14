public class Lavadora extends Electrodomestico {
    private int capacidad;

    public Lavadora(String marca, String modelo, String color, int peso, String garantia, int capacidad){
        super(marca, modelo, color, peso,garantia);
        this.capacidad = capacidad;
    }

    public String capacidadMaxima(int capacidad) {
        String detalle = "";
        if (this.capacidad >= capacidad) {
            detalle = "El peso esta dentro de la capacidad";
        } else
            detalle = "Lo sentimos no soporta esta capacidad " + capacidad;
        return detalle;
    }

}
