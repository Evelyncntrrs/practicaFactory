package com.company;

public class Docente extends Empleado implements iEmpleado {

    public Docente(String nombre, Integer salario, TipoEmpleado cargo) {
        super(nombre, salario, cargo);
    }

    public Docente() {
    }

    @Override
    public void nuevoEmpleado(String nombre) {
        System.out.println("soy docente");
    }

    @Override
    public void actualizarDatos(String nombre,Integer salario, String cargo) {

    }

}
