package ru.valerik.repository;

import org.springframework.data.repository.CrudRepository;
import ru.valerik.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
