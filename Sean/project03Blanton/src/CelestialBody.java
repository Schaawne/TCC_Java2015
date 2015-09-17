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

    /** Mass of Celestial Body (kg)*/
    private double mass;

    /** Mean Radius of Celestial Body (km)*/
    private double radius;

    /**
     * CelestialBody Partial Constructor
     *
     * @param name name of the Celestial Body
     */
    CelestialBody(String name)
    {
        this.name = name;
        mass = 0.0;
        radius = 0.0;
    }

    /**
     * CelestialBody Full Constructor
     *
     * @param name name of the Celestial Body
     * @param mass mass of the Celestial Body (kg)
     * @param radius mean radius of the Celestial Body (km)
     */
    CelestialBody(String name, double mass, double radius)
    {
        this.name = name;

        //Protect against negative mass
        if(mass >= 0.0)
        {
            this.mass = mass;
        }
        else
        {
            this.mass = 0.0;
        }

        //Protect against negative radius
        if(radius >= 0.0)
        {
            this.radius = radius;
        }
        else
        {
            this.radius = 0.0;
        }
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
    public double getMass()
    {
        return mass;
    }
    public void setMass(double mass)
    {
        this.mass = mass;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
