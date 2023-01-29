
package com.Spring.HolaSpring.dao;

import com.Spring.HolaSpring.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonaDao extends JpaRepository<Persona, Long>{
    
    
}
