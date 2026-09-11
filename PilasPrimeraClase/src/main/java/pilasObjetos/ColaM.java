/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasObjetos;

/**
 *
 * @author Cristhian
 */
public class ColaM extends Vector{
    private int ini, fin;
    
    public ColaM(){
        super();
        this.ini = -1;
        this.fin = -1;
    }
    
    public int nroElem(){
        return this.fin - this.ini;
    }
    
    public boolean esVacia(){
        //return nroElem() == 0;
        return this.ini == -1 && this.fin == -1;
    }
    
    public boolean esLlena(){
        //return nroElem() == MAX;
        return this.fin == MAX -1;
    }
    
    public void adi(Mascota m){
        if(esLlena()){
            System.out.println("La cola esta llena!!!");
        }else{
            this.fin ++;
            v[this.fin] = m;
        }
    }
    
    public Mascota eli(){
        Mascota m = null;
        if(esVacia()){
            System.out.println("la Cola esta vacia!!!");
            return m;
        }else{
            this.ini++;
            m = v[this.ini];
            if(this.ini == this.fin){
                this.ini = this.fin = -1;
            }
            return m;
        }
    }
    
    public void vaciar(ColaM otra){
        while(! otra.esVacia()){
            adi(otra.eli());
        }
    }
    
    public void mostrar(){
        ColaM aux = new ColaM();
        while(! esVacia()){
            Mascota m = eli();
            m.mostrar();
            aux.adi(m);
        }
        vaciar(aux);
    }
}
