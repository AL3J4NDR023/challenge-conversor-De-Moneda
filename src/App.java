import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Conversor monedas = new Conversor();

        while (true) {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de moneda", "Salir"},"seleccion")).toString();
            switch (opciones) {
                case "Conversor de moneda":
                    String entrada = JOptionPane.showInputDialog("Ingresar valor del dinero a convertir");
                    if (monedas.numero(entrada) == true) {
                        double dato = Double.parseDouble(entrada);
                        monedas.ConvesorDeMonedas(dato);
                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");

                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Opción afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "programa terminado");
                        } 
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    } 
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null, "saliendo del programa");
                    System.exit(0);
                    break;
             
            }
        }
    }
}
