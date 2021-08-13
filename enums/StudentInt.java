package corejava.enums;

public class StudentInt{

   public static final int FRESHMAN=1;public static final int SOPHMORE=2;
   public static final int JUNIOR=3;public static final int SENIOR=4;
   public static final int SUPERSRNIOR=5;
   private String name;private int grade;

   public StudentInt(String name,int grade){super();this.name=name;setGrade(grade);
      if(this.grade==0){setGrade(FRESHMAN);}}

   public String getName(){
      return name;}
   public void setName(String name){this.name=name;}
   public int getGrade(){
      return grade;}
   public void setGrade(int grade){
      if((grade>=1)&&(grade<=5)){this.grade=grade;}}

   public String stringGrade(int level){
      switch(level){
         case FRESHMAN:
            return "Freshman";
         case SOPHMORE:
            return "Sophmore";
         case JUNIOR:
            return "Junior";
         case SENIOR:
            return "Senior";
         //case SUPERSENIOR:
            //return "Super Senior";
         default:
            return "Unknown";}}

   @Override public String toString(){
      return "Student [name= "+name+", grade= "+stringGrade(grade)+"]";}}
