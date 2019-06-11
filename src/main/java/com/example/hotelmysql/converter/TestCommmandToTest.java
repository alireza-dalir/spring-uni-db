package com.example.hotelmysql.converter;

import com.example.hotelmysql.commands.TestCommand;
import com.example.hotelmysql.model.Test;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class TestCommmandToTest implements Converter<TestCommand, Test> {

    @Synchronized
    @Nullable
    @Override
    public Test convert(TestCommand testCommand) {
        if (testCommand == null) return null;

        final Test test = new Test();
        test.setAge(testCommand.getAge());
        test.setFName(testCommand.getFName());
        test.setLName(testCommand.getLName());
        return test;
    }
}
