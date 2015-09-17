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
        /** SOL Solar System */
        int solPlanetCount = SolarSystemData.SolPlanetData.values().length;
        int solStarCount = SolarSystemData.SolStarData.values().length;

        //Instantiate Sol Solar System
        SolarSystem Sol = new SolarSystem(SolarSystemData.SolStarData.systemName(), solStarCount, solPlanetCount);

        //Populate Star data into Solar System Stars
        SolarSystemData.SolStarData theSolStarData;
        for(int i = 0; i < solStarCount; i++)
        {
            theSolStarData = SolarSystemData.SolStarData.values()[i];
            Sol.DefineStar(theSolStarData.starID(),
                    theSolStarData.starName(),
                    theSolStarData.luminosity(),
                    theSolStarData.radiance(),
                    theSolStarData.mass(),
                    theSolStarData.radius()
            );
        }

        //Populate Planet data into Solar System Planets
        SolarSystemData.SolPlanetData theSolPlanetData;
        for(int i = 0; i < solPlanetCount; i++)
        {
            theSolPlanetData = SolarSystemData.SolPlanetData.values()[i];
            Sol.DefinePlanet(theSolPlanetData.planetID(),
                    theSolPlanetData.planetName(),
                    theSolPlanetData.planetMoons(),
                    theSolPlanetData.mass(),
                    theSolPlanetData.radius()
            );
        }

        //Print Solar System to console
        System.out.println(Sol.toString());

        /** RIGIL KENT Solar System */
        int rkPlanetCount = SolarSystemData.RigilKentPlanetData.values().length;
        int rkStarCount = SolarSystemData.RigilKentStarData.values().length;

        //Instantiate Rigil Kent Solar System
        SolarSystem RigilKent = new SolarSystem(SolarSystemData.RigilKentStarData.systemName(), rkStarCount, rkPlanetCount);

        //Populate Star data into Solar System Stars
        SolarSystemData.RigilKentStarData theRKStarData;
        for(int i = 0; i < rkStarCount; i++)
        {
            theRKStarData = SolarSystemData.RigilKentStarData.values()[i];
            RigilKent.AddStar(theRKStarData.starID(),
                    new Star(theRKStarData.starName(),
                        theRKStarData.luminosity(),
                        theRKStarData.radiance(),
                        theRKStarData.mass(),
                        theRKStarData.radius()
                    )
            );
        }

        //Populate Planet data into Solar System Planets
        SolarSystemData.RigilKentPlanetData theRKPlanetData;
        for(int i = 0; i < rkPlanetCount; i++)
        {
            theRKPlanetData = SolarSystemData.RigilKentPlanetData.values()[i];
            RigilKent.AddPlanet(theRKPlanetData.planetID(),
                    new Planet(theRKPlanetData.planetName(),
                        theRKPlanetData.planetMoons(),
                        theRKPlanetData.mass(),
                        theRKPlanetData.radius()
                    )
            );
        }

        //Print Solar System to console
        System.out.println(RigilKent.toString());
    }
}