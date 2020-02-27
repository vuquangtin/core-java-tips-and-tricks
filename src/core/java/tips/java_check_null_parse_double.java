package core.java.tips;
import static org.assertj.core.api.Assertions.assertThat;
/**
 *
 * 
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/core-java-tips-and-tricks">https://github.com/vuquangtin/core-java-tips-and-tricks</a>
 *
 */
public class java_check_null_parse_double {
	// @see https://www.baeldung.com/java-check-null-parse-double
	public static void main(String[] args) {
		assertThat(parseStringToDouble("1", 2.0d)).isEqualTo(1.0d);
		assertThat(parseStringToDouble(null, 1.0d)).isEqualTo(1.0d);
		assertThat(parseStringToDouble("", 1.0d)).isEqualTo(1.0d);
	}

	/***
	 * Using Vanilla Java
	 * 
	 * Let's start by defining a simple method that will check if the value we
	 * pass is null or an empty String:
	 * 
	 * @param value
	 * @return
	 */
	private static double parseStringToDouble(String value) {
		return value == null || value.isEmpty() ? Double.NaN : Double
				.parseDouble(value);
	}

	private static double parseStringToDouble(String value, double defaultValue) {
		return value == null || value.isEmpty() ? defaultValue : Double
				.parseDouble(value);
	}
}
