package corejava.exceptions;
import java.util.Scanner;

public class LicenseRegistration{
   public static void main(String[]args){
   
      try{int age=getAge();System.out.println("ur "+age+" yrs old, ur eligable 4a drivers license.");}
      catch(LicenseAgeException e){System.out.println(e.getMessage());}}

   public static int getAge() throws LicenseAgeException{Scanner scan=new Scanner(System.in);
      System.out.println("Hello, welcome to the dmv, what is your age?");int age=scan.nextInt();
      if(age<16){scan.close();throw new LicenseAgeException(age);}
      scan.close();
      return age;}}