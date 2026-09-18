package estructuras_datos.pila_vector;

import java.util.Scanner;

public class PilaU extends Vector {
    private int top;
    
    public PilaU() {
        super();
        top = -1;
    }

    public boolean esVacia(){
        return top == -1;
    }

    public boolean esLlena(){
        return top == MAX -1;
    }

    public void adi(User u){
        if(esLlena()){
            System.out.println("La pila está llena");
        } else {
            top++;
            v[top] = u;
        }
    }

    public User eli(){
        User u = null;
        if(esVacia()){
            System.out.println("La pila está vacía");
        } else {
            u = v[top];
            top--;
        }
        return u;
    }

    public void vaciar(PilaU otra){
        while(! otra.esVacia()){
            this.adi(otra.eli());
        }
    }

    public void llenar(int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("Ingrese un usuario:");
            String nom = sc.nextLine();
            String password = sc.nextLine();
            int id = sc.nextInt();
            User u = new estructuras_datos.pila_vector.User(id, nom, password);
            this.adi(u);
        }
    }

    public void mostrar(){
        PilaU aux = new PilaU();
        while(!this.esVacia()){
            User u = this.eli();
            u.mostrar();
            aux.adi(u);
        }
        this.vaciar(aux);
    }
    
}