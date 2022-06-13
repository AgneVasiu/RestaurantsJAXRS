package lt.viko.eif.avasiukeviciute.RestaurantsJAXRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Restaurant class has its attributes and methods
 * @XmlAttribute is specified on a Record-part field and identifies characteristics of an XML attribute
 * @Autor Agne Vasiukeviciute PI20S
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "restaurant")
public class Restaurant implements Serializable {
    private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "id")
    private int id;

    @XmlAttribute(name="uri")
    private String uri;

    @XmlAttribute(name="restaurantName")
    private String restaurantName;

    @XmlAttribute(name="city")
    private String city;

    @XmlAttribute(name="address")
    private String address;

    @XmlAttribute(name="email")
    private String email;

    @XmlAttribute(name="number")
    private int number;

    @XmlAttribute(name="restaurantCategory")
    private String restaurantCategory;

    @XmlAttribute(name="signatureDish")
    private String signatureDish;

    /**
     * Returns Id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets Restaurant Name
     * @return
     */

    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * Sets Restaurant Name
     * @param restaurantName
     */

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * Gets city
     * @return
     */

    public String getCity() {
        return city;
    }

    /**
     * Sets City name
     * @param city
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets Address
     * @return
     */

    public String getAddress() {
        return address;
    }

    /**
     * Sets Address
     * @param address
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns Email address
     * @return
     */

    public String getEmail() {
        return email;
    }

    /**
     * Sets Email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets Number
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets numbers
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Gets Restaurant Category
     * @return
     */
    public String getRestaurantCategory() {
        return restaurantCategory;
    }

    /**
     * Sets Restaurant Category
     * @param restaurantCategory
     */
    public void setRestaurantCategory(String restaurantCategory) {
        this.restaurantCategory = restaurantCategory;
    }

    /**
     * Get Signature Dish
     * @return
     */
    public String getSignatureDish() {
        return signatureDish;
    }

    /**
     * Sets Signature Dish
     * @param signatureDish
     */
    public void setSignatureDish(String signatureDish) {
        this.signatureDish = signatureDish;
    }

    /**
     * Gets Uri
     * @return
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets Uri /retsurants/1
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }
}
