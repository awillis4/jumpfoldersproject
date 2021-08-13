package corejava.exceptions;
import java.util.*;

public class PropagationRunner{

//Propagation is the act of the compiler in java to catch custom or new exceptions.
   public static void d(int age)throws Exception{
      if(age<16){throw new Exception("Ur<16, do u cannot take the driving test.");}
      else{System.out.println("Welcome to your driving test.");}}
//Since there is no try block here, the exception is propagated, since it is not relegated to a block.

   public static void c(int age)throws Exception{d(age);}
   public static void b(int age)throws Exception{c(age);}
   public static void a(int age){
      try{b(age);}
      catch(Exception e){System.out.println(e.getMessage());}}

   public static void main(String[]args){
      int age=0;Scanner scan=new Scanner(System.in);
      while(true){
         try{System.out.println("Please enter your age");age=scan.nextInt();a(age);
            break;}
         catch(Exception e){scan.next();System.out.println("Please enter a number");}}scan.close();}}