/*  Monster.java
 *  COSC 4301
 *  Gloria Walls
 *  2/13/2026
 *  Purpose: This is monster class for
 *           the Neon Ark project
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