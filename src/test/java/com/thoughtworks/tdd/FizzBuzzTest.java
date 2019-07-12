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
    @Test
    public void should_say_fizz_when_studentNumber_is_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("fizz");
    }

    @Test
    public void should_say_buzz_when_studentNumber_is_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("buzz");
    }


    @Test
    public void should_say_fizz_when_studentNumber_is_6(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(6);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("fizz");
    }
    @Test
    public void should_say_whizz_when_studentNumber_is_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(7);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("whizz");
    }

    @Test
    public void should_say_buzz_when_studentNumber_is_10(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(10);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("buzz");
    }
    public void should_say_whizz_when_studentNumber_is_14(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(14);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("whizz");
    }

     @Test
    public void should_say_fizzbuzz_when_studentNumber_is_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("fizzbuzz");
    }

    @Test
    public void should_say_fizzwhizz_when_studentNumber_is_21(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz(21);
        //when
        String result = fizzBuzz.say(fizzBuzz.getStudentNumber());
        //then
        assertThat(result).isEqualTo("fizzwhizz");
    }
}
