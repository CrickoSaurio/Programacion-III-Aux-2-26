public class Main {
    public static void main(String[] args) {
        CSimpleE estudiantes = new CSimpleE();
        estudiantes.adi(new Estudiante(7145821, "JUAN", "PEREZ", "PRIMARIA", 3));
        estudiantes.adi(new Estudiante(6823947, "MARIA", "QUISPE", "SECUNDARIA", 2));
        estudiantes.adi(new Estudiante(7936214, "CARLOS", "MAMANI", "PRIMARIA", 5));
        estudiantes.adi(new Estudiante(6517283, "ANA", "CONDORI", "SECUNDARIA", 4));
        estudiantes.adi(new Estudiante(8245136, "LUIS", "FLORES", "PRIMARIA", 1));
        estudiantes.adi(new Estudiante(7359142, "SOFIA", "HUANCA", "SECUNDARIA", 6));
        estudiantes.adi(new Estudiante(6194375, "DANIEL", "ROJAS", "PRIMARIA", 6));
        estudiantes.adi(new Estudiante(8562719, "LAURA", "MAMANI", "SECUNDARIA", 1));
        estudiantes.adi(new Estudiante(7048263, "MIGUEL", "VARGAS", "PRIMARIA", 4));
        estudiantes.adi(new Estudiante(6715938, "PAOLA", "CHOQUE", "SECUNDARIA", 3));
        estudiantes.adi(new Estudiante(9182634, "ANDRES", "GUTIERREZ", "PRIMARIA", 2));
        estudiantes.adi(new Estudiante(7426159, "VALERIA", "TICONA", "SECUNDARIA", 5));
        estudiantes.adi(new Estudiante(6839472, "JORGE", "MENDOZA", "PRIMARIA", 5));
        estudiantes.adi(new Estudiante(8173546, "CAMILA", "ARIAS", "SECUNDARIA", 2));
        estudiantes.adi(new Estudiante(7594218, "DIEGO", "SALAZAR", "PRIMARIA", 1));

        CCircularR resultados = new CCircularR();
        resultados.adi(new Resultado(7145821, 1, 78.5f));
        resultados.adi(new Resultado(7145821, 2, 84.0f));
        resultados.adi(new Resultado(7145821, 3, 91.5f));

        resultados.adi(new Resultado(6823947, 1, 65.0f));
        resultados.adi(new Resultado(6823947, 2, 72.5f));

        resultados.adi(new Resultado(7936214, 1, 88.0f));
        resultados.adi(new Resultado(7936214, 2, 76.5f));
        resultados.adi(new Resultado(7936214, 3, 93.0f));

        resultados.adi(new Resultado(6517283, 1, 81.5f));
        resultados.adi(new Resultado(6517283, 2, 69.0f));

        resultados.adi(new Resultado(8245136, 1, 57.5f));
        resultados.adi(new Resultado(8245136, 2, 64.0f));
        resultados.adi(new Resultado(8245136, 3, 71.5f));

        resultados.adi(new Resultado(7359142, 1, 92.0f));
        resultados.adi(new Resultado(7359142, 2, 86.5f));

        resultados.adi(new Resultado(6194375, 1, 73.0f));
        resultados.adi(new Resultado(6194375, 2, 79.5f));
        resultados.adi(new Resultado(6194375, 3, 88.0f));

        resultados.adi(new Resultado(8562719, 1, 61.5f));
        resultados.adi(new Resultado(8562719, 2, 70.0f));

        resultados.adi(new Resultado(7048263, 1, 85.5f));
        resultados.adi(new Resultado(7048263, 2, 77.0f));
        resultados.adi(new Resultado(7048263, 3, 90.5f));

        resultados.adi(new Resultado(6715938, 1, 68.0f));
        resultados.adi(new Resultado(6715938, 2, 74.5f));

        resultados.adi(new Resultado(9182634, 1, 95.0f));
        resultados.adi(new Resultado(9182634, 2, 89.5f));
        resultados.adi(new Resultado(9182634, 3, 94.0f));

        resultados.adi(new Resultado(7426159, 1, 76.0f));
        resultados.adi(new Resultado(7426159, 2, 82.5f));

        resultados.adi(new Resultado(6839472, 1, 63.5f));
        resultados.adi(new Resultado(6839472, 2, 71.0f));
        resultados.adi(new Resultado(6839472, 3, 79.5f));

        resultados.adi(new Resultado(8173546, 1, 87.0f));
        resultados.adi(new Resultado(8173546, 2, 91.5f));

        resultados.adi(new Resultado(7594218, 1, 72.0f));
        resultados.adi(new Resultado(7594218, 2, 66.5f));
        resultados.adi(new Resultado(7594218, 3, 80.0f));

        // a) mostrar a los estudiantes junto con sus respectivos resultados obtenidos
        // b) mostrar a los estudiantes y sus notas solo de la fase X
        // c) muestra el promedio total obtenido en la fase 3 por los estudiantes solo de nivel secundaria
        // d) muestra el promedio aprobatorio de los estudiantes en la fase X
        // e) muestra a el/los estudiantes son mayor nota de la fase X y de nivel Y
    }

}
