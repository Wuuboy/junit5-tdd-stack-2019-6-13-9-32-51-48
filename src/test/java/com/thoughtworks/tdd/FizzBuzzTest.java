package com.thoughtworks.tdd;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_say_1_when_studentNumber_is_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void should_say_2_when_studentNumber_is_2(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(2);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("2");
    }

}
