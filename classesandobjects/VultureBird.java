package corejava.classesandobjects;

public class VultureBird extends Animal{

   private int wingspan;
   public VultureBird(){super();}//will default 0 since no designation
   public VultureBird(double weight,String type,int wingspan){super();this.wingspan=wingspan;}
   //@Override
   public void move(){System.out.println("The VultureBird is flying");}
   public int getWingspan(){
      return wingspan;}
   public void setWingspan(int wingspan){this.wingspan=wingspan;}
   //@Override
   public String toString(){
      return "VultureBird[type="+this.getType()+"]";} }