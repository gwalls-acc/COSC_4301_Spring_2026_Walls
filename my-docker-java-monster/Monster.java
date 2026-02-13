/*  Monster.java
 *  COSC 4301
 *  Gloria Walls
 *  2/13/2026
 *  Purpose: This is monster class for
 *           the Neon Ark project
 */

public class Monster
{
    private String name;
    private String type;

    public Monster(String name, String type)
    {
        this.name= name;
        this.type = type;
    }

    public String getDescription()
    {
        return name + ", "+ type;

    }
}