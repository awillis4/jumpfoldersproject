package corejava.exceptions;
import java.util.*;

public class TryCatchRunner{
   public static void main(String[]args){
      Scanner scan=new Scanner(System.in);
   
      System.out.println("Please input an int value, then press enter.");
      try{int input=scan.nextInt();System.out.println("you have entered a value of type int. "+input);}
      catch(Exception e){e.printStackTrace();System.out.println("The input was not an int, general exception block reached.");}
      System.out.println("This message will always print whether exception or not.:)");}}