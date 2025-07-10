//  @author: Licet

package com.mycompany.ipersonasexternas;

public class PersonasExternas implements IPersonasExternas {

    // Atributos
    PersonaExterna[] personasExternas;
    int contador = 0;

    // Constructor
    public PersonasExternas(int dimension) {
        this.personasExternas = new PersonaExterna[dimension];
        this.contador = 0;
        
    }
    // Metodos
    public boolean agregarPersonaExterna(PersonaExterna personaExterna) {
        if (contador == personasExternas.length) {
            return false;
        } else {
            personasExternas[contador] = personaExterna;
            contador++;
            return true;
        }
    }

    public boolean actualizarPersonaExterna(int i, PersonaExterna personaExterna) {
        if (i >= 0 && i < contador) {
            this.personasExternas[i] = personaExterna;
            return true;
        } else {
            return false;
        }
    }

    public void buscarPersonaExterna(int id) {
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

    public boolean eliminarPersonaExterna(int id) {
        for (int i = 0; i < contador; i++) {
            if (personasExternas[i] != null && personasExternas[i].getId() == id) {
                // Mover todos los elementos hacia la izquierda
                for (int j = i; j < contador - 1; j++) {
                    personasExternas[j] = personasExternas[j + 1];
                }
                personasExternas[contador - 1] = null; // Limpiar última posición
                contador--; // Decrementar contador
                return true;
            }
        }
        return false;
    }

    public void imprimirPersonaExterna() {
        for (int i = 0; i < contador; i++) {
            if (i >= 0 && i < contador && personasExternas[i] != null) {
                System.out.println("| Datos de la persona externa " + (i + 1) + " |");
                System.out.println(personasExternas[i].toString());
                System.out.println("Descripcion: " + personasExternas[i].getDescripcion());
                System.out.println("-----------------------------------\n");

            }
        }

    }

    // MÉTODO PARA OBTENER UNA PERSONA EXTERNA POR SU ID
    public PersonaExterna obtenerPersonaExternaPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (personasExternas[i] != null && personasExternas[i].getId() == id) {
                return personasExternas[i];
            }
        }
        return null; // SI NO SE ENCUENTRA
    }

    // MÉTODO PARA ACTUALIZAR PERSONA EXTERNA POR ID
    public boolean actualizarPersonaExternaPorId(int id, PersonaExterna personaActualizada) {
        for (int i = 0; i < contador; i++) {
            if (personasExternas[i] != null && personasExternas[i].getId() == id) {
                personasExternas[i] = personaActualizada;
                return true;
            }
        }
        return false; // SI NO SE ENCUENTRA
    }

    public PersonaExterna[] obtenerPersonasExternas() {
        // PARA CREAR UN NUEVO ARREGLO DE PERSONAS EXTERNAS 
        
        PersonaExterna[] resultado = new PersonaExterna[contador];
        int indice = 0;
        for (int i = 0; i < contador; i++) {
            if (personasExternas[i] != null) {
                resultado[indice++] = personasExternas[i];
            }
        }
        return resultado;
    }


}