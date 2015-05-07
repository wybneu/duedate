import java.util.List;
import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class SimpleTest
{
  //Any method annotated with "@Before" will be executed before each test,
  //allowing the tester to set up some shared resources.
  @Before public void setUp()
  {
  }

  //Any method annotated with "@After" will be executed after each test,
  //allowing the tester to release any shared resources used in the setup.
  @After public void tearDown()
  {
  }

  //Any method annotation with "@Test" is executed as a test.
  @Test public void aTest()
  {
    //the assertEquals method used to check whether two values are
    //equal, using the equals method
    final int expected = 2;
    final int actual = 1 + 1;
    assertEquals(expected, actual);
  }

  @Test public void anotherTest()
  {
    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");

    //the assertTrue method is used to check whether something holds.
    assertTrue(list.contains("a"));
  }

  //To test an exception, specify the expected exception after the @Test
  @Test(expected = java.io.IOException.class) 
    public void anExceptionTest()
    throws Throwable
  {
    throw new java.io.IOException();
  }

  //to provide additional feedback when a test fails, an error message
  //can be included
  @Test public void aFailedTest()
  {
    //include a message for better feedback
    final int expected = 2;
    final int actual = 1 + 2;
    assertEquals("Some failure message", expected, actual);
  }

  //testing the two dates are equal
  @Test public void testDates()
  {
    Date date1 = new Date(1, 8, 2011);
    Date date2 = new Date(1, 8, 2011);
    assertEquals(date1, date1);

    //note that assertEquals using the .equals method to compare 2 objects.
    //to test that two variables reference the same object, use assertSame
    //or assertNotSame to test they are different objects.
    Date date3 = date1;
    assertSame(date1, date3);
    assertNotSame(date1, date2);
  }
}
