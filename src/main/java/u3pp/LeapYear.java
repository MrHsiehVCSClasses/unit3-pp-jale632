package u3pp;

/**
 * YOUR COMMENTs HERE
 * 
 * @author //YOUR NAME HERE
 * Jaesung Lee
 */

public class LeapYear {
	/**
	 * YOUR COMMENTS HERE
	 */
	public static boolean isLeapYear(int year) {
		/* YOUR CODE HERE */
		if (year > 1582)
		{
			if (year % 100 != 0)
			{
				if (year % 4 == 0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else if (year % 400 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}
