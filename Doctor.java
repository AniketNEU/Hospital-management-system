/**
 * @(#) Doctor.java
 */


import java.util.ArrayList;
import java.util.List;
public class Doctor extends User {
    private String specialization;
    private List<Patient> patients;

    /**
     * Precondition: specialization must not be null or empty
     * Postcondition: doctor is created with an empty patient list
     */
    public Doctor(String id, String name, String specialization) {
        super(id, name);
        if (specialization == null || specialization.isEmpty()) {
            throw new IllegalArgumentException("Specialization must not be empty");
        }
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    /**
     * Precondition: patient must not be null
     * Postcondition: patient is added to the doctor's list if not already present
     */
    public void addPatient(Patient patient) {
        if (patient != null && !patients.contains(patient)) {
            patients.add(patient);
            System.out.println("Patient " + patient.getName() + " added to doctor " + name);
        }
    }

    /**
     * Precondition: doctor must have at least one patient
     * Postcondition: displays appointments related to this doctor
     */
    public void viewAppointments(List<Appointment> allAppointments) {
        if (patients.isEmpty()) {
            System.out.println("Doctor " + name + " has no registered patients.");
            return;
        }

        System.out.println("Appointments for Dr. " + name + ":");
        for (Appointment app : allAppointments) {
            if (app.getDoctor() == this) {
                System.out.println("- " + app.getStatus() + " on " + app.getDate());
            }
        }
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}


