/*
  Name: Gloria Walls
  Instructor: Professor Jon-Mikel Pearson
  Assignment: Project 1
  Due Date: 02/14/2026
  Course/Section: COSC 4301 – Section 1
  File Name: Main.java
*/
public class Main
{
    // main method
    public static void main(String[] args)
    {
        Monster myMonster = new Monster("Abaia","Water");
        System.out.println("Your monster has been created.");
        System.out.println(myMonster.getDescription());
    }
}