/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Cristhian
 */
public class LS_CircularC extends ListaSimpleC{
    
    public LS_CircularC() {
        super();
    }
    
    public boolean esVacia(){
        return p == null;
    }
    
    public int nroElem(){
        if(esVacia()){
            return 0;
        }
        
        NodoC r = p;
        int c = 1;
        while(r.getSig()!= p){
            c++;
            r = r.getSig();
        }
        return  c;
    }
    
    public void adiFinal(Cancion dato){
        if(esVacia()){
            NodoC nuevo = new NodoC(dato);
            p = nuevo;
            p.setSig(p);
        }else{
            NodoC nuevo = new NodoC(dato);
            NodoC r = p;
            while(r.getSig() != p){
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setSig(p);
        }
    }
    
    public void adiPrincipio(Cancion dato){
        NodoC nuevo = new NodoC(dato);
        if(esVacia()){
            p = nuevo;
            nuevo.setSig(p);
        }
        else{
            NodoC ultimo = p;
            while(ultimo.getSig()!= p){
                ultimo = ultimo.getSig();
            }
            ultimo.setSig(nuevo);
            nuevo.setSig(p);
            p = nuevo;
        }
    }
    
    public void mostrar(){
        NodoC r = p;
        
        while(r.getSig() != p){
            r.getDato().mostrar();
            r = r.getSig();
        }
        r.getDato().mostrar();
    }
}
