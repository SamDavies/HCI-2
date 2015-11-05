package utility;

import java.security.Timestamp;

/**
 * Created by samdavies on 05/11/2015.
 *
 */
public class PatientData {


    private final int timestamp;
    private final int breathing;
    private final int oxygen;
    private final float temperature;
    private final int bloodPressure;
    private final int heartRate;

    public PatientData(int timestamp, int breathing, int oxygen, float temperature, int bloodPressure, int heartRate) {
        this.timestamp = timestamp;
        this.breathing = breathing;
        this.oxygen = oxygen;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public int getBreathing() {
        return breathing;
    }

    public int getOxygen() {
        return oxygen;
    }

    public float getTemperature() {
        return temperature;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }
}
