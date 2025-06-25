package abs_lab;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        
        Personable student = new Student();
        student.setPersonDetails();
        student.displayPersonDetails();

        // calculate payment (casting)
        ((Payables) student).calaculatePayment();
        student.achievementStatus();

        Personable trainer = new Trainer();
        trainer.setPersonDetails();
        trainer.displayPersonDetails();
        ((Payables) trainer).calaculatePayment();
    }
}
