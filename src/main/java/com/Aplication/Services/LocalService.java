package com.Aplication.Services;

import com.Aplication.modelo.Local;
import com.Aplication.repository.LocalRepository;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class LocalService {

    @Autowired
    private LocalRepository localRepository; 

    // Crear o actualizar un Local
    public Local create(Local local) {
        return localRepository.save(local);
    }

    // Obtener todos los Locales
    public List<Local> getAllLocal() {
        return localRepository.findAll();
    }

    // Obtener Local por ID
    public Optional<Local> findById(Long id) {
        return localRepository.findById(id);
    }


    // Eliminar un Local por su ID
    public void deleteLocal(Local local) {
        localRepository.delete(local);
    }

    public Local updateLocal(Long id, Local updateLocal) {
        return localRepository.findById(id).map(local -> {
            local.setIdlocal(updateLocal.getIdlocal());
            local.setLocal(updateLocal.getLocal());
            local.setTelefonoRegistro(updateLocal.getTelefonoRegistro());
            local.setDireccionRegistro(updateLocal.getDireccionRegistro());
            return localRepository.save(local); // Guardar local actualizado
        }).orElseThrow(() -> new RuntimeException("Local no encontrado"));
    }
    
    public Local uploadImage(Long Id, MultipartFile imagen) throws IOException {
        // Encontrar al cliente por su ID
        Optional<Local> localOptional = localRepository.findById(Id);

        if (localOptional.isPresent()) {
            Local local = localOptional.get();
            local.setImagen(imagen.getBytes()); // Establecer la imagen
            return localRepository.save(local); // Guardar el cliente actualizado
        } else {
            throw new RuntimeException("Local no encontrado");
        }
    }

    
    public byte[] getImage(Long id) {
        Local local = localRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Local no encontrado"));
        return local.getImagen(); 
    }
}