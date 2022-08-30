package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    //public String message;

    public StudentNotFoundException(String message) {
        super(message);
    }

//    @Override
//    public String getMessage() {
//        return message;
//    }

}
