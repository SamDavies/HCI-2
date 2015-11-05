package utility;

import java.util.Random;

/**
 * Created by samdavies on 05/11/2015.
 */
public class RandomData {

    /**
     * Create a random int number
     */
    public static int generateReading(int kind) {
        Random random = new Random();
        int returnReading = 0;
        switch (kind) {
            case 0: //Breathing Rate
                returnReading = random.nextInt(35) + 5 + 1;
                break;
            case 1: //SPO2
                returnReading = random.nextInt(20) + 80 + 1;
                break;
            case 2: //Blood Pressure - SYSTOLIC
                returnReading = random.nextInt(150) + 60 + 1;
                break;
            case 3: //Heart Rate
                returnReading = random.nextInt(20) + 140 + 1;
                break;
            default:
                break;
        }
        return returnReading;
    }

    /**
     * Create a random float number - body temp
     */
    public static float generateReading(float kind) {
        Random random = new Random();
        return random.nextFloat() * 6 + 33;
    }

    /**
     * Create a random int number in a range - you might want to use this for testing
     */
    public static int generateReadingInRange(int lower, int upper) {
        Random random = new Random();
        return random.nextInt(upper - lower) + lower + 1;
    }
}
