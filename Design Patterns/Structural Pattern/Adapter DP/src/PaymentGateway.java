public interface PaymentGateway {

    Long PayViaCC(int cc_no, int cvv, int exp);

    PaymentStatus checkPaymentCC(int tx_id);
}
