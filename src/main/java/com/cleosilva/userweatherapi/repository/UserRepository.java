package com.cleosilva.userweatherapi.repository;

import com.cleosilva.userweatherapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
