package corejava.collectionsgenerics;
import java.util.HashSet;import java.util.Iterator;import java.util.Set;import java.util.TreeSet;

public class SetExample{
   public static void main(String[]args){
   
      Set<String>fruitsTree=new TreeSet<String>();Set<String>fruitsHash=new HashSet<String>();
   
      String[]fruitsArr={"banana","apple","pear","pear","dragonfruit","lychee","mango","pineapple","orange","orange","durian"};
   
      for(String fruit:fruitsArr){fruitsTree.add(fruit);fruitsHash.add(fruit);}
   
      System.out.println("TreeSet 'fruitsTree'----->"+fruitsTree);
      System.out.println("\nHashSet 'fruitsHash'----->"+fruitsHash);
      System.out.println("\n'fruitsTree' size======>"+fruitsTree.size());
      System.out.println("Contains 'apple'======>"+fruitsTree.contains("apple"));
   
      fruitsTree.clear();
      if(fruitsTree.isEmpty()){
         System.out.println("\n'fruitsTree'======>EMPTY");}
      else{
         System.out.println("\n'fruitsTree'=====>at least 1 element.");}
      System.out.println("\n\n---->ITERATOR EXAMPLE:");
   
      Iterator<String>iterFruit=fruitsHash.iterator();
      while(iterFruit.hasNext()){System.out.println(iterFruit.next());}
      for(String fruit:fruitsHash){System.out.println(fruit);}}}