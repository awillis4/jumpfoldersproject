package corejava.arrays;

public class TwoDimArrays{
   public static void main(String[]args){
   
      char grid[][]={{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'}};
   
      for(int row=0;row<grid.length;row++){
         for(int col=0;col<grid[row].length;col++){System.out.println(grid[row][col]+" ");}}
      System.out.println(" ");System.out.println("\ngrid[1][3]= "+grid[1][3]);System.out.println("\n--------------------\n");
   
      int grid2[][]=new int[3][5];
      for(int row=0;row<grid2.length;row++){
         for(int col=0;col<grid2[row].length;col++){
            System.out.println(grid2[row][col]+" ");}System.out.println(" ");}System.out.println("\n------------------\n");
   
      int[][]grid3=new int[4][];grid3[0]=new int[]{1};grid3[1]=new int[]{1,2};grid3[3]=new int[]{1,2,3};grid3[4]=new int[]{1,2,3,4};
      for(int row=0;row<grid3.length;row++){
         for(int col=0;col<grid3[row].length;col++){System.out.println(grid3[row][col]+" ");}}}}