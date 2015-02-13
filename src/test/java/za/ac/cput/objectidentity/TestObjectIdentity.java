package za.ac.cput.objectidentity;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by student on 2015/02/12.
 */
public class TestObjectIdentity extends TestCase {
    public void testIdentity() throws Exception{
        ObjectIdentity obj1 = new ObjectIdentity(5);
        ObjectIdentity obj2 = obj1;

        Assert.assertTrue("Checking Object Identity", obj1 == obj2);
    }
}
