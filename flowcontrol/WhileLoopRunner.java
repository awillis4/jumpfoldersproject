package corejava.flowcontrol;

public class WhileLoopRunner{

   public static void runWhile(){int counter=1;
      while(counter<10){System.out.println(counter);counter++;}}

   public static void runBoolWhile(){boolean condition=true;int counter=1;
      while(condition){System.out.println(counter);counter++;
         if(counter>10){condition=false;}}}

   public static void runDoWhile(){boolean condition=false;
      do{System.out.println("This part is only goinf to run once");}while(condition);
      while(condition){System.out.println("This result will never print :(");}}

   public static void main(String[]args){
      runWhile();
      runBoolWhile();
      runDoWhile();
   }}