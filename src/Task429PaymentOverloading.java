public class Task429PaymentOverloading {
    static class CashPayment {
        void accept(String cashAmount) { System.out.println("Accepted cash amount: " + cashAmount); }
        void accept(long chequeNumber) { System.out.println("Accepted cheque number: " + chequeNumber); }
        void accept(int payOrder) { System.out.println("Accepted pay order: " + payOrder); }
    }

    public static void main(String[] args) {
        CashPayment payment = new CashPayment();
        payment.accept("25.500 OMR");
        payment.accept(9876543210L);
        payment.accept(42);
    }
}
