/**
 *
 */
public class DueDateDriver {
    
  public static void main(String[] args) 
  {
    //parse the command line
    int day = Integer.parseInt(args[0]);
    int month = Integer.parseInt(args[1]);
    int year = Integer.parseInt(args[2]);
    int period = Integer.parseInt(args[3]);

    Date loanDate = new Date(day, month, year);

    //get the due date of the item
    Date dueDate = DueDate.getDueDate(loanDate, period);

    System.out.println("Due date is " + dueDate);
  }
}
