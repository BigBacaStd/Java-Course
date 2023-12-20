import javax.swing.*;

public class SIstemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero:");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr); Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error - Ingrese un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero Binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "numero Octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        int numeroOctal = 0764;
        System.out.println("numero Octal = " + numeroOctal);

        String mensajeHexa = "numero Hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexa);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexa;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
