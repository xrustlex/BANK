import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 */

/**
 * @author dick
 *
 *         17 окт. 2022 г.
 */
@Configuration
public class SpringConfig {

	@Bean
	public Printer getPrinter() {
		return new Printer();
	}

}
