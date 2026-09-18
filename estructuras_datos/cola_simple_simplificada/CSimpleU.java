package estructuras_datos.cola_simple_simplificada;

import java.util.Scanner;

public class CSimpleU {
    private int MAX = 50;
    private User v[];
    private int ini, fin;

    public CSimpleU(){
        v = new User[MAX];
        ini = fin = -1;
    }

    public int nroElem() {
        if(ini == -1 && fin == -1){
            return 0;
        }
        else{
            return fin - ini + 1;
        }
    }

    public boolean esVacia(){
        return ini == -1 && fin == -1;
    }

    public boolean esLlena(){
        return fin == MAX;
    }

    public void adi(User u){
        if(esLlena()){
            System.out.println("Cola llena");
        }
        else{
            fin++;
            v[fin] = u;
        }
    }

    public User eli(){
        User u = null;
        if(esVacia()){
            System.out.println("Cola vacia");
        }
        else{
            ini++;
            u = v[ini];
            if(ini == fin){
                ini = fin = -1;
            }
        }
        return u;
    }

    public void vaciar(CSimpleU otra){
        while(!otra.esVacia()){
            this.adi(otra.eli());
        }
    }

    public void llenar(int n){
        Scanner leer = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("Ingrese un usuario:");
            String nom = leer.nextLine();
            String pass = leer.nextLine();
            int id = leer.nextInt();
            User u = new User(nom, pass, id);
            this.adi(u);
        }
    }

    public void mostrar(){
        CSimpleU aux = new CSimpleU();
        while (!this.esVacia()) {
            User u = this.eli();
            u.mostrar();
            aux.adi(u);
        }
        this.vaciar(aux);
    }
}
