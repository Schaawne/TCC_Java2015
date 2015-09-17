/**
 * SolarSystem class for project03Blanton
 *
 * Created by Schaawne on 9/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class SolarSystem
{
    /** Planets belonging to Solar System */
    private Planet[] planetsArray;

    /** Stars belonging to Solar System */
    private Star[] starsArray;

    /** Name of the Solar System */
    private String systemName;

    /**
     * SolarSystem Constructor
     *
     * @param planetCount # of Planets in Solar System (>0)
     */
    public SolarSystem(String systemName, int starCount, int planetCount)
    {
        //Set the Solar System name
        this.systemName = systemName;

        //Initialize starsArray
        if(0 < starCount)
        {
            starsArray = new Star[starCount];
        }
        else
        {
            throw new IllegalArgumentException("Bad starCount parameter!  Must  be > 0.");
        }

        //Initialize planetArray
        if(0 < planetCount)
        {
            planetsArray = new Planet[planetCount];
        }
        else
        {
            throw new IllegalArgumentException("Bad planetCount parameter!  Must be > 0.");
        }
    }

    /**
     * Planet Definition
     *
     * @param planetID array index for locating Planet (0 <= planetID < planetsArray.length)
     * @param planetName name of Planet
     * @param planetMoons number of moons for Planet
     *
     * @return success or failure in validating parameters
     */
    public boolean DefinePlanet(int planetID, String planetName, int planetMoons)
    {
        //Check planetID against available array length
        if((0 > planetID) || (planetsArray.length < planetID))
        {
            return false;
        }

        //Check if Planet has been instantiated before proceeding
        if(null == planetsArray[planetID])
        {
            //Instantiate new Planet
            planetsArray[planetID] = new Planet(planetName, planetMoons);
        }
        else
        {
            //Set Planet data at array index
            planetsArray[planetID].setName(planetName);
            planetsArray[planetID].setMoonsCount(planetMoons);
        }

        return true;
    }

    /**
     * Star Definition
     *
     * @param starID array index for locating Star (0 <= starID < starsArray.length)
     * @param starName name of Star
     *
     * @return success or failure in validating parameters
     */
    public boolean DefineStar(int starID, String starName)
    {
        //Check planetID against available array length
        if((0 > starID) || (starsArray.length < starID))
        {
            return false;
        }

        //Check if Planet has been instantiated before proceeding
        if(null == starsArray[starID])
        {
            //Instantiate new Planet
            starsArray[starID] = new Star(starName);
        }
        else
        {
            //Set Planet data at array index
            starsArray[starID].setName(starName);
        }

        return true;
    }

    @Override
    public String toString()
    {
        //StringBuilder for construction String return
        StringBuilder builder = new StringBuilder();

        //Solar System Information
        builder.append("Solar System (" + systemName + "):\n");

        //Star Information
        builder.append("--Stars--\n");
        for(int i = 0; i < starsArray.length; i++)
        {
            builder.append("\t" + (i+1) + ".: ");
            if(null != starsArray[i])
            {
                builder.append(starsArray[i].toString());
            }
            else
            {
                builder.append("MISSING STAR INFO!");
            }
            builder.append("\n");
        }

        //Planet Information
        builder.append("--Planets--\n");
        for(int i = 0; i < planetsArray.length; i++)
        {
            builder.append("\t" + (i+1) + ".: ");
            if(null != planetsArray[i])
            {
                builder.append(planetsArray[i].toString());
            }
            else
            {
                builder.append("MISSING PLANET INFO!");
            }
            builder.append("\n");
        }

        //Return String from StringBuilder
        return builder.toString();
    }
}
