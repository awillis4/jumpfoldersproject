package corejava.collectionsgenerics;

public class GenericExample{
   public static void main(String[]args){
   
   /*generic string example
   TripletImpl<String>tripletString=newTripletImplt<String>();
   tripletString.add("foobar1");tripletString.add("foobar2");tripletString.add("foobar3");
   
   System.out.println("Calling .get(0) on tripletString "+tripletString.get(0));
   System.out.println("\nCalling .get(2) on tripletString "+tripletString.get(2));
   System.out.println(tripletString);*/
   
   //Integer(autobox type generic exaple
      TripletImpl<Integer>tripletInteger=new TripletImpl<Integer>();
   
      tripletInteger.add(1);tripletInteger.add(2);tripletInteger.add(3);
   
      System.out.println("Calling .get(0) on tripletInteger "+tripletInteger.get(0));
      System.out.println("\nCalling .get(2) on tripletInteger "+tripletInteger.get(2));
      System.out.println(tripletInteger);}}