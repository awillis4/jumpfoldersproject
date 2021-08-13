package corejava.functionalinterface;
import java.util.*;

@FunctionalInterface interface Calculation{
   float calculate(int x, int y);}

public class Calculator{

   static Calculation add=(x,y)->x+y;static Calculation sub=(x,y)->x-y;
   static Calculation mul=(x,y)->x*y;static Calculation div=(x,y)->x/y;
   static Calculation and=(x,y)->x&y;static Calculation giv=(x,y)->x|y;
   static Calculation eqs=(x,y)->x=y;static Calculation mod=(x,y)->x%y;
   static Calculation exp=(x,y)->x^y;

   public static void main(String[]args){
      Scanner scan=new Scanner(System.in);int x=0;int y=0;char op=0;
   
      System.out.println("Enter the 1st number");
      while(true){
         try{x=scan.nextInt();
            break;}
         catch(Exception e){System.out.println("Please enter an integer");}}
      System.out.println("Enter the 2nd number");
      while(true){
         try{y=scan.nextInt();
            break;}
         catch(Exception e){System.out.println("Please enter an integer");}}
      System.out.println("Enter the operator");
      while(true){
         try{op=scan.next().charAt(0);
            break;}
         catch(Exception e){System.out.println("Please enter an operator");}}
      try{System.out.println(classicCalculator(x,y,op));System.out.println(functionalCalculator(x,y,op));}
      catch(Exception e){System.out.println(e.getMessage());}scan.close();}
                                             
   public static float classicCalculator(int x,int y,char op)throws Exception{
      switch(op){
         case'+':
            return x+y;
         case'-':
            return x-y;
         case'*':
            return x*y;
         case'/':
            return x/y;
         case'&':
            return x&y; 
         case'|':
            return x|y;
         case'=':
            return x=y;
         case'%':
            return x%y;
         case'^':
            return x^y;
         default:throw new Exception("Operation not supported");}}

   public static float functionalCalculator(int x,int y,char op)throws Exception{
      switch(op){
         case'+':
            return add.calculate(x,y);
         case'-':
            return sub.calculate(x,y);
         case'*':
            return mul.calculate(x,y); 
         case'/':
            return div.calculate(x,y);
         case'&':
            return and.calculate(x,y);
         case'|':
            return giv.calculate(x,y); 
         case'=':
            return eqs.calculate(x,y);
         case'%':
            return mod.calculate(x,y);
         case'^':
            return add.calculate(x,y); 
         default:throw new Exception("Operation not supported");}}}