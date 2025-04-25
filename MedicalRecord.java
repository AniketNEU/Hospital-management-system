/**
 * @(#) MedicalRecord.java
 */
@SuppressWarnings("FieldMayBeFinal")
public class MedicalRecord {
    private String recordID;
    private String diagnosis;
    private String prescription;

    /**
     * Precondition: diagnosis must not be null or empty
     * Postcondition: medical record is created with given diagnosis and empty prescription
     */
    public MedicalRecord(String recordID, String diagnosis) {
        if (diagnosis == null || diagnosis.isEmpty()) {
            throw new IllegalArgumentException("Diagnosis must not be empty");
        }
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.prescription = "";
    }

    /**
     * Precondition: prescription must not be null or empty
     * Postcondition: prescription is saved to the record
     */
    public void addPrescription(String prescription) {
        if (prescription != null && !prescription.isEmpty()) {
            this.prescription = prescription;
            System.out.println("Prescription added: " + prescription);
        } else {
            System.out.println("Invalid prescription. Not added.");
        }
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public String getRecordID() {
        return recordID;
    }
}


