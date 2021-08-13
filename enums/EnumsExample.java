package corejava.enums;
import enums.Grade;

enum Color{red,yellow,green,blue}

public class EnumsExample extends StudentEnum{

   public static void runStudentString(){
      StudentString student=new Student("foobar",Student.FRESHMAN);System.out.println("student= "+student);
      student.setGrade("SoPhMoRe");System.out.println("student= "+student);
      student.setGrade("kindergartener");System.out.println("student= "+student);
      student.setGrade("Super Senior");System.out.println("Student= "+student);}

   public static void runStudentInt(){
      StudentInt student=new StudentInt("foobar",StudentInt.JUNIOR);System.out.println("student= "+student);
      student.setGrade(2);System.out.println("student= "+student);
      student.setGrade(100);System.out.println("student= "+student);
      student.setGrade(5);System.out.println("student= "+student);}

   public static void runStudentEnum(){
      StudentEnum student=new StudentEnum("foobar",Grade.JUNIOR);System.out.println("student= "+student);
   //student.setGrade(Grade.OtHER); cannot do this, other doesnt exist.
      Student.setGrade(Grade.SUPER_SENIOR);System.out.println("student= "+student);}

   public static void enumMethods(){
      Color color=Color.BLUE;System.out.println("color= "+color);System.out.println("color.ordinal()= "+color.ordinal());
      String colorStr=color.name();System.out.println("color.name()= "+colorStr);System.out.println("Colors: ");
      for(Color c:Color.values()){System.out.println("- "+c);}}

   public static void enumWithConstructor(){
      Element element=Element.Argon;System.out.println("element ="+element);
      System.out.println("element.symbol= "+element.symbol);System.out.println("element.atomicNumber= "+element.atomicNumber);element.describe();}

   public static void main(String[]args){
   //runStudentString();
   //runStudentInt();
   //runStudentEnum();
   //enumMethods();
   //enumWithConstructor();
   }}