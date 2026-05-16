package Simple_Factory;

import java.lang.management.MemoryNotificationInfo;

public class TaxCalFactory {

    public TaxAlgo getTaxAlgo(taxType taxType)
    {
        switch (taxType)
        {
            case OLD :
                return new OldTaxAlgo();
            case NEW:
                return new NewTaxAlgo();
        }

        throw new RuntimeException("Invalid regime" + taxType);
    }
}
