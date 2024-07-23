package com.example.restApi;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * To handle database operations
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

