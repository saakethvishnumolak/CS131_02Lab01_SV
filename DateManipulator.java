
public class DateManipulator 
{
	public DateManipulator() 
	{
			
	}
	
	public boolean isLeapYear(int year) 
	{
		if((year > 1582 ) && ((year % 4 == 0) && (year % 100 != 0 ) || (year % 400 == 0)))
			return true;
		
		return false;
	
	}
}

