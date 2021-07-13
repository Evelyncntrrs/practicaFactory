package com.company;

public class Administrativo extends Empleado implements iEmpleado {


    public Administrativo(String nombre, Integer salario, TipoEmpleado cargo) {
        super(nombre, salario, cargo);
    }


    public Administrativo() {
    }

    @Override
    public void nuevoEmpleado(String nombre) {
        System.out.println("soy admin");
    }

    @Override
    public void actualizarDatos(String nombre,Integer salario, String cargo) {

    }
}
