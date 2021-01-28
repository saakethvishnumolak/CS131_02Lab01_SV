
public class DistanceCalculator 
{
	DistanceCalculator() 
	{
		
	}
	
	public static double calculateDistance(int x, int y, int a, int b) 
	{
		double distance = Math.sqrt(Math.pow(x-a, 2)+Math.pow(y-b, 2));
		return distance;
	}

}
