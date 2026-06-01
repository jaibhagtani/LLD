public interface PaymentGateway {

    Long PayViaCC(int cc_no, int cvv, int exp_m, int exp_y);

    PaymentStatus checkPaymentCC(Long tx_id);
}
