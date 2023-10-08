package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;


public class JobTest {
    //TODO: Create your unit tests here


    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob3 instanceof Job);
        assertEquals("Product tester", testJob3.getName());

        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertEquals("ACME", testJob3.getEmployer().getValue());

        assertTrue(testJob3.getLocation() instanceof Location);
        assertEquals("Desert", testJob3.getLocation().getValue());

        assertTrue(testJob3.getPositionType()instanceof PositionType);
        assertEquals("Quality control", testJob3.getPositionType().getValue());

        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());


    }

    @Test
    public void testJobsForEquality() {
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob4.equals(testJob5));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char letter[] = testJob6.toString().toCharArray();
        assertEquals('\n', letter[letter.length-1]);
        assertEquals('\n', letter[0]);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String checkData = "\nID: " + testJob7.getId() + "\n" +
                "Name: " + testJob7.getName() + "\n" +
                "Employer: " + testJob7.getEmployer() + "\n" +
                "Location: " + testJob7.getLocation() + "\n" +
                "Position Type: " + testJob7.getPositionType() + "\n" +
                "Core Competency: " + testJob7.getCoreCompetency() + "\n";
        assertEquals(testJob7.toString(), checkData);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob8 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + testJob8.getId() + "\n" +
                "Name: " + testJob8.getName() + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + testJob8.getLocation() + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + testJob8.getCoreCompetency() + "\n", testJob8.toString());
    }
}

