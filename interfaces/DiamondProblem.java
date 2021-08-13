package corejava.interfaces;

//Try to run speak() from main at the bottom and see what happens.

interface Creature{
   public void speak();}
interface Animal extends Creature{
   public void speak();}
interface Reptile extends Creature{
   public void speak();}

class Lizard implements Animal, Reptile{
   @Override public void speak(){System.out.println("HEllo, I am a lizard");}}

//v: A hybrind inheritance with default methods.

interface CreatureDefault{
   public default void speak(){System.out.println("Hello, I am a creature");}}
interface AnimalDefault extends CreatureDefault{
   public default void speak(){System.out.println("Hello, I am an animal.");}}
interface ReptileDefault extends CreatureDefault{
   public default void speak(){System.out.println("Hello, I am a Reptile.");}}

class LizardDefault implements AnimalDefault, ReptileDefault{
   @Override public void speak(){System.out.println("Hello, I am a Lizard");
   /*cant call creature method since it is not a direct parent of lizard.
   AnimalDefault.super.speak();ReptileDefault.super.speak();CreatureDefault.super.speak();*/}}

public class DiamondProblem{
   public static void main(String[]args){
      Lizard liz=new Lizard();liz.speak();//methods run with no defaults in interfaces:
      LizardDefault lizdef=new LizardDefault();lizdef.speak();}}//Tests methods with defaults, each case.
      
      //(*prints hello, i am a lizard twice.*)//