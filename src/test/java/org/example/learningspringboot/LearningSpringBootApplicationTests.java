package org.example.learningspringboot;

import org.example.learningspringboot.entities.Student;
import org.example.learningspringboot.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LearningSpringBootApplicationTests {

    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void testStudent(){
        Student student = new Student();
        student.setId(1L);
        student.setName("Gourav");
        student.setScore(83);
        studentRepository.save(student);

        Student savedStudent = studentRepository.findById(1L).get();
        assertNotNull(savedStudent);
    }

}
