/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesViernes409;
import java.util.Scanner;
/**
 *
 * @author Cristhian
 */
public class Pila extends Vector
{
    private int tope;
    
    public Pila(){
        super();
        tope = -1;
    }
    
    public int nroElem(){
        return tope +1;
        // return ++tope;
    }
    
    public boolean esVacia(){
        return tope == -1;
    }
    
    public boolean esLlena(){
        return tope == MAX;
    }
    
    public void adi(int elem){
        if(this.esLlena()){
            System.out.println("la Pila esta llena!!!");
        }else{
            tope ++;
            v[tope] = elem;
        }
    }
    
    public int eli(){
        if(this.esVacia()){
            System.out.println("La pila esta vacia!!!");
            return -1;
        }else{
            int elem = v[tope];
            tope --;
            return elem;
        }
    }
    
    public void mostrar(){
        Pila aux = new Pila();
        while(! this.esVacia()){
            int elem = this.eli();
            System.out.println(elem);
            aux.adi(elem);
        }
        
        while(! aux.esVacia()){
            int elem = aux.eli();
            this.adi(elem);
        }
    }
    
    public void llenar(int n){
        Scanner leer = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            int elem = leer.nextInt();
            this.adi(elem);
        }
    }
    
    public void vaciar(Pila otro){
        while(! otro.esVacia()){
            int elem = otro.eli();
            this.adi(elem);
        }
    }
    
    
    
    
    
}
