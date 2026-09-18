/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio;

/**
 *
 * @author Cristhian
 */
public class Main {

    public static void main(String[] args) {
        PilaM medicamentos = new PilaM();
        medicamentos.adi(new Medicamento(1111, 2028, 2020, "Ibuprofeno", "sep", "nov", "Tabletas", false, 3.5F));
        medicamentos.adi(new Medicamento(1112, 2027, 2021, "Paracetamol", "mar", "ago", "Tabletas", false, 2.5F));
        medicamentos.adi(new Medicamento(1113, 2029, 2022, "Amoxicilina", "ene", "dic", "Capsulas", true, 5.75F));
        medicamentos.adi(new Medicamento(1114, 2028, 2020, "Loratadina", "jun", "oct", "Tabletas", false, 4.0F));
        medicamentos.adi(new Medicamento(1115, 2030, 2023, "Omeprazol", "feb", "jul", "Capsulas", false, 6.5F));
        medicamentos.adi(new Medicamento(1116, 2027, 2021, "Diclofenaco", "abr", "sep", "Gel", false, 8.25F));
        medicamentos.adi(new Medicamento(1117, 2029, 2022, "Azitromicina", "may", "nov", "Tabletas", true, 12.5F));
        medicamentos.adi(new Medicamento(1118, 2028, 2020, "Salbutamol", "ago", "mar", "Jarabe", true, 15.0F));
        medicamentos.adi(new Medicamento(1119, 2031, 2024, "Cetirizina", "jul", "ene", "Tabletas", false, 3.75F));
        medicamentos.adi(new Medicamento(1120, 2027, 2021, "Naproxeno", "oct", "jun", "Tabletas", false, 4.5F));
        medicamentos.adi(new Medicamento(1121, 2029, 2023, "Metformina", "sep", "feb", "Tabletas", true, 7.25F));
        medicamentos.adi(new Medicamento(1122, 2030, 2022, "Clotrimazol", "nov", "abr", "Crema", false, 9.5F));
        medicamentos.adi(new Medicamento(1123, 2028, 2020, "Prednisona", "dic", "may", "Tabletas", true, 6.75F));
        medicamentos.adi(new Medicamento(1124, 2031, 2024, "Hidroxicina", "ene", "ago", "Jarabe", true, 11.0F));
        medicamentos.adi(new Medicamento(1125, 2029, 2023, "Aspirina", "mar", "oct", "Tabletas", false, 2.0F));
        medicamentos.adi(new Medicamento(1126, 2030, 2022, "Miconazol", "jun", "dic", "Crema", false, 10.5F));

        CSimpleP pacientes = new CSimpleP();
        pacientes.adi(new Paciente("JOSE", "MEDINA ALVAREZ", 10000));
        pacientes.adi(new Paciente("MARIA", "QUISPE MAMANI", 10001));
        pacientes.adi(new Paciente("CARLOS", "RODRIGUEZ FLORES", 10002));
        pacientes.adi(new Paciente("ANA", "CONDORI VARGAS", 10003));
        pacientes.adi(new Paciente("LUIS", "MAMANI GUTIERREZ", 10004));
        pacientes.adi(new Paciente("ROSA", "HUANCA MEDINA", 10005));
        pacientes.adi(new Paciente("PEDRO", "FLORES QUISPE", 10006));
        pacientes.adi(new Paciente("LAURA", "CHOQUE MENDOZA", 10007));
        pacientes.adi(new Paciente("MIGUEL", "VARGAS TORREZ", 10008));
        pacientes.adi(new Paciente("SOFIA", "APAZA ROJAS", 10009));
        pacientes.adi(new Paciente("DANIEL", "SALAZAR CONDORI", 10010));

        CSimpleN n1 = new CSimpleN();
        n1.adi(1111);
        n1.adi(1114);

        CSimpleN n2 = new CSimpleN();
        n2.adi(1112);
        n2.adi(1115);
        n2.adi(1120);

        CSimpleN n3 = new CSimpleN();
        n3.adi(1113);
        n3.adi(1118);

        CSimpleN n4 = new CSimpleN();
        n4.adi(1116);
        n4.adi(1122);
        n4.adi(1125);

        CSimpleN n5 = new CSimpleN();
        n5.adi(1111);
        n5.adi(1117);
        n5.adi(1124);

        CSimpleN n6 = new CSimpleN();
        n6.adi(1119);
        n6.adi(1121);

        CSimpleN n7 = new CSimpleN();
        n7.adi(1114);
        n7.adi(1123);
        n7.adi(1126);

        CSimpleN n8 = new CSimpleN();
        n8.adi(1112);
        n8.adi(1116);
        n8.adi(1121);

        CSimpleN n9 = new CSimpleN();
        n9.adi(1115);
        n9.adi(1119);
        n9.adi(1125);

        CSimpleN n10 = new CSimpleN();
        n10.adi(1113);
        n10.adi(1117);
        n10.adi(1122);

        CSimpleN n11 = new CSimpleN();
        n11.adi(1118);
        n11.adi(1124);
        n11.adi(1126);

        PilaF facturas = new PilaF();
        facturas.adi(new Factura(10000, n1, true));
        facturas.adi(new Factura(10001, n2, false));
        facturas.adi(new Factura(10002, n3, true));
        facturas.adi(new Factura(10003, n4, false));
        facturas.adi(new Factura(10004, n5, true));
        facturas.adi(new Factura(10005, n6, true));
        facturas.adi(new Factura(10006, n7, false));
        facturas.adi(new Factura(10007, n8, true));
        facturas.adi(new Factura(10008, n9, false));
        facturas.adi(new Factura(10009, n10, true));
        facturas.adi(new Factura(10010, n11, false));

        
        System.out.println("\t\t\tMOSTRAR LOS MEDICAMENTOS QUE SE TIENEN EN TODAS LAS FACTURAS");
        mostrarMedicamentosFacturas(facturas, medicamentos);
        //System.out.println("\t\t\t ELIMINAR TODOS LOS MEDICAMENTOS VENCIDOS EN LA PILA DE MEDICAMENTOS");
        System.out.println("\t\t\t MOVER TODOS LOS MEDICAMENTOS QUE ESTEN A 2 AÑOS DE VENCER AL FINAL DE LA PILA");
        System.out.println("\t\t\tANTES------------");
        medicamentos.mostrar();
        moverMedicamentosProximosAVencer(medicamentos);
        
        System.out.println("\t\t\tDESPUES--------------");
        medicamentos.mostrar();
        System.out.println("\t\t\t MOSTRAR A TODOS LOS PACIENTES QUE PAGARON SU FACTURA");
        System.out.println("\t\t\t MOSTRAR A TODOS LOS PACIENTES QUE NO PAGARON SU FACTURA Y EL TOTAL QUE DEBEN PAGAR");        
        
    }

    
    public static String nombreMedicamentoPorCod(int cod, PilaM medicamentos){
        String buscado = "";
        boolean encontrado = false;
        PilaM aux = new PilaM();
        while(! medicamentos.esVacia()){
            Medicamento m = medicamentos.eli();
            if(m.getCod() == cod){
                buscado = m.getNombre();
                encontrado = true;
            }
            aux.adi(m);
        }
        medicamentos.vaciar(aux);
        if(encontrado){
            return buscado;
        }else{
            System.out.println("NO ENCONTRO EL MEDICAMENTO");
            return buscado;
        }
    }
    
