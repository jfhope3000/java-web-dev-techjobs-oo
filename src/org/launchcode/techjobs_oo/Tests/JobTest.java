package org.launchcode.techjobs_oo.Tests;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs_oo.*;

@RunWith(JUnit4.class)
public class JobTest {

    Job testJobOne;
    Job testJobTwo = new Job("Tim", new Employer ("Google"), new Location ("Lawrence"), new PositionType("Junior Developer"), new CoreCompetency("JavaScript"));
    Job testJobThree;
    Job testJobNull;

    @Before
    public void jobTest() {
        testJobOne = new Job("Jim", new Employer ("Apple"), new Location ("Kansas City"), new PositionType("Developer"), new CoreCompetency("Java"));
        //testJobTwo = new Job("Tim", new Employer ("Google"), new Location ("Lawrence"), new PositionType("Junior Developer"), new CoreCompetency("JavaScript"));
        testJobThree = new Job("Tim", new Employer ("Google"), new Location ("Lawrence"), new PositionType("Junior Developer"), new CoreCompetency("JavaScript"));
        testJobNull = new Job( "", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId() {
        assertTrue( testJobOne.getId() != testJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJobThree instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse( testJobTwo.getId() == testJobThree.getId());
    }

    @Test
    public void toStringOne() {
        String jobDataTest = "\nID: " + testJobTwo.getId() + "\nName: " + testJobTwo.getName() + "\nEmployer: " + testJobTwo.getEmployer() + "\nLocation: " + testJobTwo.getLocation() + "\nPosition Type: " + testJobTwo.getPositionType() + "\nCore Competency: " + testJobTwo.getCoreCompetency() + "\n";
        assertEquals(jobDataTest, testJobTwo.toString());
    }

    @Test
    public void emptyValue() {
        String jobExpected = "\nID: " + "4" + "\nName: " + "Data not available" + "\nEmployer: " + "Data not available" + "\nLocation: " + "Data not available" + "\nPosition Type: " + "Data not available" + "\nCore Competency: " + "Data not available" + "\n";
        String jobActual = testJobNull.toString();
        assertEquals(jobActual, jobExpected);
    }
}
