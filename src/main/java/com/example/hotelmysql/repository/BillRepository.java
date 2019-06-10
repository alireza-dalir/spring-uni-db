package com.example.hotelmysql.repository;

import com.example.hotelmysql.model.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill,Long> {
}
