/*
 * Click to change this license
 * Click  to edit this template
 */
package calculadora_número_enteros;

import java.util.Scanner;


        /**
 * Tarea Virtual # 1 de Programación Orientada a Objetos
 * @author Andrés Larrea Mancilla
 */
public class Calculadora_Número_Enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaración de variables
int opcion, num1=0, num2=0, resp=0, cont = 0; 
Scanner entrada = new Scanner(System.in);

do {
do {
System.out.println("****** MENÚ CALCULADORA ******"); 
System.out.println(" 1. Sumar dos números."); 
System.out.println(" 2. Restar dos números."); 
System.out.println(" 3. Multiplicar dos números."); 
System.out.println(" 4. Dividir dos números.");
System.out.println(" 5. Dado un número determinar si es número primo."); 
System.out.println(" 6. Salir.");
System.out.println("******************"); 
System.out.println("Introduzca opcion (1-6): "); 
opcion = entrada.nextInt();
} while (opcion < 1 || opcion > 5);

switch (opcion) { 
    case 1:
System.out.println("Introduzca el primer sumando: "); 
num1 = entrada.nextInt(); 
System.out.println("Introduzca el segundo sumando: "); 
num2 = entrada.nextInt();
resp = num1 + num2;
System.out.println(num1+ " + " +num2+ " = " +resp);

break;
case 2:
System.out.println("Introduzca el primer minuendo: "); 
num1 = entrada.nextInt();
System.out.println("Introduzca el segundo sustraendo: "); 
num2 = entrada.nextInt();
resp = num1 - num2;
System.out.println(num1+ " - " +num2+ " = " +resp); 
break;
case 3:
System.out.println("Introduzca el primer multiplicando: "); 
num1 = entrada.nextInt();
System.out.println("Introduzca el segundo multiplicador: "); 
num2 = entrada.nextInt();
resp = num1 * num2;
System.out.println(num1+ " * " +num2+ " = " +resp); 
break;
case 4:
System.out.println("Introduzca el primer dividendo: "); 
num1 = entrada.nextInt(); 
System.out.println("Introduzca el segundo divisor: "); 
num2 = entrada.nextInt();
if (num2 == 0) {
System.out.println("ERROR: No se puede dividir entre cero.");
} 
else {
resp = num1 / num2;
System.out.println(num1+ " / " +num2+ " = " +resp+ " (Resto = "+(num1%num2)+")");
}
break; 
case 5:
System.out.println("Introduzca un número: "); 
num1 = entrada.nextInt();
for (int i = 1; i <= num1; i++) { 
    if (num1 % i == 0) {
    cont++;
}
}
if (cont == 2) {
System.out.println("El número: " +num1+ " Es primo.");
} 
else {
System.out.println("El número: " +num1+ " NO es primo");
}
break; 
case 6:
System.exit(0);//Cierra la aplicación de java
}
} while (opcion!='6');
}

}
