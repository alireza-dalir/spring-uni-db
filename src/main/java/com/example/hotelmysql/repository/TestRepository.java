package com.example.hotelmysql.repository;

import com.example.hotelmysql.model.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Test,Long> {
}
