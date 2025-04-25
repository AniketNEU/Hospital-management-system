/**
 * @(#) Patient.java
 */

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("FieldMayBeFinal")
public class Patient extends User {
    private int age;
    private List<MedicalRecord> medicalRecords;

     /**
     * Precondition: age must be greater than 0
     * Postcondition: Patient is created with a valid age and empty medical record list
     */
    public Patient(String id, String name, int age) {
        super(id, name);
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.age = age;
        this.medicalRecords = new ArrayList<>();
    }

    /**
     * Precondition: record must not be null
     * Postcondition: record is added to patient's medicalRecords
     */
    public void addMedicalRecord(MedicalRecord record) {
        if (record != null) {
            medicalRecords.add(record);
            System.out.println("Medical record added for patient " + name);
        }
    }

    public void printMedicalHistory() {
        System.out.println("Medical history for " + name + ":");
        for (MedicalRecord rec : medicalRecords) {
            System.out.println("- Diagnosis: " + rec.getDiagnosis());
        }
    }

    public int getAge() {
        return age;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }
}

