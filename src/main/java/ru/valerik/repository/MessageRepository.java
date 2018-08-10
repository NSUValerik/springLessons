package ru.valerik.repository;

import org.springframework.data.repository.CrudRepository;
import ru.valerik.model.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
    Iterable<Message> findByTag(String tag);
}
