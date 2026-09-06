class UPIPayment implements Payment {

    private String upiId;
    private double amount;

    UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Payment made using UPI.");
        System.out.println("Amount Paid: Rs. " + amount);
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("UPI ID: " + upiId);
    }
}