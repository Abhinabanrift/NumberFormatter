package test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import main.NumberFormatter;

public class NumberFormatterTest {
	@Test
	public void testFormatNegativeNumber() {
		BigDecimal number = new BigDecimal("-1234567.89");
		String expected = "-1,234,567.89";
		String actual = NumberFormatter.formatNumber(number);
		assertEquals(expected, actual);
		
		number = BigDecimal.ZERO;
		expected = "0";
		actual = NumberFormatter.formatNumber(number);
		assertEquals(expected, actual);
		
		
		number = new BigDecimal("1234567890123456");
		expected = "1,234,567,890,123,456";
		actual = NumberFormatter.formatNumber(number);
		assertEquals(expected, actual);
		
		number = new BigDecimal("0.000123456789");
		expected = "0.000123456789";
		actual = NumberFormatter.formatNumber(number);
		assertEquals(expected, actual);
	}


}
