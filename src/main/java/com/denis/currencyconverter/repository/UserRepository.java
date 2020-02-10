package com.denis.currencyconverter.repository;

import com.denis.currencyconverter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
