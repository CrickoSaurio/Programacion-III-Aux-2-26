/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesViernes409;

/**
 *
 * @author Cristhian
 */
public class Main {
    
    
    public static void main(String[] args) {
        Pila pila = new Pila();
        
        pila.adi(2);
        pila.adi(6);
        pila.adi(3);
        pila.adi(11);
        pila.adi(100);
        pila.adi(23);
        pila.adi(-4);
        pila.adi(10);
        pila.adi(22);
        pila.adi(56);
        // muestra solamente los elementos que sean multiplos de un X
        // numero
        
        pila.mostrar();
        
        System.out.println("\t\t\tmuestra solamente los elementos que sean multiplos de un X num");
        mostrarMultiplosNumX(3, pila);
        System.out.println("\n\n\n");
        pila.mostrar();
        
        // muestren los multiplos de 3 y 5, si el numero no es multiplo de ninguno entonces muestra un "ERROR";
    
        //voltearPila(pila);
        System.out.println("-------ANTES DE ORDEN");
        pila.mostrar();
        
        System.out.println("-------ORDEN POR X NUM");
        ordenPorNumero(10, pila);
        pila.mostrar();
        
        //eliminarMultiplos(num,pila);
        //pila.mostrar()
    }
    
    public static void mostrarMultiplosNumX(int x, Pila pila){
        Pila aux = new Pila();
        
        while(! pila.esVacia()){
            int elem = pila.eli();
            if(elem % x == 0){
                System.out.println("Multiplo de "+x+" : "+elem);
            }
            aux.adi(elem);
        }
         pila.vaciar(aux);
    }
    
    public static void mostrarMultiplosTresCinco(Pila pila){
        Pila aux = new Pila();
        while(! pila.esVacia()){
            int elem = pila.eli();
            if(elem%3 == 0 || elem%5 == 0){
                System.out.println("CUMPLE: "+elem);
            }else{
                System.out.println("ERROR!!");
            }
            aux.adi(elem);  
        }        
        pila.vaciar(aux);
    }
    
    public static void voltearPila(Pila original){
        Pila aux1 = new Pila();
        Pila aux2 = new Pila();
        
        aux1.vaciar(original);
        aux2.vaciar(aux1);
        
        original.vaciar(aux2);
        
    }
    
    public static void ordenPorNumero(int X, Pila original){
        Pila menores = new Pila();
        Pila mayores = new Pila();
        
        while(! original.esVacia()){
            int elem = original.eli();
            if(elem < X){
                menores.adi(elem);
            }else{
                mayores.adi(elem);
            }
        }
        original.vaciar(menores);
        original.vaciar(mayores);
    }
}
