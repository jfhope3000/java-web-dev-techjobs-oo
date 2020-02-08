package org.launchcode.techjobs_oo.Tests;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
    Job testJobTwo;
    Job testJobThree;

    @Before
    public void jobTest() {
        testJobOne = new Job("Jim", new Employer ("Apple"), new Location ("Kansas City"), new PositionType("Developer"), new CoreCompetency("Java"));
        testJobTwo = new Job("Tim", new Employer ("Google"), new Location ("Lawrence"), new PositionType("Junior Developer"), new CoreCompetency("JavaScript"));
        testJobThree = new Job("Tim", new Employer ("Google"), new Location ("Lawrence"), new PositionType("Junior Developer"), new CoreCompetency("JavaScript"));
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



}
