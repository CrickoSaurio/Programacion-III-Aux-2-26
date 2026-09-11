/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasObjetos;

/**
 *
 * @author Cristhian
 */
public class PilaD extends VectorD{
    private int tope;
    
    public PilaD(){
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
    
    public void adi(Dueño elem){
        if(this.esLlena()){
            System.out.println("la Pila esta llena!!!");
        }else{
            tope ++;
            v[tope] = elem;
        }
    }
    
    public Dueño eli(){
        if(this.esVacia()){
            System.out.println("La pila esta vacia!!!");
            return null;
        }else{
            Dueño elem = v[tope];
            tope --;
            return elem;
        }
    }
    
    public void mostrar(){
        PilaD aux = new PilaD();
        while(! this.esVacia()){
            Dueño elem = this.eli();
            elem.mostrar();
            aux.adi(elem);
        }
        
        while(! aux.esVacia()){
            Dueño elem = aux.eli();
            this.adi(elem);
        }
    }
    
    public void vaciar(PilaD otro){
        while(! otro.esVacia()){
            Dueño elem = otro.eli();
            this.adi(elem);
        }
    }
}
