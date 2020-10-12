
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

public class Circle
{
   private final double pi=3.14159;
private double radius;

public Circle()
{
   radius = 0.0;
}

public Circle(double r)
{
   radius = r;
}
 
public void serRadius(double r)
{
   radius = r;
}

public double getRadius()
{
   return radius;
}

public double getArea()
{
  return pi* radius* radius;
}

public double getDiameter()
{
   return radius*2;
}

public double getCircumference()
{
   return 2*pi*radius;
}


public static void main( String args[])
{
   double radius;
   Scanner sc = new Scanner(System.in);

System.out.println("Enter radius:");
radius = sc.nextDouble();

Circle myCircle = new Circle(radius);
// circle = myCircle.getArea();

System.out.println(" area is:" + myCircle.getArea());

System.out.println(" diameter is:" + myCircle.getDiameter());

System.out.println(" circumference is:" + myCircle.getCircumference());


}
}