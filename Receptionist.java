/**
 * @(#) Receptionist.java
 */

public class Receptionist extends User {

    public Receptionist(String id, String name) {
        super(id, name);
    }

    public Appointment createAppointment(String appointmentID, String date, Doctor doctor, Patient patient) {
        System.out.println("Receptionist " + name + " scheduled an appointment for " + patient.getName());
        return new Appointment(appointmentID, date, doctor, patient);
    }

    public void registerPatient(Patient patient) {
        System.out.println("Receptionist " + name + " registered patient: " + patient.getName());
    }

    public void updatePatientInfo(Patient patient, String newName, int newAge) {
        System.out.println("Updating patient info for " + patient.getName());
        patient.name = newName;
        
    }
}

