/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class PilaM {
    private int MAX = 50;
    private int top;
    private Medicamento v[];
    
    public PilaM() {
        v = new Medicamento[MAX];
        top = -1;
    }

    public boolean esVacia(){
        return top == -1;
    }

    public boolean esLlena(){
        return top == MAX -1;
    }

    public void adi(Medicamento u){
        if(esLlena()){
            System.out.println("La pila está llena");
        } else {
            top++;
            v[top] = u;
        }
    }

    public Medicamento eli(){
        Medicamento u = null;
        if(esVacia()){
            System.out.println("La pila está vacía");
        } else {
            u = v[top];
            top--;
        }
        return u;
    }

    public void vaciar(PilaM otra){
        while(! otra.esVacia()){
            this.adi(otra.eli());
        }
    }
    
    public void mostrar(){
        PilaM aux = new PilaM();
        while(!this.esVacia()){
            Medicamento u = this.eli();
            u.mostrar();
            aux.adi(u);
        }
        this.vaciar(aux);
    }
}
