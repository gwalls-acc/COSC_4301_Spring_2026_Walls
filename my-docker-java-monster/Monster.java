/*
  Name: Gloria Walls
  Instructor: Professor Jon-Mikel Pearson
  Assignment: Project 1
  Due Date: 02/14/2026
  Course/Section: COSC 4301 – Section 1
  File Name: Monster.java
*/
public class Monster
{

   // name and type variables
    private String name;
    private String type;

    //Monster class contructor
    public Monster(String name, String type)
    {
        this.name= name;
        this.type = type;
    }

    //method to display message about the name and type variables
    public String getDescription()
    {
        return name + "is a " + type + "-type monster from the Neon Ark training program.";

    }
}