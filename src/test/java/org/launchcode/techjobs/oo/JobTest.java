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
}
