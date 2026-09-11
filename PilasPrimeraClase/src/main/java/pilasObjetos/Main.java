/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasObjetos;

/**
 *
 * @author Cristhian
 */
public class Main {

    public static void main(String[] args) {

        ColaM m1 = new ColaM();
        m1.adi(new Mascota(1114, "Firulais", "Perro", 4));
        m1.adi(new Mascota(1115, "Michi", "Gato", 2));
        m1.adi(new Mascota(1116, "Rocky", "Perro", 6));
        m1.adi(new Mascota(1114, "Luna", "Gato", 1));
        m1.adi(new Mascota(1117, "Max", "Loro", 3));
        m1.adi(new Mascota(1118, "Nala", "Perro", 5));
        m1.adi(new Mascota(1115, "Toby", "Gato", 4));
        m1.adi(new Mascota(1119, "Coco", "Conejo", 2));
        m1.adi(new Mascota(1120, "Simba", "Gato", 3));
        m1.adi(new Mascota(1116, "Duke", "Perro", 7));
        m1.adi(new Mascota(1121, "Pelusa", "Gato", 1));
        m1.adi(new Mascota(1117, "Bruno", "Perro", 5));
        m1.adi(new Mascota(1122, "Milo", "Loro", 2));
        m1.adi(new Mascota(1118, "Canela", "Conejo", 4));
        m1.adi(new Mascota(1120, "Zeus", "Perro", 6));

        m1.mostrar();

        PilaD d1 = new PilaD();
        d1.adi(new Dueño("JUAN PEREZ", 1111));
        d1.adi(new Dueño("MARIA QUISPE", 1112));
        d1.adi(new Dueño("CARLOS FLORES", 1113));
        d1.adi(new Dueño("ANA MAMANI", 1114));
        d1.adi(new Dueño("LUIS CONDORI", 1115));
        d1.adi(new Dueño("ROSA VARGAS", 1116));
        d1.adi(new Dueño("PEDRO CHOQUE", 1117));
        d1.adi(new Dueño("ELENA TORREZ", 1118));
        d1.adi(new Dueño("MIGUEL PAREDES", 1119));
        d1.adi(new Dueño("SOFIA ROJAS", 1120));
        d1.adi(new Dueño("JORGE FLORES", 1121));
        d1.adi(new Dueño("LAURA QUISPE", 1122));
        d1.adi(new Dueño("DANIEL MAMANI", 1114));
        d1.adi(new Dueño("CARMEN CONDORI", 1116));
        d1.adi(new Dueño("FERNANDO VARGAS", 1120));
        d1.mostrar();
        
        //mostrar a los dueños y cuantas mascotas tienen
        System.out.println("\t\t----mostrar a los dueños y cuantas mascotas tienen");
        mostrarDuesnosNumeroMascotas(d1, m1);
        
        //MOSTRAR CUANTOS DUEÑOS TIENEN LA MASCOTA DE TIPO X
        
        // MOSTRAR A LOS DUEÑOS CON MASCOTAS DE LA MAYOR EDAD
        
        // MOSTRAR A LOS DUEÑOS CON MAS DE 2 MASCOTAS
        
        // VERIFICAR SI EXISTE ALGUN DUEÑO CON MASCOTA DE TIPO X
    }
    
    public static void mostrarDuesnosNumeroMascotas(PilaD dueños, ColaM mascotas){
        PilaD auxD = new PilaD();
        while(! dueños.esVacia()){
            Dueño d = dueños.eli();
            System.out.println(d.getNombreCompleto());
            int nroMasc = nroMascotasPorDueño(d.getCarnetIdentidad(), mascotas);
            System.out.println("\tNumero de mascotas: "+nroMasc);
            
            auxD.adi(d);
        }
        dueños.vaciar(auxD);
    }
    
    public static int nroMascotasPorDueño(int carnet, ColaM mascotas){
        ColaM aux = new ColaM();
        int cont = 0;
        while(! mascotas.esVacia()){
            Mascota m = mascotas.eli();
            if(m.getCarnetIdentidadDueño() == carnet){
                cont++;
            }
            aux.adi(m);
        }
        mascotas.vaciar(aux);
        return cont;
    }
    
    /*************-------------------------- */
    
    
}
