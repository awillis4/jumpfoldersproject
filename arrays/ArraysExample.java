package corejava.arrays;

import java.text.DecimalFormat;import java.time.LocalDate;

public class ArraysExample{
   public static void main(String[]args){
   
   //Legend:V=down,below,under
      double[]testscores=new double[5];
      testscores[0]=89.5;testscores[1]=80.25;testscores[2]=76.7;testscores[3]=92;testscores[4]=91.2;
   
      double sum=0;
      for(int i=0;i<testscores.length;i++){sum=sum+testscores[i];}
      double avg=sum/testscores.length;System.out.println("Average test score = "+(avg));
      DecimalFormat df=new DecimalFormat("#.##");System.out.println("Average test score = "+df.format(avg));
   
      char[]testgrades={'A','B','A','C','D','B','F'};
      for(int i=0;i<testgrades.length;i++){System.out.println("Grade "+(i+1)+": "+testgrades[i]);}
   
      int[]test=new int[3];System.out.println(test[0]);
      char[]test2=new char[3];System.out.println("|"+test2[0]+"|");
      double[]test3=new double[3];System.out.println(test3[0]);
      boolean[]test4=new boolean[3];System.out.println(test4[0]);
   
   //v: arrays of objects
      Pet[]pets;
      pets=new Pet[4];
      pets[0]=new Pet();
      pets[1]=new Pet("Tiger",LocalDate.of(2015,4,12),"cat");
      pets[2]=new Pet("Worm",LocalDate.of(2011,10,27),"snake");
      pets[3]=new Pet("Spot",LocalDate.of(2018,12,7),"dog");
   
   //v: show of before and after objdel
      System.out.println("\nBefore:pet[1]= "+pets[1]+"\n");
      System.out.println("After:pet[1]= "+pets[1]+"\n");
   
   //v: printing the pet names using different methods
      for(int i=0;i<pets.length;i++){System.out.println("For Loop: "+pets[i].getName());}
      System.out.println("----------------");
      for(Pet p:pets){System.out.println("For each loop: "+p.getName());}
      for(int i=0;i<pets.length;i++){System.out.println(pets[i].getName());}
      System.out.println("------------------"); 
      for(Pet p:pets){p=new Pet();}//chaning the element itself will not work.
      for(int i=0;i<pets.length;i++){System.out.println(pets[i].getName());}
   
   //v:examples with primitives
      int[]temp={2,4,9,13,1};
      for(int num:temp){num=0;}
      for(int num:temp){System.out.println(num);} }}
//yellow underline means not being used.