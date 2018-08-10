package ru.valerik.repository;

import org.springframework.data.repository.CrudRepository;
import ru.valerik.model.SomeUser;

public interface UserRepository extends CrudRepository<SomeUser, Long> {
}
