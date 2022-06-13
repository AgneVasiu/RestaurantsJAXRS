package lt.viko.eif.avasiukeviciute.RestaurantsJAXRS;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Overrides SpringApplicationBuilder to take parameters of RestaurantApplication
 */
public class ServletInitializer extends SpringBootServletInitializer {
	/**
	 *
	 * @param application
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestaurantApplication.class);
	}

}
