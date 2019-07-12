package com.thoughtworks.tdd;

public class FizzBuzz {
    private int studentNumber;

    public FizzBuzz(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String say(int studentNumber) {
        if (studentNumber%3==0 && studentNumber%5==0 ){
            return "fizzbuzz";
        }else if(studentNumber%3==0&studentNumber%7==0) {
            return "fizzwhizz";
        } else if (studentNumber%5==0 && studentNumber%7==0 ){
            return "buzzwhizz";
        } else if (studentNumber%3==0){
            return "fizz";
        }else if(studentNumber%5==0){
            return "buzz";
        }else if(studentNumber%7==0){
            return "whizz";
        }
        else {
            return String .valueOf(studentNumber) ;
        }

    }

//    public String say(int studentNumber) {
//        if (studentNumber>=1&& studentNumber<=120){
//            if (studentNumber%3==0 &&studentNumber%5==0 && studentNumber%7==0 ){
//                return "fizzbuzzwhizz";
//            } else if (studentNumber%3==0 && studentNumber%5==0 ){
//                return "fizzbuzz";
//            } else if (studentNumber%3==0 && studentNumber%7==0 ){
//                return "fizzwhizz";
//            } else if (studentNumber%5==0 && studentNumber%7==0 ){
//                return "buzzwhizz";
//            } else if (studentNumber%3==0){
//                return "fizz";
//            } else if (studentNumber%5==0){
//                return "buzz";
//            } else if (studentNumber%7==0){
//                return "whizz";
//            }else {
//                return String.valueOf(studentNumber);
//            }
//    }else {
//        return "查无此人！";
//    }
//    }
}
