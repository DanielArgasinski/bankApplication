package com.demo.bankapp.repository;

import com.demo.bankapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
