package lt.viko.eif.avasiukeviciute.RestaurantsJAXRS;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Adds restaurants to the list and returns them
 * @getRestaurants gets preset restaurants information from array list of restaurant
 * @setRestaurants add new restaurant information to restaurants list
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "restaurants")
public class Restaurants {
    @XmlElement(name="restaurant")
    private ArrayList<Restaurant> restaurants;

    /**
     * Returns restaurants list
     * @return
     */
    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    /**
     * Adds new restaurant to array
     * @param restaurants
     */
    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
