package com.uedge.lab9.service;

import com.uedge.lab9.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User, Long> {

}
