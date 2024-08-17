//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
  public static void main (String[] args) {
	
	double pi = 3.14159;
	
	double radius = 0.0;
	
	Scanner numScanner = new Scanner(System.in);
	
	System.out.println("Enter the radius:");
		radius = numScanner.nextDouble();
	
	double diameter = radius*2;
	
	double circumference = pi*diameter;
	double area = pi*radius*radius;
	
	System.out.println("The Radius of the circle = " + radius);
	System.out.println("The Diameter of the circle = " + diameter);
	System.out.println("The Area of the circle = " + area);
	System.out.println("The Circumference of the circle = " + circumference);
}
}
//Paste console output below:
/*


*/
