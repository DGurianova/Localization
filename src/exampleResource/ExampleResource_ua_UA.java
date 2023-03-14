package exampleResource;

import java.math.BigDecimal;
import java.util.ListResourceBundle;


public class ExampleResource_ua_UA extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"currency", "Hryvnia"},
                {"toUsdRate", new BigDecimal("36.74")},
                {"capital", new String("Київ")}
        };
    }
}
