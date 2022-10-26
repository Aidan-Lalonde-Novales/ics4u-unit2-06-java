/*
* This file contains fields and methods to be applied to an Airplane.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-10-26
*/

/**
 * Airplane Class.
 */
public class Airplane {

    /**
     * Declare airplane speed.
     */
    private int speed;

    /**
     * GetSpeed() method - returns the current speed value.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * SetSpeed() method - changes the speed value.
     *
     * @param speedInput - input from Main to fill in for speed value
     */
    public void setSpeed(int speedInput) {
        this.speed = speedInput;
    }
}
