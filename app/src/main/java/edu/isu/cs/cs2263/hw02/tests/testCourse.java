package edu.isu.cs.cs2263.hw02.tests;

import edu.isu.cs.cs2263.hw02.data.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testCourse {

    @Test
    public void testCourseConstructor(){
        Course testCourse1 = new Course();
        assertNotNull(testCourse1);
        //testCourse1.getCode();


        Course testCourse2 = new Course("Test Course", "TEST", 1181, 4);
        assertNotNull(testCourse2);
        assertEquals("Test Course", testCourse2.getName());
        assertEquals("TEST", testCourse2.getCode());
        assertEquals(1181, testCourse2.getNumber());
        assertEquals(4, testCourse2.getCredits());


    }

    @Test
    public void testCourseCode(){
        Course testCourseCode = new Course("Test Course", "TEST", 1181, 4);
        assertEquals("TEST", testCourseCode.getCode());
        testCourseCode.setCode("CHANGED");
        assertEquals("CHANGED", testCourseCode.getCode());
    }

    @Test
    void testTest(){
        assertEquals(1,2);

    }
}
