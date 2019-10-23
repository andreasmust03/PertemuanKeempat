import java.util.*;

public class BisectionalMethod
{
	
	static final float EPSILON = (float) 0.0001;
	
	public static void main(String[] args)
	{
		double a = -3, b = 1;
		bisection(a, b);
	}
	
	static double func(double x) {
		return Math.pow(x,2) + 4 * x + 2;
	}
	
	static void bisection(double a, double b) {
		if (func(a) * func(b) >= 0){
			System.out.println("You have not assumed " + "right a and b");
			return;
		}
		double c = a;
		while ((b - a) >= EPSILON){
			c = (a + b) / 2;
			
			if (func(c) == 0){
				break;
			} else if (func(c) * func(a) < 0){
				b = c;
			} else {
				a = c;
			}
			System.out.printf("The value of root is : %.4f\n", c);
		}
	}
}
