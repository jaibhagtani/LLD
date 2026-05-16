package Simple_Factory;

public class NewTaxAlgo implements TaxAlgo {

    @Override
    public Double calculateTax(SalaryDetails d) {
        return 0.4 * d.getBasePay() + 0.3 * d.getHra();
    }
}
