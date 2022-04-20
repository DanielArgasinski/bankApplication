package com.demo.bankapp.repository;

import com.demo.bankapp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Integer> {
}
