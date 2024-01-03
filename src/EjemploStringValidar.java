public class EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo){
            curso = "";  //"Programación Java";
        }

        boolean esvacio = curso.length() == 0;

        System.out.println("esvacio = " + esvacio);

        boolean esvacio2 = curso.isEmpty();
        System.out.println("esvacio2 = " + esvacio2);

        if (esvacio2){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

    }
}
