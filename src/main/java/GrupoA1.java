public class GrupoA1 extends Cliente1 {
    private double montoPagar;

    public GrupoA1(String nombre, int claveCliente, double montoPagar){
        super(nombre, claveCliente);
        this.montoPagar = montoPagar;
    }

    public double totalPagar(){
        //condicional ternaria
        return (montoPagar >= 10000 ? montoPagar*0.9 : montoPagar );
    }
}
