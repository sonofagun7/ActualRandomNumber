public class RandomNumber
{
	private int Lobound, HiBound;
	
	public RandomNumber()
	{
		Lobound = 1;
		HiBound = 10;
	}
	
	public RandomNumber(int lo,int hi)
	{
		Lobound = 1;
		HiBound = 6;
	}
	
	public int GetANumber_Between_1_and_10()
	{
		int number = 1 + (int)(Math.random()* 10);
		return number;
	}
	
	public int GetANumber(int lo,int hi)
	{
		int number = lo + (int)(Math.random()* hi);
		return number;
	}
	
	public int GetANumber()
	{
		int number = Lobound + (int)(Math.random()* HiBound);
		return number;
	}
}
