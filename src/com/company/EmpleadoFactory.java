package com.company;

import static com.company.TipoEmpleado.*;

public abstract class EmpleadoFactory {

        public static iEmpleado getEmpleado( TipoEmpleado tipoEmpleado) {
            switch (tipoEmpleado){
                case ADMINISTRATIVO ->    { return new Administrativo();    }
                case JEFEDEDEPARTAMENTO ->    { return new JefeDeDepartamento();    }
                case DIRECTIVO ->  { return new Directivo();  }
                case DOCENTE ->  { return new Docente();  }
                default ->      { return null;          }
            }
        }


    public static iEmpleado getEmpleado(TipoEmpleado tipoEmpleado, String nombre, Integer salario, String cargo) {
        iEmpleado nuevoEmpleado = switch (tipoEmpleado) {
            case ADMINISTRATIVO ->  new Administrativo();
            case DIRECTIVO ->  new Directivo();
            case DOCENTE ->  new Docente();
            case JEFEDEDEPARTAMENTO -> new JefeDeDepartamento();
            default -> null;
        };
        nuevoEmpleado.actualizarDatos(nombre,salario,cargo);
        return nuevoEmpleado;
    }

}
