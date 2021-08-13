package corejava.inheritanceandcomposition;

public class InstanceOfExample{
   public static void main(String[]args){
   
      Espresso liq1=new Espresso();
      if(liq1 instanceof Espresso){System.out.println("liq1 of instance Espresso");}
      if(liq1 instanceof Liquid){System.out.println("liq1 of instance of Liquid");}
   /*will throw compile error because it does not see branch of Latte, so liq1 is not of Latte.*/
   
      //if(liq1 instanceof Latte){System.out.println("liq1 of instance Latte");}
      //if(liq1 instanceof String){System.out.println("liq1 of instance String");}
   
   // v: of type Liquid, but set as Espresso
      Liquid liq2=new Espresso();
      if(liq2 instanceof Espresso){System.out.println("liq2 of instance Espresso");}
      if(liq2 instanceof Liquid){System.out.println("liq2 of instance Liquid");}
      if(liq2 instanceof Coffee){System.out.println("liq2 of instance Coffee");}
   
   //This Liquid is a Beverage set as a Coffee
      Beverage liq3=new Coffee();
      if(liq3 instanceof Espresso){System.out.println("liq3 of instance of Espresso");}
      if(liq3 instanceof Liquid){System.out.println("liq3 of instance Liquid");}
      if(liq3 instanceof Latte){System.out.println("liq3 of instance Latte");}
   
   //something set to null will always return null if checked by instanceOf.
      Liquid liq4=null;
      if(liq4 instanceof Liquid){System.out.println("liq4 of instance Liquid");} }}