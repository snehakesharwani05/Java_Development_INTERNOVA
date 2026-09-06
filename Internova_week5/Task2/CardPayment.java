class CardPayment implements Payment {

    private String cardNumber;
    private double amount;

    CardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Payment made using Card.");
        System.out.println("Amount Paid: Rs. " + amount);
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Card Number: " + cardNumber);
    }
}