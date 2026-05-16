package Simple_Factory;

public class Client {

    static void main() {
        TaxCalFactory tcf = new TaxCalFactory();
        SalaryDetails d = new SalaryDetails();
        Double tax = tcf.getTaxAlgo(taxType.OLD).calculateTax(d);

        System.out.println(tax);
    }
}
