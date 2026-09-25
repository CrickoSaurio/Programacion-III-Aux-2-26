public class Estudiante {
    private int ci;
    private String nom, ape, nivel;
    private int grado;

    public Estudiante(int ci, String nom, String ape, String nivel, int grado) {
        this.ci = ci;
        this.nom = nom;
        this.ape = ape;
        this.nivel = nivel;
        this.grado = grado;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    public void mostrar(){
        System.out.println("ESTUDIANTE: "+ nom +" "+ ape+" | "+grado +" de "+ nivel);
    }
}
