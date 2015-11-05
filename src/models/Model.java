package models;

import utility.Patient;

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
    }
}
