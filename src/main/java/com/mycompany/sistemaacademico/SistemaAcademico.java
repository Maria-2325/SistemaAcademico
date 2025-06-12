package com.mycompany.sistemaacademico;

import com.mycompany.ClasesSistema.Empleado;
import com.mycompany.ClasesSistema.PersonaInstitucional;
import com.mycompany.ClasesSistema.PersonalAcademico;
import com.mycompany.persona.*;
import com.mycompany.personasexternas.*;

public class SistemaAcademico {

    public static void main(String[] args) {
        System.out.println("\n\t--------SISTEMA ACADEMICO------");
        System.out.println("\n----PERSONA-------");
        Persona objPersona = new Persona(1, "Maria Ibarra", "ibarraliset37@gmail.com", "0803807171");
        System.out.println("Datos: \n" + objPersona.toString());

        System.out.println("\n----PERSONA INVITADA-------");
        PersonaExterna objPersonaInvitada = new PersonaExterna(2, "Licet Ibarra", "marialiset13@gmail.com", "0803050616");
        System.out.println("Datos: \n" + objPersonaInvitada.toString());

        System.out.println("\n----PERSONA INSTITUCIONAL-------");
        PersonaInstitucional objPersonaInstitucional = new PersonaInstitucional("maria.ibarra@espoch.edu.ec", 2, "Licet Ibarra", "marialiset13@gmail.com", "0803050616");
        System.out.println("Datos: \n" + objPersonaInstitucional.toString());

        System.out.println("\n----EMPLEADO-------");
        Empleado objEmpleado = new Empleado(800.0, "maria.ibarra@espoch.edu.ec", 2, "Licet Ibarra", "marialiset13@gmail.com", "0803050616");
        System.out.println("Datos: \n" + objEmpleado.toString());

        System.out.println("\n----ESTUDIANTE-------");
        Estudiante objEstudiante = new Estudiante(002, "maria.ibarra@espoch.edu.ec", 2, "Licet Ibarra", "marialiset13@gmail.com", "0803050616");
        System.out.println("Datos: \n" + objEstudiante.toString());

        System.out.println("\n----PERSONAL ACADEMICO-------");
        PersonalAcademico objPersonalAcademico = new PersonalAcademico(800.0, "maria.ibarra@espoch.edu.ec", 2, "Licet Ibarra", "marialiset13@gmail.com", "0803050616");
        System.out.println("Datos: \n" + objPersonalAcademico.toString());
        
        System.out.println("\n----PERSONAL DE SERVICIOS-------");
        Trabajador objPersonalServicio = new Trabajador("Docentes",300.0, "maria.ibarra@espoch.edu.ec", 2, "Licet Ibarra", "marialiset13@gmail.com", "0803050616");
        System.out.println("Datos: \n" + objPersonalServicio.toString());

    }
}
