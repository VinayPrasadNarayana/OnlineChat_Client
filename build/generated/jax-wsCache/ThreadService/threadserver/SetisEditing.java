
package threadserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setisEditing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setisEditing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="edit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setisEditing", propOrder = {
    "edit"
})
public class SetisEditing {

    protected String edit;

    /**
     * Gets the value of the edit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdit() {
        return edit;
    }

    /**
     * Sets the value of the edit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdit(String value) {
        this.edit = value;
    }

}
