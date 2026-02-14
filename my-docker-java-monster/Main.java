/*  Main.java
 *  COSC 4301
 *  Gloria Walls
 *  2/13/2026
 *  Purpose: This is a main class for instantiating a monster object
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