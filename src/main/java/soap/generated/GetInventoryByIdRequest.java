//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.03 at 09:26:54 AM EDT 
//


package soap.generated;

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
 *         &lt;element name="inventory_id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "inventoryId"
})
@XmlRootElement(name = "getInventoryByIdRequest")
public class GetInventoryByIdRequest {

    @XmlElement(name = "inventory_id")
    protected long inventoryId;

    /**
     * Gets the value of the inventoryId property.
     * 
     */
    public long getInventoryId() {
        return inventoryId;
    }

    /**
     * Sets the value of the inventoryId property.
     * 
     */
    public void setInventoryId(long value) {
        this.inventoryId = value;
    }

}
