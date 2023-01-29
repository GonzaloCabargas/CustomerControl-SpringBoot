
package com.Spring.HolaSpring.servicio;

import com.Spring.HolaSpring.domain.Persona;
import java.util.List;

public interface PersonaService {
    
    public List<Persona> ListarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar (Persona persona);
    
    public Persona encontrarPersona( Persona persona);
}
