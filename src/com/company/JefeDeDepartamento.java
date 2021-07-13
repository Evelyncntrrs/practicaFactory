package com.company;

public class JefeDeDepartamento extends Empleado implements iEmpleado {
    public JefeDeDepartamento(String nombre, Integer salario, TipoEmpleado cargo) {
        super(nombre, salario, cargo);
    }

    public JefeDeDepartamento() {
    }

    @Override
    public void nuevoEmpleado(String nombre) {
        System.out.println("soy jefe de departament");
    }

    @Override
    public void actualizarDatos(String nombre,Integer salario, String cargo) {

    }
}
