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
    //Data for Sol System Planet(s)
    enum SolPlanetData
    {
        //     ID#, Name,       #Moons  Mass      Mean Radius
        MERCURY (0, "Mercury",  0,      3.301e23, 2439.7),
        VENUS   (1, "Venus",    0,      4.867e24, 6051.8),
        EARTH   (2, "Earth",    1,      5.972e24, 6371.0),
        MARS    (3, "Mars",     2,      6.417e23, 3389.5),
        JUPITER (4, "Jupiter",  67,     1.898e27, 69911.0),
        SATURN  (5, "Saturn",   62,     5.684e26, 58232.0),
        URANUS  (6, "Uranus",   27,     8.681e25, 25362.0),
        NEPTUNE (7, "Neptune",  14,     1.024e26, 24622.0);

        //storage
        private int planetID;
        private String planetName;
        private int planetMoons;
        private double mass;
        private double radius;

        //constructor for enum
        SolPlanetData(int planetID, String planetName, int planetMoons, double mass, double radius)
        {
            this.planetID = planetID;
            this.planetName = planetName;
            this.planetMoons = planetMoons;
            this.mass = mass;
            this.radius = radius;
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
        public double mass()
        {
            return mass;
        }
        public double radius()
        {
            return radius;
        }
    }

    //Data for Sol System Star(s)
    enum SolStarData
    {
        // ID#  Name   Luminosity Radiance Mass      Mean Radius
        SOL (0, "Sol", 3.846e26,  2.009e7, 1.988e30, 696342.0);

        //storage
        private int starID;
        private String starName;
        private double luminosity;  //W
        private double radiance;    //W * sr^(-1) * m^(-2)
        private double mass;        //kg
        private double radius;      //km

        //constructor for enum
        SolStarData(int starID, String starName, double luminosity, double radiance, double mass, double radius)
        {
            this.starID = starID;
            this.starName = starName;
            this.luminosity = luminosity;
            this.radiance = radiance;
            this.mass = mass;
            this.radius = radius;
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
        public double luminosity()
        {
            return luminosity;
        }
        public double radiance()
        {
            return radiance;
        }
        public double mass()
        {
            return mass;
        }
        public double radius()
        {
            return radius;
        }
        public static String systemName()
        {
            return "Sol";
        }
    }

    //Data for Rigil Kent System Star(s)
    enum RigilKentStarData
    {
        //           ID#  Name              Luminosity Radiance Mass      Mean Radius
        AlphaCentauriA(0, "AlphaCentauriA", 5.842e26,  0.0,     2.186e30, 854411.6),
        AlphaCentauriB(1, "AlphaCentauriB", 1.923e26,  0.0,     1.803e30, 602335.8),
        AlphaCentauriC(2, "AlphaCentauriC", 6.538e23,  0.0,     2.445e29, 98184.2);

        //storage
        private int starID;
        private String starName;
        private double luminosity;  //W
        private double radiance;    //W * sr^(-1) * m^(-2)
        private double mass;        //kg
        private double radius;      //km

        //constructor for enum
        RigilKentStarData(int starID, String starName, double luminosity, double radiance, double mass, double radius)
        {
            this.starID = starID;
            this.starName = starName;
            this.luminosity = luminosity;
            this.radiance = radiance;
            this.mass = mass;
            this.radius = radius;
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
        public double luminosity()
        {
            return luminosity;
        }
        public double radiance()
        {
            return radiance;
        }
        public double mass()
        {
            return mass;
        }
        public double radius()
        {
            return radius;
        }
        public static String systemName()
        {
            return "Rigil Kent";
        }
    }

    //Data for Rigil Kent System Planet(s)
    enum RigilKentPlanetData
    {
        //             ID#, Name,                 #Moons  Mass      Mean Radius
        AlphaCantauriBb (0, "Alpha Centauri Bb",  0,      5.577e24, 5498.1);

        //storage
        private int planetID;
        private String planetName;
        private int planetMoons;
        private double mass;
        private double radius;

        //constructor for enum
        RigilKentPlanetData(int planetID, String planetName, int planetMoons, double mass, double radius)
        {
            this.planetID = planetID;
            this.planetName = planetName;
            this.planetMoons = planetMoons;
            this.mass = mass;
            this.radius = radius;
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
        public double mass()
        {
            return mass;
        }
        public double radius()
        {
            return radius;
        }
    }
}