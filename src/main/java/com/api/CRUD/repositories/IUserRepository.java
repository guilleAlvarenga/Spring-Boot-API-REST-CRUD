package com.api.CRUD.repositories;

import com.api.CRUD.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para realizar operaciones CRUD en la entidad UserModel.
 */
@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}
