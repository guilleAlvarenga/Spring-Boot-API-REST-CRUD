package com.api.CRUD.controllers;

import com.api.CRUD.models.UserModel;
import com.api.CRUD.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Controlador REST para la gestión de usuarios.
 * Define los endpoints para operaciones CRUD.
 */
@RestController
@RequestMapping("${api.prefix}/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * Endpoint para obtener todos los usuarios.
     * @return Lista de usuarios.
     */
    @GetMapping
    public ArrayList<UserModel> getUsers() {
        return this.userService.getUsers();
    }

    /**
     * Endpoint para guardar un nuevo usuario.
     * @param user Datos del usuario a guardar.
     * @return Usuario guardado.
     */
    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    /**
     * Endpoint para obtener un usuario por su ID.
     * @param id ID del usuario a obtener.
     * @return Usuario encontrado.
     */
    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id) {
        return this.userService.getById(id);
    }

    /**
     * Endpoint para actualizar un usuario por su ID.
     * @param request Datos del usuario a actualizar.
     * @param id ID del usuario.
     * @return Usuario actualizado.
     */
    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request, @PathVariable("id") Long id) {
        return this.userService.updateById(request, id);
    }

    /**
     * Endpoint para eliminar un usuario por su ID.
     * @param id ID del usuario a eliminar.
     * @return Mensaje de resultado de la operación.
     */
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.userService.deleteUser(id);
        if (ok) {
            return "User with id " + id + " deleted";
        } else {
            return "Error, we have a problem and can't delete user ";
        }
    }
}
