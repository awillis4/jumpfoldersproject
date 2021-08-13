package corejava.enums;

public class StudentString{

   public static final String FRESHMAN="FRESHMAN";public static final String SOPHMORE="SOPHMORE";
   public static final String JUNIOR="JUNIOR";public static final String SENIOR="SENIOR";
   public static final String SUPERSENIOR="SUPER SENIOR";
   private String name;private String grade;

   public StudentString(String name,String grade){super();this.name=name;setGrade(grade);}
   public String getName(){
      return name;}
   public void setName(String name){this.name=name;}
   public String getGrade(){
      return grade;}

   public void setGrade(String grade){String gl=grade.toUpperCase();
      switch(gl){
         case FRESHMAN:
         case SOPHMORE:
         case JUNIOR:
         case SUPERSENIOR:
         
            this.grade=gl;
            break;}
      if(this.grade==null){this.grade=FRESHMAN;}}
   @Override public String toString(){
      return "StudentInt [name= "+name+", grade= "+grade+".]";}}