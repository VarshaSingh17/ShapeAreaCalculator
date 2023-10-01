import java.util.Scanner;

abstract class Shape
{
    float area;
    abstract public void input();
    abstract public void computed();
    public void disp()
     {
        System.out.println("------------------------------------------------------");
        System.out.println("        ------- The Area is " + area + " -------");
        System.out.println("------------------------------------------------------");
     }
}
class Rectangle extends Shape
{
   float length;
   float breath;

   public void input()
   {
    System.out.println(" ");
    System.out.println("------------------------------------------------------");
    System.out.println("    ------ Calculation of area of Rectangle ------");
    System.out.println("------------------------------------------------------");
    Scanner s=new Scanner(System.in);
    System.out.println("      ** Please Enter the Length of Rectangle **");
    length=s.nextFloat();
    System.out.println("      ** Please Enter the Breath of recatngle **");
    breath=s.nextFloat();
    
   }

   public void computed()
   {
    area=length*breath;
   }
}
class Square extends Shape
{
   float length;

   public void input()
   {
    System.out.println(" ");
    System.out.println("------------------------------------------------------");
    System.out.println("   ------ Calculation of area of Square ------");
    System.out.println("------------------------------------------------------");
    Scanner s=new Scanner(System.in);
    System.out.println("        ** Please Enter the Length of Square **");
    length=s.nextFloat();
    
   }
   public void computed()
   {
    area=length*length;
   }
}
class Circle extends Shape
{
   float radius;

   public void input()
   {
    System.out.println(" ");
    System.out.println("------------------------------------------------------");
    System.out.println("    ------- Calculation of area of Circle ------");
    System.out.println("------------------------------------------------------");
    Scanner s=new Scanner(System.in);
    System.out.println("        ** Please Enter the Radius of Circle **");
    radius=s.nextFloat();
   }

   public void computed()
   {
    area=3.14f*radius*radius;
   }
}
class Triangle extends Shape
{
   float base;
   float height;

   public void input()
   {
    System.out.println(" ");
    System.out.println("------------------------------------------------------");
    System.out.println("    ------ Calculation of area of Triangle------");
    System.out.println("------------------------------------------------------");
    Scanner s=new Scanner(System.in);
    System.out.println("      ** Please Enter the Base of Triangle **");
    base=s.nextFloat();
    System.out.println("      ** Please Enter the Height of Triangle **");
    height=s.nextFloat();
   }
   public void computed()
   {
    area=0.5f*base*height;
   }
}

class Rhombus extends Shape
{
   float diagonal1;
   float diagonal2;

   public void input()
   {
    System.out.println(" ");
    System.out.println("------------------------------------------------------");
    System.out.println("    ------ Calculation of area of Rhombus ------");
    System.out.println("------------------------------------------------------");
    Scanner s=new Scanner(System.in);
    System.out.println("      ** Please Enter the Diagonal 1 of Rhombus **");
    diagonal1=s.nextFloat();
    System.out.println("      ** Please Enter the Diagonal 2 of Rhombus **");
    diagonal2=s.nextFloat();
   }
   public void computed()
   {
    area=0.5f*diagonal1*diagonal2;
   }
}

   class Trapezium extends Shape
{
   float base1;
   float base2;
   float height;

   public void input()
   {
    System.out.println(" ");
    System.out.println("------------------------------------------------------");
    System.out.println("    ------ Calculation of area of Trapezium ------");
    System.out.println("------------------------------------------------------");
    Scanner s=new Scanner(System.in);
    System.out.println("      ** Please Enter the Base 1 of Trapezium **");
    base1=s.nextFloat();
    System.out.println("      ** Please Enter the Base 2 of Trapezium **");
    base2=s.nextFloat();
    System.out.println("      ** Please Enter the height of Trapezium **");
    height=s.nextFloat();
   }
   public void computed()
   {
    area=0.5f*(base1+base2)*height;
   }
}

class Geometery
{
    public static void poly(Shape ref)
    {
      ref.input();
      ref.computed();
      ref.disp();
    }
} 


public class ShapeAreaCalculator
{
    public static void main(String[] args) 
    {
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("           --- SHAPES'S AREA CALCULATOR ---");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       
       Scanner s1=new Scanner(System.in);
      
      while(true)
      {
      System.out.println("");
      System.out.println("****** Please Select a Shape to calculate it's AREA ******  ");
      System.out.println("");
      System.out.println("1. Retangle");
      System.out.println("2. Square");
      System.out.println("3. Circle");
      System.out.println("4. Triangle");
      System.out.println("5. Rhombus");
      System.out.println("6. Trapezium");
      System.out.println("7. EXIT");
        
        int shape= s1.nextInt();
            s1.nextLine();
       
      //   String shape=s1.next();

        if(shape==1)
        {
          Rectangle r=new Rectangle();
          Geometery g=new Geometery();
          g.poly(r);
         //  g.disp();
        }
        else if(shape==2)
        {
         Square s=new Square();
         Geometery g=new Geometery();
         g.poly(s);
         // g.disp();
        }
        else if(shape==3)
        {
         Circle c=new Circle();
         Geometery g=new Geometery();
         g.poly(c);
         // g.disp();
        }
        else if(shape==4)
        {
         Triangle t=new Triangle();
         Geometery g=new Geometery();
         g.poly(t);
         // g.disp();
        }
        else if(shape==5)
        {
         Rhombus r=new Rhombus();
         Geometery g=new Geometery();
         g.poly(r);
         // g.disp();
        }
        else if(shape==6)
        {
         Trapezium t=new Trapezium();
         Geometery g=new Geometery();
         g.poly(t);
         // g.disp();
        }
        else if(shape==7)
        {
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("      ------  Thanks for Visiting   ------  by VARSHA SINGH");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         break;
        }
        else
        {
         System.out.println("Invalid Input");
        }
      }
        s1.close();
      
    }
}
