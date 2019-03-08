package za.ac.cput;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 *Ryan Petersen
 * 217027806
 * 3G
 * Chapter3 Question 1
 */
public class AppTesting
{
    /**
     * Rigorous AppTesting :-)
     */
    @Test
    public void ObjectEqualityTest(){
        ObjectEquality OE = new ObjectEquality();
        Assert.assertEquals(OE.result1(),OE.result2());
    }

    @Test
    public  void  ObjectIdentity(){
        ObjectIdentity OI = new ObjectIdentity();
        Assert.assertSame(OI.Nissan(),OI.Honda());
        Assert.assertNotSame(OI.Nissan(),OI.BMW());
    }

    @Test
    public void FailingTest() {
        FailingTest FT = new FailingTest();
        fail("The test has failed");
        Assert.assertEquals(212,FT.Calculation());
    }

        @Ignore
        public void DisablingTest() {
            DisablingTest dt = new DisablingTest();
            List<String> actualList = dt.Months();
            assertThat(actualList.size(), is(12));
            }

        @Test(timeout = 1000)
        public void Timeout() throws InterruptedException {
        Timeout to = new Timeout();
        assertThat(to.InterestCalucation(),is(8.771929824561404));
            }

    }


