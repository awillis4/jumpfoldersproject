package corejava.collectionsgenerics;
import java.util.ArrayList;

public class ListExample{
   public static void main(String[]args){
   
      ArrayList<String>fruits=new ArrayList<>();
   
      fruits.add("banana");fruits.add("apple");fruits.add("pear");fruits.add("dragonfruit");
      fruits.add("lychee");fruits.add("mango");fruits.add("pineapple");fruits.add("orange");
   
      System.out.println("ArrayList<String>fruits------->"+fruits);
      System.out.println("\nForEach Loop Example:");
   
      for(String fruit:fruits){System.out.println(fruit);}
      System.out.println("\nFor Loop Example:");
      for(int i=0;i<fruits.size();i++){System.out.println(fruits.get(i));}
   
      fruits.remove(2);System.out.println("\nArrayLsit<String>fruits AFTER 'pear' deletion -------->"+fruits);
      fruits.remove("orange");System.out.println("\nArrayLsit<String>fruits AFTER 'orange' deletion -------->"+fruits);
      fruits.clear();System.out.println("\n'fruits after'.clear()'---->");
      if(fruits.isEmpty()){System.out.println("\n'fruits'=====>EMPTY");}
      else{
         System.out.println("\n'fruits'=====>At least 1 object");}}}