package lt.viko.eif.avasiukeviciute.RestaurantsJAXRS;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * RestaurantController has all the methods for getting date from http requests and ads
 * the correct data to the local json database.
 * @Path sets application endpoint
 * @Get gets requests form postman, soap ui .... and sends list of restaurants or one restaurant data by id
 * @Post gets requests form postman, soap ui .... and adds the parameters that it got to local database
 * @Put gets requests form postman, soap ui and updates one specified restaurant information by id
 * @Delete gets requests form postman, soap ui and deletes restaurant information by id
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "restaurants")
@Path("/restaurants")
public class RestaurantController {

    private static Map<Integer, Restaurant> DB = new HashMap<>();

    /**
     * Gets and exports all restaurants
     * @return
     */
    @GET
    @Produces("application/json")
    public Restaurants getAllRestaurants() {
        Restaurants restaurants = new Restaurants();
        restaurants.setRestaurants(new ArrayList<>(DB.values()));
        return restaurants;
    }

    /**
     * Resives information and ads to virtual database.
     * @param restaurant
     * @return
     * @throws URISyntaxException
     */
    @POST
    @Consumes("application/json")
    public Response createRestaurant(Restaurant restaurant) throws URISyntaxException {
        if (restaurant.getRestaurantName() == null || restaurant.getCity() == null || restaurant.getAddress() == null
                || restaurant.getEmail() == null) {
            return Response.status(400).entity("Please provide all inputs").build();
        }
        restaurant.setId(DB.values().size() + 1);
        restaurant.setUri("/restaurant/" + restaurant.getId());
        DB.put(restaurant.getId(), restaurant);
        return Response.status(201).contentLocation(new URI(restaurant.getUri())).build();
    }

    /**
     * Gets and exports restaurants information by id
     * @param id
     * @return
     * @throws URISyntaxException
     */
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getUserById(@PathParam("id") int id) throws URISyntaxException
    {
        Restaurant restaurant = DB.get(id);
        if(restaurant == null) {
            return Response.status(404).build();
        }
        return Response
                .status(200)
                .entity(restaurant)
                .contentLocation(new URI("/restaurant/"+id)).build();
    }

    /**
     * Updates information of restaurant by id
     * @param id
     * @param restaurant
     * @return
     * @throws URISyntaxException
     */
    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response updateUser(@PathParam("id") int id, Restaurant restaurant) throws URISyntaxException
    {
        Restaurant temp = DB.get(id);
        if(restaurant == null) {
            return Response.status(404).build();
        }
        temp.setRestaurantName(restaurant.getRestaurantName());
        temp.setCity(restaurant.getCity());
        temp.setAddress(restaurant.getAddress());
        temp.setEmail(restaurant.getEmail());
        temp.setNumber(restaurant.getNumber());
        temp.setRestaurantCategory(restaurant.getRestaurantCategory());
        temp.setSignatureDish(restaurant.getSignatureDish());
        DB.put(temp.getId(), temp);
        return Response.status(200).entity(temp).build();
    }

    /**
     * Deletes information of restaurant by Id
     * @param id
     * @return
     * @throws URISyntaxException
     */
    @DELETE
    @Path("/{id}")
    public Response deleteRestaurant(@PathParam("id") int id) throws URISyntaxException {
        Restaurant restaurant = DB.get(id);
        if(restaurant != null) {
            DB.remove(restaurant.getId());
            return Response.status(200).build();
        }
        return Response.status(404).build();
    }

    static
    {
        Restaurant restaurant1 = new Restaurant();
        restaurant1.setId(1);
        restaurant1.setRestaurantName("French Taste");
        restaurant1.setCity("Strasbourg");
        restaurant1.setAddress("Ligation.st 35");
        restaurant1.setEmail("frenchtaste@email.com");
        restaurant1.setNumber(356984582);
        restaurant1.setRestaurantCategory("French Cuisine");
        restaurant1.setSignatureDish("Stake");
        restaurant1.setUri("/restaurant/1");

        Restaurant restaurant2 = new Restaurant();
        restaurant2.setId(2);
        restaurant2.setRestaurantName("Burger House");
        restaurant2.setCity("Tryskiai");
        restaurant2.setAddress("kernaves.g 15");
        restaurant2.setEmail("burgerhouse@email.com");
        restaurant2.setNumber(869845821);
        restaurant2.setRestaurantCategory("Amerikirtiska");
        restaurant2.setSignatureDish("Vistienos Burgeris");
        restaurant2.setUri("/restaurant/2");


        DB.put(restaurant1.getId(), restaurant1);
        DB.put(restaurant2.getId(), restaurant2);
    }



}
