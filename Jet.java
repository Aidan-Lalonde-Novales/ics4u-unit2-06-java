/*
* This class creates a jet using inherited properties from Airplane.java.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-10-26
*/

/**
 * Jet Class.
 */
public class Jet extends Airplane {
    /**
     * Multiplier constant.
     */
    private static final int MULTIPLIER = 2;

    /**
     * Polymorphism for setSpeed() method.
     *
     * @param speedInput - speed to replace current value.
     */
    public void setSpeed(int speedInput) {
        super.setSpeed(speedInput * MULTIPLIER);
    }

    /**
     * Increases the speed of the Jet.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * MULTIPLIER);
    }
}
