//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.14 at 11:30:32 AM EDT 
//


package training.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlRootElement(name = "getRentalByIdResponse")
public class GetRentalByIdResponse {

    @XmlElement(required = true)
    protected Rental rental;

    /**
     * Gets the value of the rental property.
     * 
     * @return
     *     possible object is
     *     {@link Rental }
     *     
     */
    public Rental getRental() {
        return rental;
    }

    /**
     * Sets the value of the rental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rental }
     *     
     */
    public void setRental(Rental value) {
        this.rental = value;
    }

}
