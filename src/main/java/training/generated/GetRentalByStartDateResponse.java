//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.14 at 11:30:32 AM EDT 
//


package training.generated;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="rental" type="{my-namespace}rental"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rental"
})
@XmlRootElement(name = "getRentalByStartDateResponse")
public class GetRentalByStartDateResponse {

    @XmlElement(required = true)
    protected List<Rental> rental;

    /**
     * Gets the value of the rental property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rental property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRental().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rental }
     * 
     * 
     */
    public List<Rental> getRental() {
        if (rental == null) {
            rental = new ArrayList<Rental>();
        }
        return this.rental;
    }

    public void setRental(List<Rental> value) {
        this.rental = value;
    }

}
