//import stuff here!

import java.util.Scanner;
//Your code here
public class Program6 {
  public static void main (String[] args) {
	
	final double pi = 3.14159;
	
	double radius = 0.0;
	
	Scanner numScanner = new Scanner(System.in);
	
	System.out.println("Enter the radius:");
                radius = numScanner.nextDouble();
	
	double diameter = radius*2;
	
	double circumference = pi*diameter*1000;
	double circumference2 = Math.round(circumference);
	double circumference3 = circumference2/1000;
	
	double area = pi*radius*radius*1000;
	double area2 = Math.round(area);
	double area3 = area2/1000;
	
	System.out.println("The Radius of the circle = " + radius);
	System.out.println("The Diameter of the circle = " + diameter);
	System.out.println("The Area of the circle = " + area3);
	System.out.println("The Circumference of the circle = " + circumference3);
}
}


//Paste console output below:
/*
Enter the radius:
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Circumference of the circle = 23.323

*/
