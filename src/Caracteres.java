public class Caracteres {
    public static void main(String[] args) {
        var caracter = '6';
        System.out.println("caracter = " + caracter);
        var decimal = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        char simbolo = '0';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';

        System.out.println("char corresponde en \tbyte:"  + nuevaLinea + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("character Max value= " + Character.MAX_VALUE);
        System.out.println("character Min value= " + Character.MIN_VALUE);
    }
}
