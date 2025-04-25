/**
 * @(#) Appointment.java
 */
import java.time.LocalDate;
@SuppressWarnings("FieldMayBeFinal")
public class Appointment {
    private String appointmentID;
    private String date;
    private String status;
    private Doctor doctor;
    private Patient patient;

    /**
     * Precondition: date must not be in the past, doctor and patient must not be null
     * Postcondition: Appointment is created with 'Scheduled' status
     */
    public Appointment(String appointmentID, String date, Doctor doctor, Patient patient) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.status = "Scheduled";

        if (doctor == null || patient == null) {
            throw new IllegalArgumentException("Doctor and Patient must not be null");
        }

        LocalDate appointmentDate = LocalDate.parse(date);
        if (appointmentDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Appointment date cannot be in the past");
        }

        this.doctor = doctor;
        this.patient = patient;
    }

    /**
     * Precondition: status must be 'Scheduled'
     * Postcondition: status changes to 'Cancelled'
     */
    public void cancelAppointment() {
        if ("Scheduled".equalsIgnoreCase(this.status)) {
            this.status = "Cancelled";
            System.out.println("Appointment " + appointmentID + " has been cancelled.");
        } else {
            System.out.println("Cannot cancel. Current status: " + this.status);
        }
    }

    /**
     * Precondition: status must be 'Scheduled'
     * Postcondition: status changes to 'Completed'
     */
    public void completeAppointment() {
        if ("Scheduled".equalsIgnoreCase(this.status)) {
            this.status = "Completed";
            System.out.println("Appointment " + appointmentID + " marked as completed.");
        } else {
            System.out.println("Appointment is not in a state that can be completed.");
        }
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getAppointmentID() {
        return appointmentID;
    }
}


