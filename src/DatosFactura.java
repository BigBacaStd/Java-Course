import java.util.Scanner;

public class DatosFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero de factura:");
        String facturaStr = scanner.nextLine();

        System.out.println("Ingrese categoria del articulo:");
        String catStr = scanner.nextLine();

        System.out.println("Ingrese el precio del primer producto");
        double precioProd1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del segundo producto");
        double precioProd2 = scanner.nextDouble();

        double bruto = precioProd1 + precioProd2;

        double tax = bruto * 0.19;

        double pTotal = precioProd1 + precioProd2 + tax;

        System.out.println("La factura " + facturaStr + " bajo el concepto " + catStr + " tiene un costo total bruto de $"
        + bruto + "\ncon un impuesto de $" + tax + " y el monto total despues de impuestos es de $" + pTotal);




    }
}
