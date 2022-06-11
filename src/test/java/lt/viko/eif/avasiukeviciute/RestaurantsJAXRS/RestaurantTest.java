package lt.viko.eif.avasiukeviciute.RestaurantsJAXRS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void setId() {
        Restaurant restaurant = new Restaurant();
        restaurant.setId(5);
        assertNotEquals(4, restaurant.getId());
    }

    @Test
    void setRestaurantName() {
        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurantName("Funn");
        assertNotEquals("Fine", restaurant.getId());
    }

    @Test
    void setCity() {
        Restaurant restaurant = new Restaurant();
        restaurant.setCity("laukuva");
        assertEquals("laukuva", restaurant.getCity());
    }

    @Test
    void setAddress() {
        Restaurant restaurant = new Restaurant();
        restaurant.setAddress("test123");
        assertEquals("test123", restaurant.getAddress());
    }

    @Test
    void setEmail() {
        Restaurant restaurant = new Restaurant();
        restaurant.setEmail("fun@email.com");
        assertEquals("fun@email.com", restaurant.getEmail());
    }

    @Test
    void setNumber() {
        Restaurant restaurant = new Restaurant();
        restaurant.setNumber(2568);
        assertNotEquals(1236, restaurant.getNumber());
    }

    @Test
    void setRestaurantCategory() {
        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurantCategory("italian");
        assertEquals("italian", restaurant.getRestaurantCategory());
    }

    @Test
    void setSignatureDish() {
        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurantCategory("italian");
        assertEquals("italian", restaurant.getRestaurantCategory());
    }

    @Test
    void setUri() {
        Restaurant restaurant = new Restaurant();
        restaurant.setUri("res/1");
        assertEquals("res/1", restaurant.getUri());

    }
}