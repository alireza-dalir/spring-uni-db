package com.example.hotelmysql.service.springDataJpa;

import com.example.hotelmysql.commands.TestCommand;
import com.example.hotelmysql.converter.TestCommmandToTest;
import com.example.hotelmysql.converter.TestToTestCommand;
import com.example.hotelmysql.model.Test;
import com.example.hotelmysql.repository.TestRepository;
import com.example.hotelmysql.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class TestSDJpaService implements TestService {

    private final TestRepository testRepository;
    private final TestToTestCommand testToTestCommand;
    private final TestCommmandToTest testCommmandToTest;

    public TestSDJpaService(TestRepository testRepository, TestToTestCommand testToTestCommand, TestCommmandToTest testCommmandToTest) {
        this.testRepository = testRepository;
        this.testToTestCommand = testToTestCommand;
        this.testCommmandToTest = testCommmandToTest;
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
    @Transactional
    public TestCommand findCommandById(Long aLong) {
        return testToTestCommand.convert(findById(aLong));
    }

    @Override
    @Transactional
    public TestCommand saveTestCommand(TestCommand testCommand) {
        Test test = testCommmandToTest.convert(testCommand);

        Test savedTest =testRepository.save(test);
        log.debug("saved test id : " ,savedTest.getId());
        return testToTestCommand.convert(savedTest);
    }

    @Override
    public void deleteById(Long aLong) {
        testRepository.deleteById(aLong);
    }
}
