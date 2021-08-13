package corejava.functionalinterface;
import java.util.Arrays;

interface GeneralCalculation{
   float calculate(int...arr);}

public class GeneralCalculator{

   static GeneralCalculation add=arr ->Arrays.stream(arr).reduce(0,(x,y)->x+y);
   static GeneralCalculation sub=arr ->Arrays.stream(arr).reduce(0,(x,y)->x-y);
   static GeneralCalculation mul=arr ->Arrays.stream(arr).reduce(0,(x,y)->x*y);
   static GeneralCalculation div=arr ->Arrays.stream(arr).reduce(0,(x,y)->x/y);
   static GeneralCalculation and=arr ->Arrays.stream(arr).reduce(0,(x,y)->x&y);
   //static GeneralCalculation orr=arr ->Arrays.stream(arr).reduce(0,(x,y)->x v y);
   static GeneralCalculation giv=arr ->Arrays.stream(arr).reduce(0,(x,y)->x|y);
   //static GeneralCalculation xor=arr ->Arrays.stream(arr).reduce(0,(x,y)->x o y);
   //static GeneralCalculation xnd=arr ->Arrays.stream(arr).reduce(0,(x,y)->x . y);
   //static GeneralCalculation not=arr ->Arrays.stream(arr).reduce(0,(x,y)->x not y);
   //static GeneralCalculation ths=arr ->Arrays.stream(arr).reduce(0,(x,y)->x->y);
   static GeneralCalculation eqs=arr ->Arrays.stream(arr).reduce(0,(x,y)->x=y);
   static GeneralCalculation mod=arr ->Arrays.stream(arr).reduce(0,(x,y)->x%y);
   static GeneralCalculation exp=arr ->Arrays.stream(arr).reduce(0,(x,y)->x^y);
   //static GeneralCalculation log=arr ->Arrays.stream(arr).reduce(0,(x,y)->x ln y);
   //static GeneralCalculation win=arr ->Arrays.stream(arr).reduce(0,(x,y)->xcy);

   public static void main(String[]args){
      int[]arr={1,2,3,4,5};System.out.println(add.calculate(arr));
      System.out.println("How many numbers would you like to ");}}