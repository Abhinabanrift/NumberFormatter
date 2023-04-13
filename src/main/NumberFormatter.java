package main;
import java.math.BigDecimal;

public class NumberFormatter {
    public static String formatNumber(BigDecimal number) {
        String[] parts = number.toString().split("\\.");
        String integerPart = parts[0];
        String decimalPart = (parts.length > 1) ? "." + parts[1] : "";
        
        StringBuilder formattedNumber = new StringBuilder();
        int count = 0;
        for (int i = integerPart.length() - 1; i >= 0; i--) {
            char c = integerPart.charAt(i);
            formattedNumber.insert(0, c);
            count++;
            if (count % 3 == 0 && i > 0) {
                formattedNumber.insert(0, ",");
            }
        }
        formattedNumber.append(decimalPart);
        return formattedNumber.toString();
    }
}
