public class Main {

    public static void main(String[] args) {

        // Creating UPIPayment object
        Payment upiPayment = new UPIPayment(
            "sneha@upi",
            500.00
        );

        // Creating CardPayment object
        Payment cardPayment = new CardPayment(
            "1234-5678-9012",
            1000.00
        );

        System.out.println("----- UPI PAYMENT -----");
        upiPayment.pay();
        upiPayment.showPaymentDetails();

        System.out.println();

        System.out.println("----- CARD PAYMENT -----");
        cardPayment.pay();
        cardPayment.showPaymentDetails();
    }
}