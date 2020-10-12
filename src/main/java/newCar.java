
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


public class newCar
{
   public static void main (String args[])
{
   int yearModel = 0;
   int speed = 0;
   String make=null;

  Scanner sc = new Scanner (System.in);
Car myCar = new Car(yearModel,make);
System.out.println("Enter year of car:");
yearModel = sc.nextInt();

System.out.println("Enter make of car:");
make = sc.nextLine(); 

System.out.println("Enter speed of car:");
speed = sc.nextInt();

for(int i=0; i<5; i++)
{
   myCar.acceleration(speed);
   System.out.println(" car speed is:" +speed);
}

for(int i=0; i<5; i++)
{
   myCar.break(speed);
   System.out.println(" car speed is:" +speed);
}

}
}