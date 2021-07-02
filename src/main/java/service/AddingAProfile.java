package service;

import DataAccessLayer.Database;
import DataAccessLayer.Model;

public class DatabaseInteraction {


  public static void main(String[] args) {
    Database.createDatabase();


    Model bob = new Model("Bob", 21);

    Model jerry = new Model("Jerry", 34);



    Database.randomPersonsProfile(bob);
    Database.seeTheDatabase();
    Database.randomPersonsProfile(jerry);
    Database.seeTheDatabase();

    Database.deleteAPersonsProfile("Bob");
    Database.seeTheDatabase();



  }
}
