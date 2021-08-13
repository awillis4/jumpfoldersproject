package corejava.exceptions;
import java.util.*;

public class UncaughtExceptions{
   public static void main(String[]args){
   
      Scanner scan=new Scanner(System.in);
   
      System.out.println("Please imput an int, then press enter.");
      int input=scan.nextInt();
      System.out.println("If the value input was an int, you will see it here. "+input);
      scan.close();}}