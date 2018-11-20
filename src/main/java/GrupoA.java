public class GrupoA extends Cliente{
    private int antiguedad;
    public GrupoA(String key, String nombre, int antiguedad){
        super(key, nombre);
        this.antiguedad = antiguedad;
    }


    public double Descuento(double compra){
        if (this.antiguedad >= 5){
            double desc = compra * 0.95;
            System.out.println("Pertenece al GrupoA");
        }
        else if (this.antiguedad >= 3){
            double desc = compra * 0.5;
            System.out.println("Pertenece al GrupoB");
        }
        else if (this.antiguedad >= 1){
            double desc = compra * 0.2;
            System.out.println("Pertenece al GrupoB");
        }
        return compra;
    }

}
