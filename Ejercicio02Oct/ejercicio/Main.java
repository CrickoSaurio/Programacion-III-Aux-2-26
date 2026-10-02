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
    public static void main(String args[]){
        // ===============================
// COLA CIRCULAR DE FRATERNIDADES
// ===============================

CCircularF fraternidades = new CCircularF();


// =====================================================
// BLOQUE 1
// =====================================================

Mp_CSimpleD bloque1 = new Mp_CSimpleD(10);

// POSICION 0
bloque1.adicionar(0, new Danzarin("morenada", "fraterno", "informatica"));
bloque1.adicionar(0, new Danzarin("caporal", "organizador", "medicina"));
bloque1.adicionar(0, new Danzarin("saya", "externo", "derecho"));
bloque1.adicionar(0, new Danzarin("diablada", "fraterno", "turismo"));
bloque1.adicionar(0, new Danzarin("caporal", "externo", "quimica"));
bloque1.adicionar(0, new Danzarin("morenada", "organizador", "administracion"));
bloque1.adicionar(0, new Danzarin("saya", "fraterno", "matematica"));
bloque1.adicionar(0, new Danzarin("diablada", "externo", "informatica"));

// POSICION 1
bloque1.adicionar(1, new Danzarin("saya", "organizador", "medicina"));
bloque1.adicionar(1, new Danzarin("morenada", "externo", "turismo"));
bloque1.adicionar(1, new Danzarin("caporal", "fraterno", "administracion"));
bloque1.adicionar(1, new Danzarin("diablada", "organizador", "quimica"));
bloque1.adicionar(1, new Danzarin("saya", "externo", "informatica"));
bloque1.adicionar(1, new Danzarin("morenada", "fraterno", "derecho"));
bloque1.adicionar(1, new Danzarin("caporal", "externo", "matematica"));

// POSICION 2
bloque1.adicionar(2, new Danzarin("diablada", "fraterno", "administracion"));
bloque1.adicionar(2, new Danzarin("caporal", "organizador", "turismo"));
bloque1.adicionar(2, new Danzarin("morenada", "externo", "medicina"));
bloque1.adicionar(2, new Danzarin("saya", "fraterno", "quimica"));
bloque1.adicionar(2, new Danzarin("diablada", "externo", "informatica"));
bloque1.adicionar(2, new Danzarin("caporal", "fraterno", "derecho"));
bloque1.adicionar(2, new Danzarin("morenada", "organizador", "matematica"));
bloque1.adicionar(2, new Danzarin("saya", "externo", "administracion"));


// =====================================================
// BLOQUE 2
// =====================================================

Mp_CSimpleD bloque2 = new Mp_CSimpleD(10);

// POSICION 0
bloque2.adicionar(0, new Danzarin("saya", "externo", "turismo"));
bloque2.adicionar(0, new Danzarin("diablada", "organizador", "informatica"));
bloque2.adicionar(0, new Danzarin("morenada", "fraterno", "quimica"));
bloque2.adicionar(0, new Danzarin("caporal", "externo", "administracion"));
bloque2.adicionar(0, new Danzarin("saya", "fraterno", "medicina"));
bloque2.adicionar(0, new Danzarin("diablada", "externo", "derecho"));
bloque2.adicionar(0, new Danzarin("caporal", "organizador", "matematica"));
bloque2.adicionar(0, new Danzarin("morenada", "fraterno", "turismo"));
bloque2.adicionar(0, new Danzarin("saya", "organizador", "quimica"));

// POSICION 1
bloque2.adicionar(1, new Danzarin("caporal", "fraterno", "informatica"));
bloque2.adicionar(1, new Danzarin("morenada", "externo", "medicina"));
bloque2.adicionar(1, new Danzarin("diablada", "organizador", "turismo"));
bloque2.adicionar(1, new Danzarin("saya", "fraterno", "administracion"));
bloque2.adicionar(1, new Danzarin("caporal", "externo", "derecho"));
bloque2.adicionar(1, new Danzarin("morenada", "organizador", "matematica"));
bloque2.adicionar(1, new Danzarin("diablada", "fraterno", "quimica"));

// POSICION 2
bloque2.adicionar(2, new Danzarin("morenada", "externo", "informatica"));
bloque2.adicionar(2, new Danzarin("saya", "organizador", "medicina"));
bloque2.adicionar(2, new Danzarin("caporal", "fraterno", "turismo"));
bloque2.adicionar(2, new Danzarin("diablada", "externo", "administracion"));
bloque2.adicionar(2, new Danzarin("saya", "fraterno", "derecho"));
bloque2.adicionar(2, new Danzarin("morenada", "organizador", "quimica"));
bloque2.adicionar(2, new Danzarin("caporal", "externo", "matematica"));
bloque2.adicionar(2, new Danzarin("diablada", "fraterno", "medicina"));


// =====================================================
// BLOQUE 3
// =====================================================

Mp_CSimpleD bloque3 = new Mp_CSimpleD(10);

// POSICION 0
bloque3.adicionar(0, new Danzarin("caporal", "externo", "derecho"));
bloque3.adicionar(0, new Danzarin("morenada", "organizador", "informatica"));
bloque3.adicionar(0, new Danzarin("diablada", "fraterno", "turismo"));
bloque3.adicionar(0, new Danzarin("saya", "externo", "medicina"));
bloque3.adicionar(0, new Danzarin("morenada", "fraterno", "quimica"));
bloque3.adicionar(0, new Danzarin("caporal", "organizador", "administracion"));
bloque3.adicionar(0, new Danzarin("diablada", "externo", "matematica"));

// POSICION 1
bloque3.adicionar(1, new Danzarin("saya", "fraterno", "informatica"));
bloque3.adicionar(1, new Danzarin("caporal", "externo", "turismo"));
bloque3.adicionar(1, new Danzarin("morenada", "organizador", "medicina"));
bloque3.adicionar(1, new Danzarin("diablada", "fraterno", "derecho"));
bloque3.adicionar(1, new Danzarin("saya", "organizador", "quimica"));
bloque3.adicionar(1, new Danzarin("caporal", "fraterno", "matematica"));
bloque3.adicionar(1, new Danzarin("morenada", "externo", "administracion"));
bloque3.adicionar(1, new Danzarin("diablada", "organizador", "informatica"));

// POSICION 2
bloque3.adicionar(2, new Danzarin("saya", "externo", "turismo"));
bloque3.adicionar(2, new Danzarin("morenada", "fraterno", "medicina"));
bloque3.adicionar(2, new Danzarin("caporal", "organizador", "quimica"));
bloque3.adicionar(2, new Danzarin("diablada", "externo", "administracion"));
bloque3.adicionar(2, new Danzarin("saya", "fraterno", "derecho"));
bloque3.adicionar(2, new Danzarin("morenada", "organizador", "matematica"));
bloque3.adicionar(2, new Danzarin("caporal", "externo", "informatica"));
bloque3.adicionar(2, new Danzarin("diablada", "fraterno", "turismo"));
bloque3.adicionar(2, new Danzarin("saya", "organizador", "medicina"));


// =====================================================
// BLOQUE 4
// =====================================================

Mp_CSimpleD bloque4 = new Mp_CSimpleD(10);

// POSICION 0
bloque4.adicionar(0, new Danzarin("diablada", "fraterno", "quimica"));
bloque4.adicionar(0, new Danzarin("morenada", "externo", "turismo"));
bloque4.adicionar(0, new Danzarin("caporal", "organizador", "informatica"));
bloque4.adicionar(0, new Danzarin("saya", "fraterno", "administracion"));
bloque4.adicionar(0, new Danzarin("diablada", "externo", "medicina"));
bloque4.adicionar(0, new Danzarin("morenada", "organizador", "derecho"));
bloque4.adicionar(0, new Danzarin("caporal", "fraterno", "matematica"));
bloque4.adicionar(0, new Danzarin("saya", "externo", "quimica"));

// POSICION 1
bloque4.adicionar(1, new Danzarin("morenada", "fraterno", "informatica"));
bloque4.adicionar(1, new Danzarin("caporal", "externo", "medicina"));
bloque4.adicionar(1, new Danzarin("saya", "organizador", "turismo"));
bloque4.adicionar(1, new Danzarin("diablada", "fraterno", "administracion"));
bloque4.adicionar(1, new Danzarin("morenada", "externo", "derecho"));
bloque4.adicionar(1, new Danzarin("caporal", "organizador", "quimica"));
bloque4.adicionar(1, new Danzarin("saya", "fraterno", "matematica"));

// POSICION 2
bloque4.adicionar(2, new Danzarin("caporal", "externo", "turismo"));
bloque4.adicionar(2, new Danzarin("diablada", "organizador", "informatica"));
bloque4.adicionar(2, new Danzarin("morenada", "fraterno", "medicina"));
bloque4.adicionar(2, new Danzarin("saya", "externo", "derecho"));
bloque4.adicionar(2, new Danzarin("caporal", "fraterno", "administracion"));
bloque4.adicionar(2, new Danzarin("diablada", "organizador", "quimica"));
bloque4.adicionar(2, new Danzarin("morenada", "externo", "matematica"));
bloque4.adicionar(2, new Danzarin("saya", "fraterno", "informatica"));


// =====================================================
// AGREGAR LOS 4 BLOQUES A LA COLA CIRCULAR
// =====================================================

fraternidades.adi(bloque1);
fraternidades.adi(bloque2);
fraternidades.adi(bloque3);
fraternidades.adi(bloque4);
    }
}
