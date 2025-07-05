package com.mycompany.personasexternas;

public class PersonasExternas implements IPersonasExternas {

    // Atributos
    PersonaExterna[] personasExternas;
    int contador;

    // Constructor
    public PersonasExternas(int dimension) {
        this.personasExternas = new PersonaExterna[dimension];
        this.contador = 0;
        
        }
    // Metodos
    public boolean agregarPersonasExternas(PersonaExterna personaExterna) {
        if (contador == personasExternas.length) {
            return false;
        } else {
            personasExternas[contador] = personaExterna;
            contador++;
            return false;
        }
    }

    public boolean actualizarPersonasExternas(int i, PersonaExterna personaExterna) {
        if (i >= 0 && i < contador) {
            this.personasExternas[i] = personaExterna;
            return true;
        } else {
            return false;
        }
    }

    public void buscarPersonasExternas(int id) {
        boolean encontrado = false;
        // String idPersona = personasExternas.toString();
        // int idPersonaInt = Integer.parseInt(idPersona.subString(idPersona.indexOf("id
        // = ") + 5, idPersona.indexOf("\nNombre: ")));

        for (int i = 0; i < contador; i++) {
            if (personasExternas[i] != null && personasExternas[i].getId() == id) {
                System.out.println("\nPersona externa encontrada: " + personasExternas[i].toString());
                System.out.println("Descripcion: " + personasExternas[i].getDescripcion());
                System.out.println("-----------------------------------\n");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró una persona externa con el ID: " + id);
        }
    }

    public boolean eliminarPersonasExternas(int id) {
        if (id >= 0 && id < contador && personasExternas[id] != null) {
            personasExternas[id] = null;
            return true;
        }
        return false;
    }

    public void imprimirPersonasExternas() {
        for (int i = 0; i < contador; i++) {
            if (i >= 0 && i < contador && personasExternas[i] != null) {
                System.out.println("| Datos de la persona externa " + (i + 1) + " |");
                System.out.println(personasExternas[i].toString());
                System.out.println("Descripcion: " + personasExternas[i].getDescripcion());
                System.out.println("-----------------------------------\n");

            }
        }

    }

}