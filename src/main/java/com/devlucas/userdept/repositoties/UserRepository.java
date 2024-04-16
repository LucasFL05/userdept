package com.devlucas.userdept.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucas.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
