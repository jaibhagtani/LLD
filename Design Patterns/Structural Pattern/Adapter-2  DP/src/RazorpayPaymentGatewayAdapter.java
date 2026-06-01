public class RazorpayPaymentGatewayAdapter implements PaymentGateway{

    @Override
    public Long PayViaCC(int cc_no, int cvv, int exp_m, int exp_y) {

//        Here casting and then interacting with actual APIs of Razorpay
        return (long) 0L;
    }

    @Override
    public PaymentStatus checkPaymentCC(Long tx_id) {

//        Here casting and then interacting with actual APIs of Razorpay
        return null;
    }
}
