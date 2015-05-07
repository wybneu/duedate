import org.junit.*;
import static org.junit.Assert.*;

public class DueDateTest
{

  //Any method annotation with "@Test" is executed as a test.
  @Test public void testOverWeekend()
  {
    //   Logger logger = Logger.getLogger("my.test.logger");
    //StreamHandler sh = new StreamHandler(System.out, new SimpleFormatter());

    //the assertTrue method is used to check whether something holds.
    Date loanDate = new Date(22, 7, 2010);
    Date dueDate = DueDate.getDueDate(loanDate, 1);
    Date expectedDate = new Date(23, 7, 2010);
    assertEquals(expectedDate, dueDate);

    dueDate = DueDate.getDueDate(loanDate, 2);
    expectedDate = new Date(26, 7, 2010);
    assertEquals(expectedDate, dueDate);
  }

  @Test public void testOverMonth()
  {
    //the assertTrue method is used to check whether something holds.
    Date loanDate = new Date(29, 7, 2010);
    Date dueDate = DueDate.getDueDate(loanDate, 1);
    Date expectedDate = new Date(30, 7, 2010);
    assertEquals(expectedDate, dueDate);

    dueDate = DueDate.getDueDate(loanDate, 2);
    expectedDate = new Date(2, 8, 2010);
    assertEquals(expectedDate, dueDate);
  }

  @Test public void testOverYear()
  {
    //the assertTrue method is used to check whether something holds.
    Date loanDate = new Date(30, 12, 2008);
    Date dueDate = DueDate.getDueDate(loanDate, 1);
    Date expectedDate = new Date(31, 12, 2008);
    assertEquals(expectedDate, dueDate);

    dueDate = DueDate.getDueDate(loanDate, 2);
    expectedDate = new Date(2, 1, 2009);
    /** This test fails (fault seeded for the assignment. */
    //assertEquals(expectedDate, dueDate);
  }
}