    public static void mostrarMedicamentosFacturas(PilaF facturas, PilaM medicamentos){
        PilaF aux = new PilaF();
        while(! facturas.esVacia()){
            Factura f = facturas.eli();
            System.out.println("\nFACTURA"+f.getIdFac());
            CSimpleN auxN = new CSimpleN();
            //CSimpleN medis = f.getMedicamentos()
            //while(! medis.esVacia())
            while(!f.getMedicamentos().esVacia()){
                int idMed = f.getMedicamentos().eli();
                String nombreMed = nombreMedicamentoPorCod(idMed, medicamentos);
                System.out.println("\t\t"+nombreMed);
                auxN.adi(idMed);
            }
            f.getMedicamentos().vaciar(auxN);
            aux.adi(f);
        }
        facturas.vaciar(aux);
    }

    public static void moverMedicamentosProximosAVencer(PilaM medicamentos){
        PilaM aux = new PilaM();
        PilaM aux2 = new PilaM();
        
        while(! medicamentos.esVacia()){
            Medicamento m = medicamentos.eli();
            if(m.getAnioV()> 2026 && m.getAnioV()<= 2028){
                aux2.adi(m);
            }else{
                aux.adi(m);
            }
        }
        medicamentos.vaciar(aux);
        medicamentos.vaciar(aux2);
    }
}
