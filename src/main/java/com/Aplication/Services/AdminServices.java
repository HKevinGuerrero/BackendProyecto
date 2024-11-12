/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Aplication.Services;

import com.Aplication.modelo.Admin;
import com.Aplication.repository.AdminRepository;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author KEVIN-PC
 */
@Service
public class AdminServices {
    @Autowired
    private AdminRepository adminRepository;

    // Método para guardar un administrador
    public Admin create(Admin admin) {
        // Guardamos el administrador en la base de datos y lo devolvemos
        return adminRepository.save(admin);
    }

    // Método para obtener todos los administradores
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // Método para eliminar un administrador
    public void delete(Admin admin) {
        adminRepository.delete(admin);
    }

    
    public Optional<Admin> findById(Long id) {
        return adminRepository.findById(id);
    }
    


    // Método para actualizar un administrador
    public Admin updateAdmin(Long id, Admin updatedAdmin) {
        return adminRepository.findById(id).map(admin -> {
            admin.setNombre(updatedAdmin.getNombre());
            admin.setApellido(updatedAdmin.getApellido());
            admin.setTelefono(updatedAdmin.getTelefono());
            admin.setCorreo(updatedAdmin.getCorreo());
            admin.setRol(updatedAdmin.getRol());
            admin.setLocal(updatedAdmin.getLocal());
            admin.setContrasena(updatedAdmin.getContrasena());
            return adminRepository.save(admin); // Guardar administrador actualizado
        }).orElseThrow(() -> new RuntimeException("Administrador no encontrado"));
    }
    
    public Admin uploadImage(Long id, MultipartFile imagen) throws IOException {
        // Encontrar al administrador por su ID
        Optional<Admin> adminOptional = adminRepository.findById(id);

        if (adminOptional.isPresent()) {
            Admin admin = adminOptional.get();
            admin.setImagen(imagen.getBytes()); // Establecer la imagen
            return adminRepository.save(admin); // Guardar el administrador actualizado
        } else {
            throw new RuntimeException("Administrador no encontrado");
        }
    }
    
    public byte[] getImage(Long id) {
        Admin admin = adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Administrador no encontrado"));
        return admin.getImagen(); // Devuelve la imagen almacenada como byte[]
    }

}
