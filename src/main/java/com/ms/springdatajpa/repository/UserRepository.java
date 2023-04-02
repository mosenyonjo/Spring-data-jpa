package com.ms.springdatajpa.repository;

import com.ms.springdatajpa.modal.Employee;
import com.ms.springdatajpa.modal.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository  extends CrudRepository<User, Long> {
    List<User> findUsersByLastNameContaining(String str);

}

