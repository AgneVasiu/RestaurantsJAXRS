package lt.viko.eif.avasiukeviciute.RestaurantsJAXRS;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Adds restaurants to the list and returns them
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "restaurants")
public class Restaurants {

    @XmlElement(name="restaurant")
    private ArrayList<Restaurant> restaurants;

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
