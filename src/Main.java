import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String primer_numero= JOptionPane.showInputDialog("Introduzca el primer entero");
        String segundo_numero=JOptionPane.showInputDialog("Introduzca el segundo entero");

        int numero1= Integer.parseInt(primer_numero);
        int numero2= Integer.parseInt(segundo_numero);
        int resultados= numero1+numero2;
        int resultador= numero1-numero2;
        double resultadod= 5/2;
        int resultadom= numero1*numero2;


        JOptionPane.showMessageDialog(null,"El resultado de la primer entero es: "+resultados,"SUMA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la primer entero es: "+resultador,"RESTA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la primer entero es: "+resultadod,"DIVISION",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la primer entero es: "+resultadom,"MULTIPLICACIÓN",JOptionPane.INFORMATION_MESSAGE);

        System.out.println("El resultado de la primer entero es: "+resultadod);
    }




}