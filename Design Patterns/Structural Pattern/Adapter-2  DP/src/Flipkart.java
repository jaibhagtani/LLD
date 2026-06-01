public class Flipkart {
    private PaymentGateway paymentGateway;

//    Dependency Injection
    Flipkart(PaymentGateway paymentGateway)
    {
        this.paymentGateway = paymentGateway;
    }
    public void makePaymentCC(int cc_no, int ccv, int ex_m, int ex_y)
    {
        Long tx_id = paymentGateway.PayViaCC(cc_no, ccv, ex_m, ex_y);

        while(!paymentGateway.checkPaymentCC(tx_id).equals(PaymentStatus.SUCCESS))
        {
            System.out.println("Waiting");
        }
    }
}
