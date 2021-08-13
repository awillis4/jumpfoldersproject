package corejava.inheritanceandcomposition;

class Liquid{
   public void whatAmI(){System.out.println("I am a liquid");}}
class Beverage extends Liquid{
   public void whatAmI(){System.out.println("I am a beverage");}}
class Coffee extends Beverage{
   public void whatAmI(){System.out.println("I am a coffee");}}
class Espresso extends Coffee{
   public void whatAmI(){System.out.println("I am an espresso");}}
class Latte extends Coffee{
   public void whatAmI(){System.out.println("I am a latte");}}

public class Casting{
   public static void main(String[]args){
   //upcasting v
      Liquid liq1=new Liquid();liq1.whatAmI();
      Espresso espresso=new Espresso();espresso.whatAmI();
      Liquid liq2=(Liquid) espresso;liq2.whatAmI(); //from espresso to liquid
      Liquid liq3=new Espresso();liq3.whatAmI();//utilizing the 'new' keyword
   //downcasting v
      Liquid liq4=new Espresso();Espresso espresso2=(Espresso)liq4;espresso2.whatAmI();
      Liquid liq5=new Liquid();Espresso espresso3=(Espresso)liq5;espresso3.whatAmI();}}
//code 17 will throw ClassCastExeption since object type is Liquid not Espresso.