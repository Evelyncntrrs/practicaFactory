package com.company;

public abstract class Empleado implements iEmpleado {
    String nombre;
    Integer salario;
    TipoEmpleado cargo;

    public Empleado() {
    }

    public Empleado(String nombre, Integer salario, TipoEmpleado cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public TipoEmpleado getCargo() {
        return cargo;
    }

    public void setCargo(TipoEmpleado cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", cargo=" + cargo +
                '}';
    }
}