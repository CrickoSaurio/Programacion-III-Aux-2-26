public class CCircularR{
    private int MAX = 50;
    private int ini, fin;
    private Resultado v[];


    public CCircularR(){
        ini = fin = 0;
        v = new Resultado[MAX];
    }

    public int nroElem(){
        return (fin - ini + MAX) % MAX;
    }

    public boolean esVacia(){
        return nroElem() == 0;
    }

    public boolean esLlena(){ 
        return nroElem() == MAX -1;
    }

    public void adi(Resultado r){
        if(esLlena()){
            System.out.println("La cola está llena");
        } else {
            fin = (fin + 1) % MAX;
            v[fin] = r;
        }
    }

    public Resultado eli(){
        Resultado elem = null;
        if(esVacia()){
            System.out.println("La cola está vacía");
        } else {
            ini = (ini + 1) % MAX;
            elem = v[ini];
        }
        return elem;
    }

    public void vaciar(CCircularR otro){
        while(! otro.esVacia()){
            adi(otro.eli());
        }
    }

    public void mostrar(){
        CCircularR aux = new CCircularR();
        while(! esVacia()){
            Resultado elem = eli();
            elem.mostrar();
            aux.adi(elem);
        }
        vaciar(aux);
    }
}