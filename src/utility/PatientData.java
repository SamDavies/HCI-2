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

    public int getScore() {
        int score = 0;

        // Breathing
        if(this.breathing <= 8) {
            score += 3;
        }else if(9 <= this.breathing && this.breathing <= 20){
            score += 0;
        }else if(21 <= this.breathing && this.breathing <= 30){
            score += 1;
        }else if(31 <= this.breathing && this.breathing <= 35){
            score += 2;
        }else if(36 <= this.breathing){
            score += 3;
        }

        // Oxygen
        if(this.oxygen < 85) {
            score += 3;
        }else if(85 <= this.oxygen && this.oxygen <= 89){
            score += 2;
        }else if(90 <= this.oxygen && this.oxygen <= 92){
            score += 1;
        }else if(93 <= this.oxygen && this.oxygen <= 35){
            score += 0;
        }

        // temperature
        if(this.temperature < 34) {
            score += 3;
        }else if(34 <= this.temperature && this.temperature <= 34.9){
            score += 2;
        }else if(35 <= this.temperature && this.temperature <= 36){
            score += 1;
        }else if(36 <= this.temperature && this.temperature <= 38){
            score += 0;
        }else if(38 <= this.temperature && this.temperature <= 38.5){
            score += 1;
        }else if(38.5 <= this.temperature){
            score += 2;
        }

        // bloodPressure
        if(this.bloodPressure <= 69) {
            score += 3;
        }else if(70 <= this.bloodPressure && this.bloodPressure <= 79){
            score += 2;
        }else if(80 <= this.bloodPressure && this.bloodPressure <= 99){
            score += 1;
        }else if(100 <= this.bloodPressure && this.bloodPressure <= 199){
            score += 0;
        }else if(200 <= this.bloodPressure){
            score += 2;
        }

        // heartRate
        if(this.heartRate < 29) {
            score += 3;
        }else if(30 <= this.heartRate && this.heartRate <= 39){
            score += 2;
        }else if(40 <= this.heartRate && this.heartRate <= 49){
            score += 1;
        }else if(50 <= this.heartRate && this.heartRate <= 99){
            score += 0;
        }else if(100 <= this.heartRate && this.heartRate <= 109){
            score += 1;
        }else if(110 <= this.heartRate && this.heartRate <= 129){
            score += 2;
        }else if(130 <= this.heartRate){
            score += 3;
        }

        return score;
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
