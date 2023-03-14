package exampleResource;

import java.math.BigDecimal;
import java.util.ListResourceBundle;

public class ExampleResource_de_DE extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"currency", "Euro"},
                {"toUsdRate", new BigDecimal("0.93")},
                {"capital", new String("München")}
        };
    }
}
