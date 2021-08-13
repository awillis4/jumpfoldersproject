package corejava.interfaces;

public class Circle extends Shape{

   private double radius;

   public Circle(String color,double radius){super(color);this.radius=radius;}
   //@Override 
   public double area(){
      return Math.PI*Math.pow(radius,2);}
   //@Override 
   public double perimeter(){
      return Math.PI*2*radius;}
   //@Override 
   public void greeting(){System.out.println("Hello there, from cirle, my color is "+getColor());}

//@Override public void message(){"Err: cannot override final method from shape.";} }}
}