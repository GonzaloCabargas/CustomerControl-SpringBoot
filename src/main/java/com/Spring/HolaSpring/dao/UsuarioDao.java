/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Spring.HolaSpring.dao;

import com.Spring.HolaSpring.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gonzalo
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}
