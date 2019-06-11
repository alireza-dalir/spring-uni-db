package com.example.hotelmysql.service;

import com.example.hotelmysql.commands.TestCommand;
import com.example.hotelmysql.model.Test;

public interface TestService extends CrudService<Test,Long> {

    TestCommand findCommandById(Long aLong);
    TestCommand saveTestCommand(TestCommand testCommand);

}
