
package test;

import ejercicioivaprecio.CalcularIva;
import java.util.Scanner;


public class main  {
    public static void main(String[] args) {
 
       double precio;
       double porcentaje;
       double total;
       double iva;
       Scanner leer = new Scanner(System.in);
       CalcularIva calculador = new CalcularIva();
 
       System.out.println("Ingrese un precio:");
       precio = leer.nextDouble();
 
       System.out.println("Ingrese un porcentaje de iva:");
       porcentaje = leer.nextDouble();
       iva = calculador.obtenerIva(precio, porcentaje);
       total = precio + iva;
 
       System.err.println("Precio: " + precio);
       System.err.println("IVA: " + iva);
       System.err.println("Total: " + total);
 
 
    }
 
}

