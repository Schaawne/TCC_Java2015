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
     * Planet Definition
     *
     * @param planetID array index for locating Planet (0 <= planetID < planetsArray.length)
     * @param planetName name of Planet
     * @param planetMoons number of moons for Planet
     * @param planetMass mass of Planet (kg)
     * @param planetRadius radius of Planet (km)
     *
     * @return success or failure in validating parameters
     */
    public boolean DefinePlanet(int planetID, String planetName, int planetMoons, double planetMass, double planetRadius)
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
            planetsArray[planetID] = new Planet(planetName, planetMoons, planetMass, planetRadius);
        }
        else
        {
            //Set Planet data at array index
            planetsArray[planetID].setName(planetName);
            planetsArray[planetID].setMoonsCount(planetMoons);
            planetsArray[planetID].setMass(planetMass);
            planetsArray[planetID].setRadius(planetRadius);
        }

        return true;
    }

    /**
     * Add Planet to Solar System
     *
     * @param planetID index to place Planet at
     * @param newPlanet Planet to be added
     *
     * @return success or failure in validating parameters
     */
    public boolean AddPlanet(int planetID, Planet newPlanet)
    {
        //Check planetID against available array length
        if((0 > planetID) || (planetsArray.length < planetID))
        {
            return false;
        }

        //Store Planet in array
        planetsArray[planetID] = newPlanet;

        return true;
    }

    /**
     * Star Definition
     *
     * @param starID array index for locating Star (0 <= starID < starsArray.length)
     * @param starName name of Star
     * @param starLuminosity starLuminosity of Star (W)
     * @param starRadiance starRadiance of Star (W * st^(-1) * m^(-2))
     *
     * @return success or failure in validating parameters
     */
    public boolean DefineStar(int starID, String starName, double starLuminosity, double starRadiance)
    {
        //Check starID against available array length
        if((0 > starID) || (starsArray.length < starID))
        {
            return false;
        }

        //Check if Star has been instantiated before proceeding
        if(null == starsArray[starID])
        {
            //Instantiate new Star
            starsArray[starID] = new Star(starName, starLuminosity, starRadiance);
        }
        else
        {
            //Set Star data at array index
            starsArray[starID].setName(starName);
            starsArray[starID].setLuminosity(starLuminosity);
            starsArray[starID].setRadiance(starRadiance);
        }

        return true;
    }

    /**
     * Star Definition
     *
     * @param starID array index for locating Star (0 <= starID < starsArray.length)
     * @param starName name of Star
     * @param starLuminosity starLuminosity of Star (W)
     * @param starRadiance starRadiance of Star (W * st^(-1) * m^(-2))
     * @param starMass mass of Star (kg)
     * @param starRadius radius of Star (km)
     *
     * @return success or failure in validating parameters
     */
    public boolean DefineStar(int starID, String starName, double starLuminosity, double starRadiance, double starMass, double starRadius)
    {
        //Check starID against available array length
        if((0 > starID) || (starsArray.length < starID))
        {
            return false;
        }

        //Check if Star has been instantiated before proceeding
        if(null == starsArray[starID])
        {
            //Instantiate new Star
            starsArray[starID] = new Star(starName, starLuminosity, starRadiance, starMass, starRadius);
        }
        else
        {
            //Set Star data at array index
            starsArray[starID].setName(starName);
            starsArray[starID].setLuminosity(starLuminosity);
            starsArray[starID].setRadiance(starRadiance);
            starsArray[starID].setMass(starMass);
            starsArray[starID].setRadius(starRadius);
        }

        return true;
    }

    /**
     * Add Star to Solar System
     *
     * @param starID index to place Star at
     * @param newStar Star to be added
     *
     * @return success or failure in validating parameters
     */
    public boolean AddStar(int starID, Star newStar)
    {
        //Check starID against available array length
        if((0 > starID) || (starsArray.length < starID))
        {
            return false;
        }

        //Store Star in array
        starsArray[starID] = newStar;

        return true;
    }

    /**
     * Getters
     */
    /**
     * Get Planet from Array
     *
     * @param planetID index to retrieve Planet from
     *
     * @return Planet from Array
     */
    public Planet GetPlanet(int planetID)
    {
        //Check planetID against Array bounds
        if((0 > planetID) || (planetsArray.length < planetID))
        {
            return null;
        }

        return planetsArray[planetID];
    }

    /**
     * Get Planet Count
     *
     * @return # of Planets in Solar System
     */
    public int GetPlanetCount()
    {
        return planetsArray.length;
    }

    /**
     * Get Star Count
     *
     * @return # of Stars in Solar System
     */
    public int GetStarCount()
    {
        return starsArray.length;
    }

    /**
     * Get Moon Count
     *
     * @return # of moons in the Solar System
     */
    public int GetMoonCount()
    {
        int moons = 0;

        for( Planet p : planetsArray)
        {
            moons += p.getMoonsCount();
        }

        return moons;
    }

    /**
     * Get Star from Array
     *
     * @param starID index to retrieve Star from
     *
     * @return Star from Array
     */
    public Star GetStar(int starID)
    {
        //Check starID against Array bounds
        if((0 > starID) || (starsArray.length < starID))
        {
            return null;
        }

        return starsArray[starID];
    }

    @Override
    public String toString()
    {
        //StringBuilder for construction String return
        StringBuilder builder = new StringBuilder();

        //Solar System Information
        builder.append("Solar System (" + systemName + "):\n");

        //Star Information
        builder.append(String.format("--Stars (%d)--\n", GetStarCount()));
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
        builder.append(String.format("--Planets (%d w/ %d moons)--\n", GetPlanetCount(), GetMoonCount()));
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
