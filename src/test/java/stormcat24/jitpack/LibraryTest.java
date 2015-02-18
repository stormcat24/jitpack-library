package stormcat24.jitpack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author stormcat24
 */
public class LibraryTest {

    @Test
    public void testFoo() {
        Assert.assertEquals(Library.foo(), "foo");
    }

    @Test
    public void testBar() {
        Assert.assertEquals(Library.bar(), "fail");
    }

}
