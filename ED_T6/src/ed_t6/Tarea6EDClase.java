/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_t6;

/**
 *
 * @author EMILIO-PC
 */

public class Tarea6EDClase {
    
    private static final double DESCUENTO_095 = 0.95;
    private static final double DESCUENTO_08 = 0.8;
    

    public void aplicarDescuento(double precioProducto, int numProductos){     
        double precioTotal;
            if(numProductos>3)
                precioProducto-=5;
            if (numProductos!=0){
                precioTotal = precioProducto*DESCUENTO_08;
                imprimirDescuento(precioTotal);
        }   else {
                precioTotal = precioProducto*DESCUENTO_095;
                imprimirDescuento(precioTotal);
        }   
    }


    private void imprimirDescuento(double precioTotal) {
        System.out.println("El total a pagar es:"+precioTotal);
        System.out.println("Enviado");
    }


    
}
