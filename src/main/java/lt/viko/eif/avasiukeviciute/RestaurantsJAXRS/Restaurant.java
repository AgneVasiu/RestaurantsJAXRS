package lt.viko.eif.avasiukeviciute.RestaurantsJAXRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Restaurant class has its attributes and methods
 * @Get gets all set parameters
 * @Set sets all the parameters
 * @XmlAttribute is specified on a Record-part field and identifies characteristics of an XML attribute
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRestaurantCategory() {
        return restaurantCategory;
    }

    public void setRestaurantCategory(String restaurantCategory) {
        this.restaurantCategory = restaurantCategory;
    }

    public String getSignatureDish() {
        return signatureDish;
    }

    public void setSignatureDish(String signatureDish) {
        this.signatureDish = signatureDish;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
