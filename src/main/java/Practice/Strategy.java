package Practice;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying "+amount+" through credit card");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying "+amount+" through paypal");
    }
}

class PaymentStrategy {
    private Payment strategy;
    public void setPaymentStrategy(Payment strategy) {
        this.strategy = strategy;
    }
    public void checkout(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        strategy.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        PaymentStrategy payment = new PaymentStrategy();

        payment.setPaymentStrategy(new CreditCardPayment());
        payment.checkout(25.698);

        payment.setPaymentStrategy(new PayPalPayment());
        payment.checkout(17.179);
    }
}
