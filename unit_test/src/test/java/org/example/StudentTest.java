package org.example;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Student student = new Student("Ali",19);
        assertEquals("Ali",student.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Student student = new Student("Asatbek",19);
        assertEquals("Asatbek",student.getName());


    }
    @org.junit.jupiter.api.Test
    void setNameIfEmpty() {
        Student student = new Student("",19);
        student.setName("Asatbek");
        assertEquals("Asatbek",student.getName());


    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}