public class NumeroFlotanteRaulOlguin {
    public static void main(String[] args) {
        float numero = 123.456f;

        // Obtener la parte entera y decimal
        int parteEntera = (int) numero;
        float parteDecimal = numero - parteEntera;

        // Mostrar los resultados
        System.out.println("Número original: " + numero);
        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
    }
}
