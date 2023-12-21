
import java.util.InputMismatchException;
import java.util.Scanner;

public class SIstemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");

        //String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) {
            System.out.println("Error - Ingrese un numero entero!");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero Binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String mensajeOctal = "numero Octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensajeHexa = "numero Hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexa;

        System.out.println(mensaje);
    }
}
