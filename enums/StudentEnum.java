package corejava.enums;

public class StudentEnum{
   public static enum Grade{FRESHMAN,SOPHMORE,JUNIOR,SENIOR,SUPERSENIOR}
   private String name;private Grade grade;
   public StudentEnum(String name,Grade grade){super();this.name=name;this.grade=grade;}
   public String getName(){
      return name;}
   public void setName(String name){this.name=name;}
   public Grade getGrade(){
      return grade;}
   public void setGrade(Grade grade){this.grade=grade;}
   @Override public String toString(){
      return "StudentInt [name= "+name+",grade= "+grade+"]";}}