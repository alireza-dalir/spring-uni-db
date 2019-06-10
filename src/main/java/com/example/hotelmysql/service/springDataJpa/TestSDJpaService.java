package com.example.hotelmysql.service.springDataJpa;

import com.example.hotelmysql.model.Test;
import com.example.hotelmysql.repository.TestRepository;
import com.example.hotelmysql.service.TestService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class TestSDJpaService implements TestService {

    private final TestRepository testRepository;

    public TestSDJpaService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Set<Test> findAll() {
        Set<Test> tests = new HashSet<>();
        testRepository.findAll().forEach(tests::add);
        return tests;
    }

    @Override
    public Test findById(Long aLong) {
        return testRepository.findById(aLong).orElse(null);
    }

    @Override
    public Test save(Test object) {
        return testRepository.save(object);
    }

    @Override
    public void delete(Test test) {
        testRepository.delete(test);
    }

    @Override
    public void deleteById(Long aLong) {
        testRepository.deleteById(aLong);
    }
}
