/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class car {
     public int yearModel;
   public String make;
   public int speed1;

   public  car(int model,String carMake)
{
   yearModel =  model;
  make = carMake;
 speed1 = 0;
 
}

public void setyearModel(int model)
{
    yearModel = model;
 }

public void setMake(String carMake)
{
    make = carMake;
 }

public void setSpeed(int carSpeed)
{
    speed1 = carSpeed;
 }

public int getyearModel()
{
   return yearModel;
}

public String getMake()
{
   return make;
}

public int getSpeed()
{
   return speed1;
}

public void acceleration ()
{
    speed1= speed1+5;
}

public void breaks()
{
  speed1 = speed1-5;
  
}

    
}
