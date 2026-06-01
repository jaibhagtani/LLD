public class PayUPaymentGatewayAdapter implements PaymentGateway {
    @Override
    public Long PayViaCC(int cc_no, int cvv, int exp_m, int exp_y) {
//        Here Interacting with the real APIs of PAYU
        return 0L;
    }

    @Override
    public PaymentStatus checkPaymentCC(Long tx_id) {
//        Here Interacting with the real APIs of PAYU
        return null;
    }
}
