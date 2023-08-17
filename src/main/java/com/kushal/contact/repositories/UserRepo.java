package com.kushal.contact.repositories;

import com.kushal.contact.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
