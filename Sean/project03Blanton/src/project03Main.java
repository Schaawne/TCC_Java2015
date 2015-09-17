/**
 * project03Main class for project03Blanton
 *
 * Created by Schaawne on 9/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class project03Main
{
    /**
     * Main Method for project03
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        int planetCount = 9;
        int starCount = 1;

        //Instantiate Sol Solar System
        SolarSystem Sol = new SolarSystem("Sol", starCount, planetCount);

        //Populate Star data into Solar System Stars
        SolarSystemData.SolStarData theSolStarData;
        for(int i = 0; i < starCount; i++)
        {
            theSolStarData = SolarSystemData.SolStarData.values()[i];
            Sol.DefineStar(theSolStarData.starID(), theSolStarData.starName());
        }

        //Populate Planet data into Solar System Planets
        SolarSystemData.SolPlanetData theSolPlanetData;
        for(int i = 0; i < planetCount; i++)
        {
            theSolPlanetData = SolarSystemData.SolPlanetData.values()[i];
            Sol.DefinePlanet(theSolPlanetData.planetID(), theSolPlanetData.planetName(), theSolPlanetData.planetMoons());
        }

        //Print Solar System to console
        System.out.println(Sol.toString());
    }
}
