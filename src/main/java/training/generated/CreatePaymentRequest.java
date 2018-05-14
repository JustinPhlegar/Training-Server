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
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="staff_id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rental_id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="payment_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "customerId",
    "staffId",
    "rentalId",
    "amount",
    "paymentDate"
})
@XmlRootElement(name = "createPaymentRequest")
public class CreatePaymentRequest {

    @XmlElement(name = "customer_id")
    protected long customerId;
    @XmlElement(name = "staff_id")
    protected long staffId;
    @XmlElement(name = "rental_id")
    protected long rentalId;
    protected float amount;
    @XmlElement(name = "payment_date", required = true)
    protected String paymentDate;

    /**
     * Gets the value of the customerId property.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the staffId property.
     * 
     */
    public long getStaffId() {
        return staffId;
    }

    /**
     * Sets the value of the staffId property.
     * 
     */
    public void setStaffId(long value) {
        this.staffId = value;
    }

    /**
     * Gets the value of the rentalId property.
     * 
     */
    public long getRentalId() {
        return rentalId;
    }

    /**
     * Sets the value of the rentalId property.
     * 
     */
    public void setRentalId(long value) {
        this.rentalId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

}
