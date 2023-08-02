import javax.swing.JOptionPane;

public class Conversor {
    ConversorMoneda monedas = new ConversorMoneda();
    ConversorPeso pesos = new ConversorPeso();

    public void ConvesorDeMonedas(double Dato) {
        String opciones = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir", 
                            "Monedas", JOptionPane.PLAIN_MESSAGE, null,
                             new Object[] {"Pesos a Dolar","Pesos a Euro","Pesos a Libras","Pesos a Yen","Pesos a Won","Dolar a Pesos","Euro a Pesos","Libras a Pesos","Yen a Pesos","Won a Pesos",},
                             "seleccion")).toString();

        switch (opciones) {
            case "Pesos a Dolar":
                monedas.ConvertirPesosADolares(Dato);
                break;
            case "Pesos a Euro":
                monedas.ConvertirPesosAEuros(Dato);
                break;
            case "Pesos a Libras":
                monedas.ConvertirPesosALibras(Dato);
                break;
            case "Pesos a Yen":
                monedas.ConvertirPesosAYen(Dato);
                break;
            case "Pesos a Won":
                monedas.ConvertirPesosAWon(Dato);
                break;
            case "Dolar a Pesos":
                pesos.ConvertirDolaresAPesos(Dato);
                break;
            case "Euro a Pesos":
                pesos.ConvertirEurosAPesos(Dato);
                break;
            case "Libras a Pesos":
                pesos.ConvertirLibrasAPesos(Dato);
                break;
            case "Yen a Pesos":
                pesos.ConvertirYenAPesos(Dato);
                break;
            case "Won a Pesos":
                pesos.ConvertirPesosAWon(Dato);
                break;
        }
    }

    public static boolean numero(String entrada) {
        try {
            double x = Double.parseDouble(entrada);
            return true;
        } catch (NumberFormatException e) {
            // TODO: handle exception
            return false;
        }
    }
}
