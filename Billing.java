/**
 * @(#) Billing.java
 */
@SuppressWarnings("FieldMayBeFinal")
public class Billing {
    private String billID;
    private double amount;
    private boolean isPaid;
    private Appointment appointment;

    public Billing(String billID, double amount, Appointment appointment) {
        this.billID = billID;
        this.amount = amount;
        this.isPaid = false;
        this.appointment = appointment;
    }

    public void processPayment() {
        if (!isPaid) {
            isPaid = true;
            System.out.println("Payment processed for bill " + billID);
        } else {
            System.out.println("Bill " + billID + " is already paid.");
        }
    }

    public void printInvoice() {
        System.out.println("----- Invoice -----");
        System.out.println("Bill ID: " + billID);
        System.out.println("Amount: $" + amount);
        System.out.println("Status: " + (isPaid ? "Paid" : "Unpaid"));
        System.out.println("Appointment ID: " + appointment.getAppointmentID());
        System.out.println("-------------------");
    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getAmount() {
        return amount;
    }

    public String getBillID() {
        return billID;
    }
}

