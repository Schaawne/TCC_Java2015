/**
 * Planet class for project03Blanton
 *
 * Created by Schaawne on 9/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class Planet extends CelestialBody
{
    /** Number of Moons */
    private int moonsCount;

    /**
     * Planet Constructor
     *
     * @param name name of Planet
     * @param moons # of moons belonging to Planet (>=0)
     */
    public Planet(String name, int moons)
    {
        //Call CelestialBody constructor for name
        super(name);

        //Set # of moons (protect against negative values
        if(0 <= moons)
        {
            moonsCount = moons;
        }
        else
        {
            moonsCount = 0;
        }
    }

    /**
     * Getter and Setters
     */
    public int getMoonsCount()
    {
        return moonsCount;
    }
    public void setMoonsCount(int moonsCount)
    {
        this.moonsCount = moonsCount;
    }

    @Override
    public String toString()
    {
        //Format string using getName() from CelestialBody and moonsCount from Planet
        return String.format("Planet: %10s {Moons: %d}", "{" + getName() + "}", moonsCount); //Inline String for text alignmet
    }
}
