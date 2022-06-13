package lt.viko.eif.avasiukeviciute.RestaurantsJAXRS;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Spring boot application runner class
 * @builds application and runs it
 * @Autor Agne Vasiukeviciute PI20S
 */
@SpringBootApplication
public class RestaurantApplication extends SpringBootServletInitializer {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        new RestaurantApplication().configure(new SpringApplicationBuilder(RestaurantApplication.class)).run(args);
    }
}
