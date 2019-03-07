package za.ac.cput;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

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

  /*  @org.junit.Test
    public void FailingTest(){
        FailingTest FT = new FailingTest();
      try{
          FT.list();
          fail("Excepted an empty array list");
      }
      catch (NullPointerException e){
        } */


    }

