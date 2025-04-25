/**
 * @(#) LabTest.java
 */

public class LabTest {
    private final String testID;
    private final String testName;
    private  String result;
    private final Patient patient;
    private final Doctor requestedBy;

    public LabTest(String testID, String testName, Patient patient, Doctor requestedBy) {
        this.testID = testID;
        this.testName = testName;
        this.patient = patient;
        this.requestedBy = requestedBy;
        this.result = "Pending";
    }

    public void recordResult(String result) {
        if (result != null && !result.isEmpty()) {
            this.result = result;
            System.out.println("Result recorded for test " + testID + ": " + result);
        }
    }

    public String getResult() {
        return result;
    }

    public String getTestName() {
        return testName;
    }

    public String getTestID() {
        return testID;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getRequestedBy() {
        return requestedBy;
    }
}

