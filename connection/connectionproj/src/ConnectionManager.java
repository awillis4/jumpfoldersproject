/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**/
 
//package corejava.connection.SqlJdbcExg.src;

import java.sql.Connection;import java.sql.DriverManager;import java.sql.*;import java.io.*;
import java.util.Properties;

public class ConnectionManager{

   private static final String URL="jdbc:mysql://localhost:3306/university?serverTimeZone=EST5EDT";
   private static final String USERNAME="root";
   private static final String PASSWORD="Root#23";

   public static Connection getConnection1(){
      Connection connection1=null;
      try{connection1=DriverManager.getConnection(URL,USERNAME,PASSWORD);System.out.println("Made Connection.");}
      catch(SQLException e){e.printStackTrace();System.out.println("Couldn't make Connection");}
      return null;}
   
   private static Connection connection2;
   
   private static void makeConnection2()
           throws FileNotFoundException,IOException,ClassNotFoundException,SQLException
   {
   
   Properties properties=new Properties();
   
   properties.load(new FileInputStream("resources/config,properties"));
   String url=properties.getProperty("url");
   String username=properties.getProperty("username");
   String password=properties.getProperty("password");
   
   Class.forName("com.mysql.cj.jdbc.Driver");
   connection2=DriverManager.getConnection(url,username,password);}
   
   

public static Connection getConnection2()
        throws FileNotFoundException,IOException,ClassNotFoundException,SQLException{
    if(connection2==null){makeConnection2();}return connection2;}

public static void main(String[]args){
    try{Connection con=ConnectionManager.getConnection2();System.out.println("Made Connection");
    con.close();System.out.println("Closed Connection");}
    catch(ClassNotFoundException|IOException|SQLException e){
        System.out.println("Could not establish connection");e.printStackTrace();
    }
}

}