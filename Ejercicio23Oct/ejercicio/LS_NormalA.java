/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Cristhian
 */
public class LS_NormalA extends ListaSimpleA{

    public LS_NormalA() {
        super();
    }
    
    public boolean esVacia(){
        return p == null;
    }
    
    public int nroElem(){
        if(esVacia()){
            return 0;
        }
        
        NodoA r = p;
        int c = 0;
        while(r!= null){
            c++;
            r = r.getSig();
        }
        return  c;
    }
    
    public void adiFinal(Album dato){
        if(esVacia()){
            p = new NodoA(dato);
        }else{
            NodoA nuevo = new NodoA(dato);
            NodoA r = p;
            while(r.getSig() != null){
                r = r.getSig();
            }
            r.setSig(nuevo);
        }
    }
    
    public void adiPrincipio(Album dato){
        NodoA nuevo = new NodoA(dato);
        nuevo.setSig(p);
        p = nuevo;
    }
    
    public void mostrar(){
        NodoA r = p;
        
        while(r != null){
            r.getDato().mostrar();
            r = r.getSig();
        }
    }
}
