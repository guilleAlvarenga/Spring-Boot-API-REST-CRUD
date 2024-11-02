package com.api.CRUD.models;

import jakarta.persistence.*;

/**
 * Representa un usuario en la base de datos.
 */
@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    /**
     * Obtiene el ID del usuario.
     * @return ID del usuario.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del usuario.
     * @param id ID del usuario.
     */
    public void setId(Long id) {
        this.id = id;
    }
    // Métodos para acceder y modificar los datos del usuario (firstName, lastName, email)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
