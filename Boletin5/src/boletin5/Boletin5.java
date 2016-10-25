
package boletin5;

import java.util.Scanner; //Clase Scanner
import javax.swing.JOptionPane; //Clase JOptionPane

public class Boletin5 {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in); //Implementamos una clase Scanner para introducir y sacar datos por consola
        //Ejercicio 1
        System.out.println("Introduce un numero: "); 
        int num1 = obj.nextInt(); //Declaramos un entero y le damos valor por consola
        if (num1 >= 0) System.out.println("Es positivo"); //Bucle para saber si es positivo o negativo
        else System.out.println("Es negativo");
        //Ejercicio 2
        System.out.println("Introduce un numero: ");
        short num2 = obj.nextShort(); //Declaramos un short y le damos valor por consola
         System.out.println("Introduce un numero: ");
        short num3 = obj.nextShort(); //Declaramos un short y le damos valor por consola
        if (num2 >= num3) System.out.println("La resta es: " + (num2 - num3)); //Bucle que nos devuelve la resta cuando num2>=num3
        System.out.println("La suma es: " + (num2 + num3)); //y la suma cuando num2<num3
        //Ejercicio 3
        System.out.println("Introduce un numero: ");
        int num4 = obj.nextInt(); //Declaramos un entero y le damos valor por consola
        if (num4 > 0) System.out.println("+"); //Bucle que nos devuelve el simbolo "+" si num4 es positivo
        else if (num4 < 0) System.out.println("-"); // "-" si num4 es negativo
        else System.out.println("0"); // 0 si num4 es 0
        //Ejercicio 4
        String nom1 = JOptionPane.showInputDialog("Nombre: "); //Declaramos un String y le damos valor 
        String nom2 = JOptionPane.showInputDialog("Nombre: "); //Declaramos un String y le damos valor 
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Peso: ")); //Declaramos un double y le damos valor
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Peso: ")); //Declaramos un double y le damos valor
        if (peso1 > peso2){ //Bucle que nos devuelve el mayor entre dos numeros
            double diferencia = peso1 - peso2;
            JOptionPane.showMessageDialog(null, "Pesa mas: " + nom1 + " con un peso de: " + peso1 + " y una diferencia de peso de: " + diferencia);
            
        }
        else {
            double diferencia = peso2 - peso1;
            JOptionPane.showMessageDialog(null, "Pesa mas: " + nom2 + " con un peso de: " + peso2 + " y una diferencia de peso de: " + diferencia);
   
        }
        //Ejercicio 5
        System.out.println("Introduce tres numeros: ");
        int num5 = obj.nextInt(); //Declaramos un entero y le damos valor
        int num6 = obj.nextInt(); //Declaramos un entero y le damos valor
        int num7 = obj.nextInt(); //Declaramos un entero y le damos valor
        int aux; //Declaramos un entero como auxiliar
        if (num5 > num6) aux = num5; //Bucle que calcula el mayor entre tres numeros
        else if (num6 > num7) aux = num6;
        else aux = num7;
        System.out.println("El maximo es: " + aux); 
        //Ejercicio 6
        System.out.println("Escribe las ventas anuales");
        long opcion = Long.parseLong(obj.nextLine()); //Declaramos un long y le damos valor
        String stringArticulo = ""; //Declaramos un String y le asignamos una cadena vacia
        if (opcion <= 100) stringArticulo = "Bajo"; //Bucle que asigna un valor a stringArticulo dependiendo del valor opcion
        else if (opcion > 100 && opcion <= 500) stringArticulo = "Medio";
        else if (opcion > 500 && opcion <= 1000) stringArticulo = "Alto";
        else if (opcion > 1000) stringArticulo = "Primera necesidad";
        System.out.println("El articulo es de consumo: " + stringArticulo); //Visualizamos por pantalla el valor de stringArticulo
        //Ejercicio 7
        System.out.println("MENU:\n1. Area Cuadrado\n2. Area Rectangulo\n3. Area Circulo"); 
       int opt = Integer.parseInt(obj.nextLine()); //Declaramos un entero y le damos valor
        switch (opt){ //Creamos un switch como menu
            case 1: double l = Double.parseDouble(obj.nextLine()), area; //Primera opcion: area de un cuadrado
            area = l * l; //Calculamos el area
            System.out.println("El area es: " + area); //Mostramos el area
            break;
            case 2: System.out.println("Introduce la base: ");  //Segunda opcion: area de un rectangulo
            double b = Double.parseDouble(obj.nextLine()); //Declaramos la base y le damos valor
            System.out.println("Introduce la altura: ");
            double h = Double.parseDouble(obj.nextLine()); //Declaramos la altura y le damos valor
            area = (b * h) / 2; //Calculamos el area
            System.out.println("El area es: " + area); //Mostramos el area 
            break;
            case 3: System.out.println("Introduce el radio: "); //Tercera opcion: area del circulo
            double r = Double.parseDouble(obj.nextLine()); //Declaramos el radio
            final double PI = 3.14; //Declaramos la constante PI
            area = PI * Math.pow(r, 2); //Calculamos el area
            System.out.println("El area es: " + area); //Mostramos el area
            break;
            default: System.out.println("Introduce un numero valido"); //Sino se introduce un valor valido (1, 2 o 3) se muestra un error
            break;
        }
        
        
        
    
    }
}
