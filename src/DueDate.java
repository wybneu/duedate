public class DueDate
{
  private static int [] MONTH_DURATION =  
    new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  private static int [] MONTH_KEYS =  
    new int [] {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

  /**
   * Calculate the due date of item given a loan date and a borrowing
   * period, whilst skipping over weekends.
   */
  public static Date getDueDate(Date loanDate, int period)
  {
    int day = loanDate.getDay();
    int month = loanDate.getMonth();
    int year = loanDate.getYear();

    //months are indexed from 0
    month--;

    int dayOfWeek = dayOfWeek(day, month, year);

    while(period > 0 || dayOfWeek == 0 || dayOfWeek == 6) {
      //decrement loan period only for working days
      if (dayOfWeek != 0 && dayOfWeek != 6) {
	period--;
      }

      if (day < MONTH_DURATION[month]) {
	day++;
      }
      else if (month < 11) {
	day = 1;
	month++;
      }
      else {
	day = 1;
	month = 1;
	year++;
      }
      dayOfWeek = dayOfWeek(day, month, year);
    }

    //months are indexed from 0, so add 1 to make the DueDate
    //interface consistent
    Date dueDate = new Date(day, month + 1, year);
    return dueDate;
  }

  /* 
   * Convert a day, month and year to the day of the week, returning
   * an integer between 0 and 6, inclusive, with 0 indicating Sunday.
   * Precondition: The date must be in the range September 14,
   * 1752 - December 31, 9999.
   */
  private static int dayOfWeek(int day, int month, int year )
  {
    if (month < 3) {
      year -= 1;
    }

    return (year + year/4 - year/100 + year/400 + MONTH_KEYS[month] + day) % 7;
  }
}
