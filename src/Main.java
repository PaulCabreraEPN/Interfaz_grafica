import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String primer_numero= JOptionPane.showInputDialog("Introduzca el primer entero");
        String segundo_numero=JOptionPane.showInputDialog("Introduzca el segundo entero");

        int numero1= Integer.parseInt(primer_numero);
        int numero2= Integer.parseInt(segundo_numero);
        int resultados= numero1+numero2;

        JOptionPane.showMessageDialog(null,"El resultado de la primer entero es: "+resultados,"Resultado",JOptionPane.INFORMATION_MESSAGE);

    }




}