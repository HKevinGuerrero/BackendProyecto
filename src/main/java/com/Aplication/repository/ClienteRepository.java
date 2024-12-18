package com.Aplication.repository;

import com.Aplication.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Optional<Cliente> findBynombre(String nombre);
    
    boolean existsByEmail(String email);

    // Método para buscar un cliente por correo electrónico
    public Optional<Cliente> findByEmail(String email);

    // Método para buscar un cliente por teléfono
    public Optional<Cliente> findByTelefono(Long telefono);

}
