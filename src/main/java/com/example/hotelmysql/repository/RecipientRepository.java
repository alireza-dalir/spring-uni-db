package com.example.hotelmysql.repository;

import com.example.hotelmysql.model.Recipient;
import org.springframework.data.repository.CrudRepository;

public interface RecipientRepository extends CrudRepository<Recipient,Long> {
}
