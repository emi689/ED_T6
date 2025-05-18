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
    

    public void aplicarDescuento(double precioProducto, int numProductos){     
        double precioTotal;
            if(numProductos>3)
                precioProducto-=5;
            if (numProductos!=0){
                precioTotal = precioProducto*0.8;
                System.out.println("El total a pagar es:"+precioTotal);
                System.out.println("Enviado");
        }   else {
                precioTotal = precioProducto*0.95;
                System.out.println("El total a pagar es:"+precioTotal);
                System.out.println("Enviado");
        }   
    }


    
}
