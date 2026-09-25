import java.util.Scanner;

public class CSimpleE {
    private int MAX = 50;
    private Estudiante v[];
    private int ini, fin;

    public CSimpleE(){
        v = new Estudiante[MAX];
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

    public void adi(Estudiante u){
        if(esLlena()){
            System.out.println("Cola llena");
        }
        else{
            fin++;
            v[fin] = u;
        }
    }

    public Estudiante eli(){
        Estudiante u = null;
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

    public void vaciar(CSimpleE otra){
        while(!otra.esVacia()){
            this.adi(otra.eli());
        }
    }

    public void mostrar(){
        CSimpleE aux = new CSimpleE();
        while (!this.esVacia()) {
            Estudiante u = this.eli();
            u.mostrar();
            aux.adi(u);
        }
        this.vaciar(aux);
    }
}
