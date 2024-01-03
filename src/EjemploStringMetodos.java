public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Polo";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Polo\") = " + nombre.equals("Polo"));
        System.out.println("nombre.equals(\"polo\") = " + nombre.equals("polo"));
        System.out.println("nombre.equalsIgnoreCase(\"polo\") = " + nombre.equalsIgnoreCase("polo"));
        System.out.println("nombre.compareTo(\"Polo\") = " + nombre.compareTo("Polo"));
        System.out.println("nombre.compareTo(\"Emilio\") = " + nombre.compareTo("Emilio"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(2, 4) = " + nombre.substring(2, 4));
    }
}
