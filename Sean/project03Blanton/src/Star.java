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
    /**
     * Star Constructor
     *
     * @param name Star Name (->CelestialBody Constructor)
     */
    Star(String name)
    {
        super(name);
    }

    @Override
    public String toString()
    {
        return String.format("Star: %10s", "(" + getName() + ")");
    }
}
