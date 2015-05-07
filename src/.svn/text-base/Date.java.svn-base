public class Date
{
  //a mapping from month numbers to month names
  final private static String [] MONTHS =
    new String [] {"January",
		   "February",
		   "March",
		   "April",
		   "May",
		   "June",
		   "July",
		   "August",
		   "September",
		   "October",
		   "November",
		   "December"};
  
  //the day, month, and year of this date
  private int day_;
  private int month_;
  private int year_;

  public Date(int day, int month, int year)
  {
    day_ = day;
    month_ = month;
    year_ = year;
  }

  public int getDay()
  {
    return day_;
  }

  public int getMonth()
  {
    return month_;
  }

  public int getYear()
  {
    return year_;
  }

  public boolean equals(Object o)
  {
    if (o instanceof Date) {
      Date date = (Date) o;
      return day_ == date.day_ && 
	month_ == date.month_ & 
	year_ == date.year_;
    }
    return false;
  }

  public String toString()
  {
    String result = day_ + " " + MONTHS[month_ - 1] + " " + year_;
    return result;
  }
}
