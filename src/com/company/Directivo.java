package com.company;

public class Directivo extends Empleado implements iEmpleado {

    public Directivo(String nombre, Integer salario, TipoEmpleado cargo) {
        super(nombre, salario, cargo);
    }

    public Directivo() {
    }

    @Override
    public void nuevoEmpleado(String nombre) {
        System.out.println("soy direct");
    }

    @Override
    public void actualizarDatos(String nombre,Integer salario, String cargo) {

    }
}
