package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Un instituto necesita modelar su sistema de gestión de empleados.
            Utilizar el método Factory para armar un esquema que permita crear objetos de tipo:
            - Docente
            - Directivo
            - Jefe de departamento
            - Administrativo

            Los objetos de cada clase deben poder indicar su cargo, salario y nombre.

	 */

        TipoEmpleado tipoEmpleado = TipoEmpleado.DOCENTE;
        String nombre = "pablo";
        Double salario = 8.50;

        iEmpleado empleado = EmpleadoFactory.getEmpleado(tipoEmpleado, nombre, salario);

        System.out.println("Soy "+empleado.getNombre());
        System.out.println(empleado);




    }
}
