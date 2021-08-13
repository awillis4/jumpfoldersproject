package corejava.exceptions;
import java.util.*; //InputMismatchException,Scanner

public class MultiTryCatchRunner{
   public static void main(String[]args){
   
      boolean result=demoReturnTryMethod();System.out.println("The result of demoReturnTryMethod is "+result);}

   public static boolean demoReturnTryMethod(){
      Scanner scan=new Scanner(System.in);int num,ans=0;
      System.out.println("please input an int");
      try{num=scan.nextInt();ans=10/num;
         return true;}
      catch(InputMismatchException e){System.out.println("This imput is not an int.");
         return false;}
      catch(ArithmeticException e){System.out.println("U cannot div by 0.");
         return false;}
      catch(Exception e){System.out.println("This is a message from the general catch block.");
         return false;}
      finally{System.out.println("\nThis message will print only if no other exception is raised.");} }}