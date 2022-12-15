package com.example.demo.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StudentControllerTest {
    @Test
    void testGetStudents() {
        StudentService studentService = Mockito.mock(StudentService.class);
        when(studentService.getStudents()).thenReturn("Welcome");
        StudentController studentController = new StudentController(studentService);
        assertEquals("Welcome", studentController.getStudents());

    }
}
