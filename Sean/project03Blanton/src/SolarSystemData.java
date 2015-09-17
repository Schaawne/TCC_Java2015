/**
 * SolarSystemData enum for project03Blanton
 * <p>
 * Created by Schaawne on 9/16/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
class SolarSystemData
{
    enum SolPlanetData
    {
        //      ID#, Name,      #Moons
        MERCURY (0, "Mercury", 0),
        VENUS   (1, "Venus", 0),
        EARTH   (2, "Earth", 0),
        MARS    (3, "Mars", 0),
        JUPITER (4, "Jupiter", 0),
        SATURN  (5, "Saturn", 0),
        URANUS  (6, "Uranus", 0),
        NEPTUNE (7, "Neptune", 0),
        PLUTO   (8, "Pluto", 0);

        //storage
        private int planetID;
        private String planetName;
        private int planetMoons;

        //constructor for enum
        SolPlanetData(int planetID, String planetName, int planetMoons)
        {
            this.planetID = planetID;
            this.planetName = planetName;
            this.planetMoons = planetMoons;
        }

        /**
         * Getters
         */
        public int planetID()
        {
            return planetID;
        }
        public String planetName()
        {
            return planetName;
        }
        public int planetMoons()
        {
            return planetMoons;
        }
    }

    enum SolStarData
    {
        SOL (0, "Sol");

        //storage
        private int starID;
        private String starName;

        //constructor for enum
        SolStarData(int starID, String starName)
        {
            this.starID = starID;
            this.starName = starName;
        }

        /**
         * Getters
         */
        public int starID()
        {
            return starID;
        }
        public String starName()
        {
            return starName;
        }
    }
}
