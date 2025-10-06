

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testBmiWerter_mann_untergewichtig()
    {
        Student student=new Student("xyz", 10f, 200, 'm');
        assertEquals("Untergewicht", student.bmi_werter());
    }
    
        @Test
    public void testBmiWerter_mann_normalgewicht()
    {
        Student student=new Student("xyz", 68f, 168, 'm');
        assertEquals("Normal", student.bmi_werter());
    }
    
        @Test
    public void testBmiWerter_mann_übergewichtig()
    {
        Student student=new Student("xyz", 150f, 175, 'm');
        assertEquals("Übergewicht", student.bmi_werter());
    }
    
        @Test
    public void testBmiWerter_frau_untergewichtig()
    {
        Student student=new Student("xyz", 10f, 200, 'f');
        assertEquals("Untergewicht", student.bmi_werter());
    }
    
        @Test
    public void testBmiWerter_frau_normalgewicht()
    {
        Student student=new Student("xyz", 68f, 169, 'f');
        assertEquals("Normal", student.bmi_werter());
    }
    
        @Test
    public void testBmiWerter_frau_übergewichtig()
    {
        Student student=new Student("xyz", 150f, 175, 'f');
        assertEquals("Übergewicht", student.bmi_werter());
    }
}