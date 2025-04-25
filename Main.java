import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Users
        Doctor doc = new Doctor("D001", "Dr. Smith", "Cardiology");
        Nurse nurse = new Nurse("N001", "Nurse Alice");
        Receptionist receptionist = new Receptionist("R001", "Receptionist Jane");

        // Create Patient
        Patient patient = new Patient("P001", "John Doe", 35);

        // Register patient
        receptionist.registerPatient(patient);

        // Schedule Appointment
        Appointment appointment = receptionist.createAppointment("A001", "2025-04-08", doc, patient);

        // Complete and Bill
        appointment.completeAppointment();
        Billing billing = new Billing("B001", 250.0, appointment);
        billing.printInvoice();
        billing.processPayment();

        // Medical Record
        MedicalRecord record = new MedicalRecord("MR001", "High Blood Pressure");
        record.addPrescription("Amlodipine 5mg daily");
        patient.addMedicalRecord(record);
        patient.printMedicalHistory();

        // Lab Test
        LabTest test = new LabTest("LT001", "Blood Test", patient, doc);
        test.recordResult("Normal");

        // Doctor views Appointments
        List<Appointment> allAppointments = new ArrayList<>();
        allAppointments.add(appointment);
        doc.viewAppointments(allAppointments);

        // Nurse assigns and records observation
        nurse.assignPatient(patient);
        nurse.recordObservation(patient, "Stable vitals, resting well.");
    }
}
