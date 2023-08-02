import javax.swing.JOptionPane;

public class ConversorMoneda {
    public void ConvertirPesosADolares(double valor) {
        double dolar = valor/  3907.77;
        dolar = (double) Math.round(dolar *100d)/100;
        JOptionPane.showMessageDialog(null, "El valor es de " + dolar + " Dolares");
    }
    
    public void ConvertirPesosAEuros(double valor) {
        double euro = valor/  4299.52;
        euro = (double) Math.round(euro *100d)/100;
        JOptionPane.showMessageDialog(null, "El valor es de " + euro + " Euros");
    }

    public void ConvertirPesosALibras(double valor) {
        double libras = valor/  5015.49;
        libras = (double) Math.round(libras *100d)/100;
        JOptionPane.showMessageDialog(null, "El valor es de " + libras + " Libras");
    }

    public void ConvertirPesosAYen(double valor) {
        double yen = valor/  27.44;
        yen = (double) Math.round(yen *100d)/100;
        JOptionPane.showMessageDialog(null, "El valor es de " + yen + " Yen Japones");
    }

    public void ConvertirPesosAWon(double valor) {
        double won = valor/  3.06;
        won = (double) Math.round(won *100d)/100;
        JOptionPane.showMessageDialog(null, "El valor es de " + won + " Won sul-coreano");
    }
}
