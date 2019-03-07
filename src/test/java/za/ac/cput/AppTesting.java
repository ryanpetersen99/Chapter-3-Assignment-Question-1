package za.ac.cput;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for simple ObjectEquality.
 */
public class AppTesting
{
    /**
     * Rigorous AppTesting :-)
     */
    @org.junit.Test
    public void ObjectEqualityTest(){
        ObjectEquality OE = new ObjectEquality();
        Assert.assertEquals(OE.result1(),OE.result2());
    }

    @org.junit.Test
    public  void  ObjectIdentity(){
        ObjectIdentity OI = new ObjectIdentity();
        Assert.assertSame(OI.Nissan(),OI.Honda());
        Assert.assertNotSame(OI.Nissan(),OI.BMW());
    }

    @Test
    public void FailingTest() {
        FailingTest FT = new FailingTest();
        try {
            FT.Integer();
            fail("failed");
        } catch (NullPointerException e) {

        }
    }

        @Ignore
        public void DisablingTest() {
            DisablingTest dt = new DisablingTest();
            List list = new ArrayList();
            list.add("March");
            list.add("May");
            list.add("June");
            assertEquals(list,dt.Months());
            }

    }


