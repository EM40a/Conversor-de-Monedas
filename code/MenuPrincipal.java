import javax.swing.JOptionPane; // Importar la clase JOptionPane

public class MenuPrincipal {
    public static void main(String[] args) {
        // Crear un arreglo con las opciones del menú
        String[] opciones = { "Conversor de moneda", "Proximamente...", "Salir" };

        // Mostrar el menú y guardar la opción seleccionada
        Object opcionSeleccionada = JOptionPane.showInputDialog(null,
                "Seleccione una opción:", "Menú Principal", // mensaje - titulo
                JOptionPane.PLAIN_MESSAGE, null,
                opciones, opciones[0]);

        String opcion = opcionSeleccionada.toString();

        if (opcion.equals("Conversor de moneda")) {
            // Lógica para el conversor de moneda
            JOptionPane.showMessageDialog(null, "Has seleccionado el conversor de moneda.");
        }

        else if (opcion.equals("Salir")) {
            // Salir del programa
            JOptionPane.showMessageDialog(null, "Fin del Programa.");
            System.exit(0);
        }

        System.exit(0);
    }
}
