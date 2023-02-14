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
       // assertNotEquals(test_job3, test_job4);
        assertFalse(test_job3.getId() ==test_job4.getId());
    }

//    ID:  _______
//    Name: _______
//    Employer: _______
//    Location: _______
//    Position Type: _______
//    Core Competency: _______

    // When passed a Job object, it should return a string that contains a blank line before and after the job information.
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //test that the first character of the string returned by the toString method is a newline character.

        assertEquals('\n',test_job3.toString().charAt(0));
        //System.out.println(test_job3.toString());


        // test that the last character of the string returned by the toString method is a newline character.

       assertEquals('\n', test_job3.toString().charAt(test_job3.toString().length() - 1));

    }

    //The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       //To verify that the string returned by `toString` is as expected
        assertEquals("\nID: " + test_job3.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n" , test_job3.toString());
    }



    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job3 = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
      assertEquals("\nID: " + test_job3.getId() + "\nName: Product tester\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n" , test_job3.toString()) ;

//        System.out.println(test_job3.getEmployer().getValue());
//        System.out.println(test_job3.getLocation().getValue());
//        System.out.println(test_job3.getPositionType().getValue());
//        System.out.println(test_job3.getCoreCompetency().getValue());
//        System.out.println(test_job3.toString());
//        System.out.println(test_job3.getName());

    }


}


