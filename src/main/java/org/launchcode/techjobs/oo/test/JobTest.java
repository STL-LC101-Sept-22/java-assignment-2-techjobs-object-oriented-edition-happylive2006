package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
//      System.out.println(test_job1.getId());
//      System.out.println(test_job2.getId());
        assertNotEquals(test_job1,test_job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //alt + enter to import class
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        System.out.println(test_job3.getName());
//        System.out.println(test_job3.getEmployer());
//        System.out.println(test_job3.getLocation());
//        System.out.println(test_job3.getPositionType());
//        System.out.println(test_job3.getCoreCompetency());

        //Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field.
        // Your test should have 5 assert statements of each type.

        //objectName instanceof ClassName
        assertTrue(test_job3.getName()instanceof String);
        assertTrue(test_job3.getEmployer()instanceof Employer);
        assertTrue(test_job3.getLocation()instanceof Location);
        assertTrue(test_job3.getPositionType()instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency()instanceof CoreCompetency);

        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        //Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false

        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(test_job3, test_job4);
    }

}
