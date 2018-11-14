import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Fecha {
    public static void main(String [] args){
        String fecha;
        Scanner leer = new Scanner(System.in);
        boolean res = true;
        System .out.println("Dame la fecha:");
        fecha = leer.next();
        res = validarFecha(fecha);
        if (res == true){
            System.out.println("La fecha es correcta");
        }
        else
            System.out.println("La fecha no es correcta");
    }

    public static boolean validarFecha(String fecha){
        try {
            SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy");
            formatofecha.setLenient(false);
            formatofecha.parse(fecha);
        }
        catch (ParseException e){
            return false;
        }
        return true;
    }
    /*No pude realizar la modificacion de fecha
    todo el codigo lo puse en un metodo main ya que es ejecutable apartidr de ahi es por eso que no hice un constructor
    ni los metodos get and set*/

}
