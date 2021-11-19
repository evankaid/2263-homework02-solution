package edu.isu.cs.cs2263.hw02.tests;

import edu.isu.cs.cs2263.hw02.data.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testCourse {
    /**
     * Tests the course constructor. The first part checks to see if the default constructor works as intended.
     * The second part checks to see if a parameterized constructor works as intended.
     * @author Kaiden Evans
     */
    @Test
    public void testCourseConstructor(){
        Course testCourse1 = new Course();
        assertNotNull(testCourse1);

        Course testCourse2 = new Course("Test Course", "TEST", 1181, 4);
        assertNotNull(testCourse2);
        assertEquals("Test Course", testCourse2.getName());
        assertEquals("TEST", testCourse2.getCode());
        assertEquals(1181, testCourse2.getNumber());
        assertEquals(4, testCourse2.getCredits());
    }

    /**
     * Creates a new course and tests the name portion of the constructor. First it tests that the testCourseName
     * object has the correct name it was initialized with. Then it changes the name of the object and checks it again.
     * @author Kaiden Evans
     */
    @Test
    public void testCourseName(){
        Course testCourseName = new Course("Test Course", "TEST", 1181, 4);
        assertEquals("Test Course", testCourseName.getName());
        testCourseName.setName("New Test Course");
        assertEquals("New Test Course", testCourseName.getName());
    }

    /**
     * Creates a new course and tests the code portion of the constructor. First it tests that the testCourseCode
     * object has the correct code it was initialized with. Then it changes the code of that object and checks it again.
     * @author Kaiden Evans
     */
    @Test
    public void testCourseCode(){
        Course testCourseCode = new Course("Test Course", "TEST", 1181, 4);
        assertEquals("TEST", testCourseCode.getCode());
        testCourseCode.setCode("CHANGED");
        assertEquals("CHANGED", testCourseCode.getCode());
    }

    /**
     * Creates a new course and tests the number portion of the constructor. First it tests that the testCourseNumber
     * object has the correct number it was initialized with. Then it changes the number of that object and checks it again.
     * @author Kaiden Evans
     */
    @Test
    public void testCourseNumber(){
        Course testCourseNumber = new Course("Test Course", "TEST", 1181, 4);
        assertEquals(1181, testCourseNumber.getNumber());
        testCourseNumber.setNumber(1182);
        assertEquals(1182, testCourseNumber.getNumber());
    }

    /**
     * Creates a new course and tests the credit portion of the constructor. First it tests that the testCourseCredit
     * object has the correct credit it was initialized with. Then it changes the credits of that object and checks it again.
     * @author Kaiden Evans
     */
    @Test
    public void testCourseCredits(){
        Course testCourseCredits = new Course("Test Course", "TEST", 1181, 4);
        assertEquals(4, testCourseCredits.getCredits());
        testCourseCredits.setCredits(2);
        assertEquals(2, testCourseCredits.getCredits());
    }

    @Test
    void testTest(){
        assertEquals(1,2);

    }
}
