
public class Lab1Application 
{

	public static void main(String[] args) 
	{
		//Rectangle class
		Rectangle myRectangle = new Rectangle(3, 5);
		int a = myRectangle.calculateArea();
		int p = myRectangle.calculatePerimeter();
		
		System.out.println("The area of the rectangle is " + a + " units squared and the the perimeter is " + p + " units.");
		
		
		//DistanceCalculator class
		
		double distance = DistanceCalculator.calculateDistance(20, 15, 5, 3);
		System.out.println();
		System.out.println("The distance between the two points is " + distance + " units.");
		
		//BasicMath class
		int sum = BasicMath.add(5, 7);
		int diff = BasicMath.subtract(21, 9);
		int product = BasicMath.multiply(3, 6);
		double quotient = BasicMath.divide(100, 10);
		
		System.out.println();
		System.out.println("The sum of 5 and 7 equals " + sum);
		System.out.println("The difference of 21 and 9 equals " + diff);
		System.out.println("The product of 3 and 6 equals " + product);
		System.out.println("The quotient of 100 and 10 equals "+ quotient);
		
		
		//DateManipulator Class
		DateManipulator myYear = new DateManipulator();
		boolean Y = myYear.isLeapYear(2012);
		
		System.out.println();
		System.out.print(Y);
		
	}

}
