/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class Factura {
    private int idFac;
    private CSimpleN medicamentos;
    private boolean pagado;

    public Factura(int idFac, CSimpleN medicamentos, boolean pagado) {
        this.idFac = idFac;
        this.medicamentos = medicamentos;
        this.pagado = pagado;
    }

    public int getIdFac() {
        return idFac;
    }

    public void setIdFac(int idFac) {
        this.idFac = idFac;
    }

    public CSimpleN getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(CSimpleN medicamentos) {
        this.medicamentos = medicamentos;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    public void mostrar(){
        System.out.println("FACTURA: "+idFac);
        System.out.println( pagado? "PAGADO":"NO ESTA PAGADO");
        System.out.println("\tMedicamentos de la factura:");
        medicamentos.mostrar();
    }
}
