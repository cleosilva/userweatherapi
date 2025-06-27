package com.cleosilva.userweatherapi.repository;

import com.cleosilva.userweatherapi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
