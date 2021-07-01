package DataAccessLayer;

import java.util.ArrayList;

public class Database {

 private static ArrayList<Model> myDatabase;    //Is my database and what ive called it.

 public static void createDatabase() {

   myDatabase = new ArrayList<Model>();       //Initializes the database/calls the database using the method. This only has to be called once.

 }

  public static ArrayList<Model> getMyDatabase() {
    return myDatabase;
  }

  //Allows for the database to be accessed but only if it is called.

  ///////MAKE DATABASE SINGLUAR (Static) AND SECURE



  public static void randomPersonsProfile(Model randomUser){

   myDatabase.add(randomUser);
  }

  //Allows a random person or a new user to add their infomation to my database using my template.

  public static void seeTheDatabase(){

   for (Model profiles: myDatabase){
     System.out.println(profiles.toString());
   }
    System.out.println("===========================================");

  }




}
