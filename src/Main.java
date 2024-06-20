import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String primer_numero= JOptionPane.showInputDialog("Introduzca el primer entero");
        String segundo_numero=JOptionPane.showInputDialog("Introduzca el segundo entero");

        double numero1= Double.parseDouble(primer_numero);
        double numero2= Double.parseDouble(segundo_numero);
        double resultados= numero1+numero2;
        double resultador= numero1-numero2;
        double resultadod= numero1/numero2;;
        double resultadom= numero1*numero2;


        JOptionPane.showMessageDialog(null,"El resultado de la primer entero es: "+resultados,"SUMA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la primer entero es: "+resultador,"RESTA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la primer entero es: "+resultadod,"DIVISION",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la primer entero es: "+resultadom,"MULTIPLICACIÓN",JOptionPane.INFORMATION_MESSAGE);

        System.out.println("El resultado de la primer entero es: "+resultadod);
    }




}