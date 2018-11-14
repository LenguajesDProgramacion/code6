public class Contador {
    private int numero;

    //constructor
    public Contador(int numero){
        this.numero = numero;
    }
    //creamos metodo
    public int incrementar(int numIncrementar){
        return this.numero += numIncrementar;
    }
    public int decrementar(int numDecrementar){
        return this.numero -= numDecrementar;
    }
}
