/*
Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and 
Cone from it. The class ThreeDObject has methods wholeSurfaceArea () and volume (). 
Override these two methods in each of the derived classes to calculate the volume 
and whole surface area of each type of three-dimensional objects. The dimensions of 
the objects are to be taken from the users and passed through the respective 
constructors of each derived class. Write a main method to test these classes.
*/

import java.util.Scanner;
import java.lang.Math;

abstract class ThreeDObject
{
  abstract void wholeSurfaceArea();
  abstract void volume();
  void hi()
  {
    System.out.println("hi() method of "+this.getClass());
  }
}

class Box extends ThreeDObject
{
  double l,b,h;
  Box(double length, double width, double height)
  {
    l=length;
    b=width;
    h=height;
  }
  
  @Override
  void wholeSurfaceArea() // method overriding
  {
    this.hi();
    double a=2*((l*b)+(b*h)+(l*h));
    System.out.println("The whole surface area of the Box is " + a);
  }
  @Override
  void volume() // method overriding
  {
    double v=l*b*h;
    System.out.println("The volume of the Box is " + v+"\n");
  }
}

class Cube extends ThreeDObject
{
  double s;
  Cube(double side)
  {
    s=side;
  }
  @Override
  void wholeSurfaceArea() // method overriding
  {
    double a=6*s*s;
    System.out.println("The whole surface area of the Cube is " + a);
  }
  @Override
  void volume() // method overriding
  {
    double v=s*s*s;
    System.out.println("The volume of the Cube is " + v+"\n");
  }
}


class Cylinder extends ThreeDObject
{
  final static double PI = Math.PI;
  double r,h;
  Cylinder(double radius, double hight)
  {
    r=radius;
    h=hight;
  }
  @Override
  void wholeSurfaceArea() // method overriding
  {
    double a=2*PI*r*(h+r);
    System.out.println("The whole surface area of the Cylinder is " + a);
  }
  @Override
  void volume() // method overriding
  {
    double v=PI*r*r*h;
    System.out.println("The volume of the Cylinder is " + v+"\n");
  }
}


class Cone extends ThreeDObject
{
  final static double PI = 3.14159D;
  double r,h;
  Cone(double radius, double height)
  {
    r=radius;
    h=height;
  }
  @Override
  void wholeSurfaceArea() // method overriding
  {
    double length = Math.sqrt(Math.pow(h,2)+Math.pow(r,2));
    double a=Math.PI*r*(r+length);
    System.out.println("The whole surface area of the Cylinder is " + a);
  }
  @Override
  void volume() // method overriding
  {
    double v=PI*r*r*h/3;
    System.out.println("The volume of the Cylinder is " + v+"\n");
  }
}

class TestThreeDObject
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    // ThreeDObject b = new ThreeDObject(); we cannot create an object of an abstract class
    ThreeDObject obj;

    // for Box
    System.out.print("Enter the length of the Box: ");
    double l=sc.nextDouble();   
    System.out.print("Enter the breadth of the Box: ");
    double b=sc.nextDouble();
    System.out.print("Enter the height of the Box: ");
    double h=sc.nextDouble();

    obj = new Box(l,b,h); // Now obj refers to a Box object
    obj.wholeSurfaceArea(); // The wholeSurfaceArea() of Box class is called
    obj.volume();           // The volume() of Box class is called

    // for Cube
    System.out.print("Enter the side of the Cube: ");
    double s=sc.nextDouble();   

    obj = new Cube(s); // Now obj refers to a Cube object
    obj.wholeSurfaceArea(); // The wholeSurfaceArea() of Cube class is called
    obj.volume();           // The volume() of Cube class is called

    // for Cylinder
    System.out.print("Enter the radius of the Cylinder: ");
    double r=sc.nextDouble();
    System.out.print("Enter the height of the Cylinder: ");
    h=sc.nextDouble();   

    obj = new Cylinder(r,h); // Now obj refers to a Cylinder object
    obj.wholeSurfaceArea(); // The wholeSurfaceArea() of Cylinder class is called
    obj.volume();           // The volume() of Cylinder class is called

    // for Cone
    System.out.print("Enter the radius of the Cone: ");
    r=sc.nextDouble();
    System.out.print("Enter the height of the Cone: ");
    h=sc.nextDouble();   

    obj = new Cone(r,h); // Now obj refers to a Cone object
    obj.wholeSurfaceArea(); // The wholeSurfaceArea() of Cone class is called
    obj.volume();           // The volume() of Cone class is called
  }
} 
