package corejava.enums;

public enum Element{//each enum value is passing 2 values to the constructor.
   Carbon("C",6),Nitrogen("N",7),Oxygen("O",8),Argon("Ar",18);

   public final String symbol;public final int atomicNumber;

//the contructor
   private Element(String symbol,int atomicNumber){this.symbol=symbol;this.atomicNumber=atomicNumber;}

   public void describe(){System.out.println(name()+"has the atomic symbol of"+symbol+ "and an atomic number of "+atomicNumber);}}