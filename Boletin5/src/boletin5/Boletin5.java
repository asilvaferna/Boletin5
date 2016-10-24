
package boletin5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Boletin5 {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        //Ejercicio 1
        System.out.println("Introduce un numero: ");
        int num1 = obj.nextInt();
        if (num1 >= 0) System.out.println("Es positivo");
        else System.out.println("Es negativo");
        //Ejercicio 2
        System.out.println("Introduce un numero: ");
        short num2 = obj.nextShort();
         System.out.println("Introduce un numero: ");
        short num3 = obj.nextShort();
        if (num2 >= num3) System.out.println("La resta es: " + (num2 - num3));
        System.out.println("La suma es: " + (num2 + num3));
        //Ejercicio 3
        System.out.println("Introduce un numero: ");
        int num4 = obj.nextInt();
        if (num4 > 0) System.out.println("+");
        else if (num4 < 0) System.out.println("-");
        else System.out.println("0");
        //Ejercicio 4
        String nom1 = JOptionPane.showInputDialog("Nombre: ");
        String nom2 = JOptionPane.showInputDialog("Nombre: ");
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        
        //String nom3 = obj.nextLine();
        if (peso1 > peso2){
            double diferencia = peso1 - peso2;
            JOptionPane.showMessageDialog(null, "Pesa mas: " + nom1 + " con un peso de: " + peso1 + " y una diferencia de peso de: " + diferencia);
            
        }
        else {
            double diferencia = peso2 - peso1;
            JOptionPane.showMessageDialog(null, "Pesa mas: " + nom2 + " con un peso de: " + peso2 + " y una diferencia de peso de: " + diferencia);
   
        }
        //Ejercicio 5
        System.out.println("Introduce tres numeros: ");
        int num5 = obj.nextInt();
        int num6 = obj.nextInt();
        int num7 = obj.nextInt();
        int aux;
        if (num5 > num6) aux = num5;
        else if (num6 > num7) aux = num6;
        else aux = num7;
        System.out.println("El maximo es: " + aux); 
        //Ejercicio 6
        System.out.println("Escribe las ventas anuales");
        long opcion = Long.parseLong(obj.nextLine());
        String stringArticulo = "";
        if (opcion <= 100) stringArticulo = "Bajo";
        else if (opcion > 100 && opcion <= 500) stringArticulo = "Medio";
        else if (opcion > 500 && opcion <= 1000) stringArticulo = "Alto";
        else if (opcion > 1000) stringArticulo = "Primera necesidad";
        System.out.println("El articulo es de consumo: " + stringArticulo);
        //Ejercicio 7
        System.out.println("MENU:\n1. Area Cuadrado\n2. Area Rectangulo\n3. Area Circulo"); 
       int opt = Integer.parseInt(obj.nextLine());
        switch (opt){
            case 1: double l = Double.parseDouble(obj.nextLine()), area;
            area = l * l;
            System.out.println("El area es: " + area);
            break;
            case 2: System.out.println("Introduce la base: "); 
            double b = Double.parseDouble(obj.nextLine());
            System.out.println("Introduce la altura: ");
            double h = Double.parseDouble(obj.nextLine());
            area = (b * h) / 2;
            System.out.println("El area es: " + area);
            break;
            case 3: System.out.println("Introduce el radio: ");
            double r = Double.parseDouble(obj.nextLine());
            final double PI = 3.14;
            area = PI * Math.pow(r, 2);
            System.out.println("El area es: " + area);
            break;
            default: System.out.println("Introduce un numero valido");
            break;
        }
        
        
        
    
    }
}
