//package corejava.connection.SqlJdbcExg.src;

import java.sql.Connection;import java.sql.DriverManager;import java.sql.SQLException;

public class ConnectionManager1{

   private static final String URL="jdbc:mysql://localhost:3306/university?serverTimeZone=EST5EDT";
   private static final String USERNAME="root";
   private static final String PASSWORD="Root#23";

   public static Connection getConnection(){
      Connection connection=null;
      try{connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);System.out.println("Made Connection.");}
      catch(SQLException e){e.printStackTrace();System.out.println("Couldn't make Connection");}
      return null;}}