package corejava.flowcontrol;

import java.util.*;

public class Branching{
   public static void main(String[]args){
   
      Scanner scan=new Scanner(System.in);
   
      System.out.println("Enter max points: ");double maxpoints=scan.nextDouble();
      System.out.println("Enter grade achieved: ");double gpoints=scan.nextDouble();
   
      if(maxpoints> 100){System.out.println("your max is out of range.");}
      else
         if(maxpoints==100){System.out.println("you have entered 100 as yourmax num of points");}
         else
            System.out.println("Your grade is "+(gpoints/maxpoints*100)+"out of "+maxpoints);
                   
      System.out.println("Enter your grade level: Freshman=1, Sophomore=2; Junior=3; Senior=4");
      int gradelevel=scan.nextInt();scan.nextLine();
   
      switch(gradelevel){
         case 1:System.out.println("4 years left of high school");
            break;
         case 2:System.out.println("3 years left of high school");
            break;
         case 3:System.out.println("2 years left of high school");
            break;
         case 4:System.out.println("1 years left of high school");
            break;
         default:System.out.println("congrats, u graduated high school!");
            break;}
   
      System.out.println("How old is your child?");int agelvl=scan.nextInt();
      switch(agelvl){
         case 0:System.out.println("Your child will be in kindergarten.");
            break;
         case 1:case 2:case 3:case 4:System.out.println("Your child will be in elementary");
            break;
         case 5:case 6:case 7:case 8:System.out.println("Your child will be in middle school.");
            break;
         case 9:case 10:case 11:case 12:System.out.println("Your child will be in high school.");
            break;
         case 13:case 14:case 15:case 16:System.out.println("Your adult is in college.");
            break;
         case 17:case 18:case 19:case 20:System.out.println("Your adult is in grad school.");
            break;
         default:System.out.println("Your child is well educated. How many doctorates does he have?");
            
            int phd=scan.nextInt();}scan.close();}}
