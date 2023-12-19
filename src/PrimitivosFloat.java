public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a  = " + Float.BYTES);
        System.out.println("Float corresponde en bites a  = " + Float.SIZE);
        System.out.println("Maximo valor para Float = " + Float.MAX_VALUE);
        System.out.println("Minimo valor para Float = " + Float.MIN_VALUE);


        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a  = " + Double.BYTES);
        System.out.println("Double corresponde en bites a  = " + Double.SIZE);
        System.out.println("Maximo valor para Double = " + Double.MAX_VALUE);
        System.out.println("Minimo valor para Double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
