/**
 * @(#) Nurse.java
 */

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("FieldMayBeFinal")
public class Nurse extends User {
    private List<Patient> assignedPatients;

    public Nurse(String id, String name) {
        super(id, name);
        this.assignedPatients = new ArrayList<>();
    }

    public void assignPatient(Patient patient) {
        if (!assignedPatients.contains(patient)) {
            assignedPatients.add(patient);
            System.out.println("Patient " + patient.getName() + " assigned to nurse " + name);
        }
    }

    public void recordObservation(Patient patient, String observation) {
        System.out.println("Observation for " + patient.getName() + ": " + observation);
    }

    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }
}
