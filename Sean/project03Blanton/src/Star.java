/**
 * Star class for project03Blanton
 *
 * Created by Schaawne on 9/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class Star extends CelestialBody
{
    /** Luminosity (W)*/
    private double luminosity;

    /** Radiance (W * sr^(-1)*m(-2) */
    private double radiance;

    /**
     * Star Constructor
     *
     * @param name Star Name (->CelestialBody Constructor)
     */
    Star(String name, double luminosity, double radiance)
    {
        //Call CelestialBody partial constructor
        super(name);

        //Set star properties
        this.luminosity = luminosity;
        this.radiance = radiance;
    }

    Star(String name, double luminosity, double radiance, double mass, double radius)
    {
        //Call CelestialBody full constructor
        super(name, mass, radius);

        //Set star properties
        this.luminosity = luminosity;
        this.radiance = radiance;
    }

    /**
     * Getters and Setter
     */
    public double getLuminosity()
    {
        return luminosity;
    }
    public void setLuminosity(double luminosity)
    {
        this.luminosity = luminosity;
    }
    public double getRadiance()
    {
        return radiance;
    }
    public void setRadiance(double radiance)
    {
        this.radiance = radiance;
    }

    @Override
    public String toString()
    {
        return String.format("Star: %10s {Mass: %05.3ekg, Mean Radius: %05.3ekm, Luminosity: %05.3eW, Radiance: %05.3eW*st^(-1)*m^(-2)}",
                "(" + getName() + ")",
                getMass(),
                getRadius(),
                luminosity,
                radiance);
    }
}
