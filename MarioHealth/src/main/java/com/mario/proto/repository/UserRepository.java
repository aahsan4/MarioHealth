package com.mario.proto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mario.proto.data.User;

/**
 * Repository for Medicines
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
