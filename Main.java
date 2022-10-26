/*
* This file creates an airplane and a jet from the respective
* classes, accelerates them, and outputs the speed.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-10-26
*/

/**
 * This program runs alongside Airplane.java and Jet.java
 */

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Declare "Magic Numbers".
        final int two = 2;
        final int four = 4;
        final int twoHundredTwelve = 212;
        final int fourHundredTwentyTwo = 422;
        final int fiveThousand = 5000;

        // Create biplane from Airplane class.
        final Airplane biplane = new Airplane();
        biplane.setSpeed(twoHundredTwelve);
        System.out.println(biplane.getSpeed());

        // Create boeing from Jet class.
        final Jet boeing = new Jet();
        boeing.setSpeed(fourHundredTwentyTwo);
        System.out.println(boeing.getSpeed());

        // Accelerate both aircraft.
        for (int i = 0; i < four; i++) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > fiveThousand) {
                biplane.setSpeed(biplane.getSpeed() * two);
            } else {
                boeing.accelerate();
            }
        }
        System.out.println(biplane.getSpeed());
    }
}
