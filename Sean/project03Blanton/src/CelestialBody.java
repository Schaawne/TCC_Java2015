/**
 * CelestialBody class for project03Blanton
 *
 * Created by Schaawne on 9/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class CelestialBody
{
    /** Name of Celestial Body */
    private String name;

    /**
     * CelestialBody Constructor
     *
     * @param name name of the Celestial Body
     */
    CelestialBody(String name)
    {
        this.name = name;
    }

    /**
     * Getters and Setters
     */
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
