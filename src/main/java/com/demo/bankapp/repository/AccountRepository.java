package com.demo.bankapp.repository;

import com.demo.bankapp.model.Account;
import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends CrudRepository<Account, Integer> {
}
