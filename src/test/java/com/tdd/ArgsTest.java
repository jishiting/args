package com.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArgsTest {
    @Test
    public void should_show_result_when_given_the_input(){
        String inputString = "-l -p 8080 -d /usr/logs";
        String argsConfig = "l boolean;p int;d String";
        ArgsParser argsParser = new ArgsParser(new ArgsSchema(argsConfig),inputString);
        assertThat(argsParser.argsOf("l"), is(false));
    }
}
