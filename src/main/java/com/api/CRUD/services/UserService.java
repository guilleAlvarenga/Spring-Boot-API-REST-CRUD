package com.api.CRUD.services;

import com.api.CRUD.models.UserModel;
import com.api.CRUD.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Servicio para la gestión de usuarios.
 * Contiene lógica de negocio para operaciones CRUD en usuarios.
 */
@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    /**
     * Obtiene todos los usuarios registrados.
     * @return Lista de todos los usuarios.
     */
    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    /**
     * Guarda un nuevo usuario en la base de datos.
     * @param user Datos del usuario a guardar.
     * @return Usuario guardado.
     */
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    /**
     * Obtiene un usuario por su ID.
     * @param id ID del usuario a buscar.
     * @return Usuario encontrado, envuelto en Optional.
     */
    public Optional<UserModel> getById(Long id) {
        return userRepository.findById(id);
    }

    /**
     * Actualiza un usuario existente por su ID.
     * @param request Datos actualizados del usuario.
     * @param id ID del usuario a actualizar.
     * @return Usuario actualizado.
     */
    public UserModel updateById(UserModel request, Long id) {
        UserModel user = userRepository.findById(id).orElseThrow();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        return user;
    }

    /**
     * Elimina un usuario por su ID.
     * @param id ID del usuario a eliminar.
     * @return true si la eliminación fue exitosa, false en caso contrario.
     */
    public Boolean deleteUser(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
