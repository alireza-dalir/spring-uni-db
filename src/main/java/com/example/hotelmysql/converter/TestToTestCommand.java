package com.example.hotelmysql.converter;

import com.example.hotelmysql.commands.TestCommand;
import com.example.hotelmysql.model.Test;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class TestToTestCommand implements Converter<Test, TestCommand> {

    @Synchronized
    @Nullable
    @Override
    public TestCommand convert(Test test) {
        if (test == null)   return null;

        final TestCommand testCommand = new TestCommand();
        testCommand.setAge(test.getAge());
        testCommand.setFName(test.getFName());
        testCommand.setLName(test.getLName());
        return testCommand;
    }
}
