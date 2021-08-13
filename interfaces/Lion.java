package corejava.interfaces;

public class Lion implements ZooAnimal, Mammal{

   @Override public void whatIsMyHabitat(){System.out.println("Im a lion in the "+ZooAnimal.zooName);}
   @Override public void speak(){System.out.println("ROAR");}
   public void lionClassMethodExample(){System.out.println("printed by method: 'lionClassMethodExample'.");}}