package lt.viko.eif.avasiukeviciute.RestaurantsJAXRS;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 *@ResourceConfig provides advanced capabilities to simplify registration of JAX-RS components.
 * @Component it enables class from being registered while spring boot auto scans java classes
 */
@Component
public class RestaurantConfiguration extends ResourceConfig {
    public RestaurantConfiguration(){

        register(RestaurantController.class);
    }
}
