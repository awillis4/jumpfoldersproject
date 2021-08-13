package corejava.classesandobjects;

public class Vehicle{

   String type;private String color;private int wheels;private static int vehicleCount=0;

//the overloading contructor / how to overload / what it looks like / in java / v
   public Vehicle(){this.type="N/A";this.color="N/A";this.wheels=-1;vehicleCount++;}
//the car with -1 wheels does not exist.

   public Vehicle(String type,String color,int wheels){super();
      this.type=type;this.color=color;this.wheels=wheels;vehicleCount++;}

   static{
      System.out.println("BEFORE:vehicleCount="+vehicleCount);
      vehicleCount=1;
      System.out.println("AFTER:vehicleCount="+vehicleCount);}

   public static int getVehicleCount(){
      return vehicleCount;}

   public String describe(){
      return "This am a vehicle";}
   public String describe(int carFeature){
      if(carFeature==1){
         return "This vehicle is a "+type;}
      else 
         if(carFeature==2){
            return "This vehicle is "+color;}
         else
            if(carFeature==3){
               return "This vehicle has "+wheels;}
            else
               return "This is a vehicle";}

/*cant overload this way > public void describe(){}*/

   public String getType(){
      return type;}
   public void setType(String type){this.type=type;}
   public String getColor(){
      return color;}
   public void setColor(String color){this.color=color;}
   public int getWheels(){
      return wheels;}
   public void setWheels(int wheels){this.wheels=wheels;}

   @Override 
   public String toString(){
      return "Vehicle[type="+type+", color="+color+", wheels="+wheels+"]";}

   public static void main(String[]args){
      Vehicle car=new Vehicle("car","yellow",4);
      System.out.println("RUNNER:vehicleCount="+Vehicle.getVehicleCount());
      car.describe();String x=car.type;Vehicle.vehicleCount=8;System.out.println(car);
      Vehicle temp=new Vehicle();System.out.println(temp);
   /*temp.getVehicleCoutn();*/Vehicle.getVehicleCount();
      System.out.println(temp.describe(1)+car.describe(1));}}