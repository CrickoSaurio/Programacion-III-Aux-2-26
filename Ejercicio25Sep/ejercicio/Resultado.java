public class Resultado {
        private int ciEst, fase;
    private float nota;

    public Resultado(int ciEst, int fase, float nota) {
        this.ciEst = ciEst;
        this.fase = fase;
        this.nota = nota;
    }

    public int getCiEst() {
        return ciEst;
    }

    public void setCiEst(int ciEst) {
        this.ciEst = ciEst;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public void mostrar(){
        System.out.println("\tRESULTADO: "+ciEst+" NOTA: "+ nota+" FASE:"+fase);
    }
}
