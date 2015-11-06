package models;

import utility.Patient;
import utility.PatientData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by samdavies on 05/11/2015.
 */
public class Model {
    public static final int RESPIRATORY_RATE = 0;
    public static final int SPO2 = 1;
    public static final int SYSTOLIC = 2;
    public static final int HEART_RATE = 3;
    public static final float TEMPERATURE = 0f;

    public ArrayList<Patient> patients = new ArrayList<Patient>();

    public int selectedPatient = 0;

    protected Model() {
        // read in all the data
        try {
            this.getPatientList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getPatientList() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("data/patientList.csv"));
        // skip the labels
        scanner.nextLine();
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] data = line.split(",");
            Patient patient = new Patient(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], 0, 0, 0, 0);
            this.patients.add(patient);
        }
        scanner.close();

        putPatientData(this.patients.get(0), "data/Alice_Bailey_20141011091022.csv");
        putPatientData(this.patients.get(1), "data/Charlie_Dean_20141013103445.csv");
        putPatientData(this.patients.get(2), "data/Elise_Foster_20141013122956.csv");
        putPatientData(this.patients.get(3), "data/Grace_Hughes_20141013161902.csv");
        putPatientData(this.patients.get(4), "data/Ian_Jones_20141013142915.csv");
        putPatientData(this.patients.get(5), "data/Kelly_Lawrence_201410141532.csv");
    }

    public void putPatientData(Patient patient, String url) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(url));
        // skip the labels
        scanner.nextLine();
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                String[] data = line.split(",");
                PatientData patientData = new PatientData(
                        Integer.parseInt(data[1]), Integer.parseInt(data[2]), Float.parseFloat(data[3]),
                        Integer.parseInt(data[4]), Integer.parseInt(data[5])
                );
                patient.data.put(data[0], patientData);
            }
        }
        scanner.close();
    }
}
