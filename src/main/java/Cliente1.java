public abstract class Cliente1 {
    private  String nombre;
    private int claveCliente;

    public Cliente1(String nombre, int claveCliente){
        this.nombre = nombre;
        this.claveCliente = claveCliente;
    }

    public abstract double totalPagar();

}
